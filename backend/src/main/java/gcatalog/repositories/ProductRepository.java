package gcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gcatalog.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    
}
