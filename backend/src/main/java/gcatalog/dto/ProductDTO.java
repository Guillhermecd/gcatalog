package gcatalog.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import gcatalog.entity.Category;
import gcatalog.entity.Product;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Instant date;
    private Double price;
    private String imgUrl;

    private List<CategoryDTO> categories = new ArrayList<>();

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, Instant date, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        this(entity, entity.getCategories());
    }

    public ProductDTO(Product entity, Set<Category> categories) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.date = entity.getDate();
        this.price = entity.getPrice();
        this.imgUrl = entity.getImgUrl();

        if (categories != null) {
            categories.forEach(cat -> this.categories.add(new CategoryDTO(cat)));
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }
}
