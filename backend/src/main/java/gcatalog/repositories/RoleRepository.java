package gcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gcatalog.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
