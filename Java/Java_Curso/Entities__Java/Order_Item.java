package Entities__Java;

public class Order_Item {
	
	private Integer quantity;
	private Double price;
	
	private Produto product;
	
	public Order_Item() {
	}

	public Order_Item(Integer quantity, Double price, Produto product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
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
	public Produto getProduct() {
		return product;
	}
	public void setProduct(Produto product) {
		this.product = product;
	}
	public double subTotal() {
		return price * quantity;
	}
	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", SubTotal: $"
				+String.format("%.2f", subTotal());
	}
}
