package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderItem {

	private Product product;
	private Integer quantity;
	private Double price;

	public OrderItem(Integer quantity, Double price, Product product) {
		this.product = product;
		this.quantity = quantity;
		this.price = price;
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

	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return product.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}