package gcatalog.services.validation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import gcatalog.dto.UserInsertDTO;
import gcatalog.entity.User;
import gcatalog.repositories.UserRepository;
import gcatalog.resources.exceptions.FieldMessage;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserInsertValidator implements ConstraintValidator<UserInsertValid, UserInsertDTO> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void initialize(UserInsertValid ann) {
    }

    @Override
    public boolean isValid(UserInsertDTO value, ConstraintValidatorContext context) {
        // Implement your validation logic here
        List<FieldMessage> list = new ArrayList<>();

        User user = userRepository.findByEmail(value.getEmail());
        if (user != null) {
            list.add(new FieldMessage("email", "Email already exists"));
        }

        // Add your custom validation logic here

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage())
                    .addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }

        return list.isEmpty();
    }
}
