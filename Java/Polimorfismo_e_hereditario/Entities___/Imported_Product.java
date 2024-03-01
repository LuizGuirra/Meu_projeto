package Entities___;

public class Imported_Product extends Product{
	
	private Double customsFee;
	
	public Imported_Product() {
		super();
	}
	public Imported_Product(String name, Double price, Double customsFre) {
		super(name, price);
		this.customsFee = customsFre;
	}
	public Double getCustomsFre() {
		return customsFee;
	}
	public void setCustomsFre(Double customsFre) {
		this.customsFee = customsFre;
	}
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	@Override
	public String priceTag() {
		return getName()
				  + " $ "
				  + String.format("%.2f", totalPrice())
				  + "(Customs fee: $ "
				  + String.format("%.2f", customsFee)
				  + ")";
	}
}
