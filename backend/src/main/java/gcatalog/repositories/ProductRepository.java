package gcatalog.repositories;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gcatalog.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    default void deleteById(Long id) {
        Product product = findById(id)
                .orElseThrow(() -> new EmptyResultDataAccessException("No Product entity with id " + id + " exists", 1));
        delete(product);
    }
}
