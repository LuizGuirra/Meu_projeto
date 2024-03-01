package Entities___;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Used_Product extends Product{
	
	private LocalDate manufactureDate;
	
	public Used_Product() {
		super();
	}
	public Used_Product(String name, Double price, LocalDate manufacture) {
		super(name, price);
		this.manufactureDate = manufacture;
	}
	public LocalDate getManufacture() {
		return manufactureDate;
	}
	public void setManufacture(LocalDate manufacture) {
		this.manufactureDate = manufacture;
	}
	@Override
	public String priceTag() {
		return getName()
				+ " (used) $ "
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
}
