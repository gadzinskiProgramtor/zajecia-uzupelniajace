package pl.gadzinski.hexagonal.domain;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private ProductCategory category;
    private Double weight;

    public Product(String name, String description, ProductCategory category, Double weight) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.weight = weight;
    }
}
