package EY0509;

public class practice1 {
	
	class Product {
		private int id;
		private int quantity;
		private String pname;
		private int price;
		private String owner;
    public void Product(int id, int quantity, String pname, int price, String owner) {
    	this.id = id;
    	this.quantity = quantity;
		this.pname = pname;
		this.price = price;
	this.owner = owner;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	builder.append("Product [id=").append(id).append(", quantity=").append(quantity).append(", Pname=").append(Pname).append(", price=").append(price).append(", Owner=").append(Owner).append("]");
	}
}
