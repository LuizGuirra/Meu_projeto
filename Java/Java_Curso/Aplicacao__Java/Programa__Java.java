package Aplicacao__Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities__Enums.Order_Status;
import Entities__Java.Cliente;
import Entities__Java.Order_;
import Entities__Java.Order_Item;
import Entities__Java.Produto;

public class Programa__Java {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Cliente client = new Cliente(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		Order_Status status = Order_Status.valueOf(sc.next());
		
		Order_ order = new Order_(new Date(), status, client);
		
		System.out.println("How many items to this order? ");
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Produto product = new Produto(productName, productPrice);
			
			Order_Item it = new Order_Item(quantity, productPrice, product);
			
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}
}
