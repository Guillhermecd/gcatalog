package gcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gcatalog.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
