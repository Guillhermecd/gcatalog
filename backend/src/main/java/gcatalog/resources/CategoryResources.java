package gcatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gcatalog.entity.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L, "Electronics"));
        list.add(new Category(2L, "Books"));
        list.add(new Category(3L, "Computers"));
        return ResponseEntity.ok().body(list);
    }

}
