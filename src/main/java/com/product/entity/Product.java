package com.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]+", message = "ID should contain alphanumeric characters")
	private String id;
	@NotBlank
	@Pattern(regexp = "[a-zA-Z]+", message = "Item name should consist of alphabets only")
	private String item;
	@NotBlank
	private String name;
	@NotBlank
	private String category;

	public Product() {
			
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", item=" + item + ", name=" + name + ", category=" + category + "]";
	}
	
	
	
	

}
