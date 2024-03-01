package Application_H;

import Entities_H.Account_H;
import Entities_H.BusinessAccount_H;
import Entities_H.SavingsAccount_H;

public class Programa_H {

	public static void main(String[] args) {
		
		Account_H acc1 = new Account_H(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account_H acc2 = new SavingsAccount_H(1002, "Kaike", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account_H acc3 = new BusinessAccount_H(1003, "João", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		System.out.println("------------------------------");
		
		Account_H x = new Account_H(1020,"Victoria",1000.0);
		Account_H y = new SavingsAccount_H(1023,"Lara",1000.0,0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		System.out.println("------------------------------");
		
		Account_H w = new Account_H(1024,"Levi",1000.0);
		Account_H z = new SavingsAccount_H(1019,"Luiz",1000.0,0.01);
		
		w.deposit(50.0);
		z.deposit(50.0);
		
		System.out.println(w.getBalance());
		System.out.println(z.getBalance());
		
	} 
}
