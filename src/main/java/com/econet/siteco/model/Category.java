package com.econet.siteco.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
@Table(name="tower_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryId;
    @NotNull
    private String categoryName;
    private String description;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
