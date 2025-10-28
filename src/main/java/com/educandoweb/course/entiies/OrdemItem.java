package com.educandoweb.course.entiies;

import java.io.Serializable;
import java.util.Objects;

import com.educandoweb.course.entiies.pk.OrdemItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrdemItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrdemItemPK id;
	
	private Integer quamtity;
	private Double price;
	
	public OrdemItem() {
	}

	public OrdemItem(Order order, Product product, Integer quamtity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quamtity = quamtity;
		this.price = price;
	}

	public Order getOrder() {
		return id.getOrder();
	}

	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		id.setProduct(product);
	}
	
	public Integer getQuamtity() {
		return quamtity;
	}

	public void setQuamtity(Integer quamtity) {
		this.quamtity = quamtity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
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
		OrdemItem other = (OrdemItem) obj;
		return Objects.equals(id, other.id);
	}
}
