package com.educandoweb.course.entiies;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String descripition;
	private Double price;
	private String ImgUrl;

	@ManyToMany
	@JoinTable(name = "tb_product_category",        // define o name da tabela que vai ter a associação da tabela produto e categoria 
	       joinColumns = @JoinColumn(name = "product_id"),   // chave estrangeira do produto que vai ser associada a categoria
	       inverseJoinColumns = @JoinColumn(name = "category_id"))  // chave estrangeira da categoria que vai ser associada ao produto
	private Set<Category> categories = new HashSet<>();

	public Product() {
	}

	public Product(Long id, String name, String descripition, Double price, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.descripition = descripition;
		this.price = price;
		ImgUrl = imgUrl;
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

	public String getDescripition() {
		return descripition;
	}

	public void setDescripition(String descripition) {
		this.descripition = descripition;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return ImgUrl;
	}

	public void setImgUrl(String imgUrl) {
		ImgUrl = imgUrl;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}	
}
