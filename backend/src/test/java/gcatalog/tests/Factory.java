package gcatalog.tests;

import java.time.Instant;

import gcatalog.dto.ProductDTO;
import gcatalog.entity.Category;
import gcatalog.entity.Product;

public class Factory {
    public static Product createProduct() {
        Product product = new Product(1L, "Phone", "Test Description", Instant.parse("2020-04-05T00:00:00Z"), 10.0,
                "https://img.com/img.png");
        product.getCategories().add(new Category(2L, "Electronics"));
        return product;
    }

    public static ProductDTO createProductDTO() {
        Product product = createProduct();
        return new ProductDTO(product);
    }

}
