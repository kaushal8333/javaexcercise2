package day4;

import java.util.Objects;

public class Product {
	Integer id;
	String name;
	Integer quantity;
	Double price;
	public Product(Integer id, String name,Integer quantity,Double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity=quantity;
		this.price=price;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, quantity);
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
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity);
	}
}
