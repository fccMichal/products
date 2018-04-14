package pl.michalKozakiewicz1.products.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductForm {

        @NotNull
        @Size(min=2, max=30, message = "Name must have at least 2 signs")
        private String name;

        @NotNull
        @Size(min=5, message = "Description must have at least 5 signs")
        private String description;

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

    @Override
    public String toString() {
        return "ProductForm{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

