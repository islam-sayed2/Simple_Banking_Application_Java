package Banking_Application;

import java.util.Scanner;

public class BankAccount {
	int balance;
	int prev_trans;
	String coust_name;
	String coust_id;
	
	BankAccount(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entr yor name");
		String name_in=scanner.next().toString();
		coust_name = name_in;
		System.out.printf("MR"+ name_in +"Entr yor id");
		String id_in=scanner.next().toString();
		coust_id = id_in;
		System.out.println("\n");
	}
	
	
public void	BankAccount(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entr yor name");
		String name_in=scanner.next().toString();
		coust_name = name_in;
		System.out.printf("MR"+ name_in +"Entr yor id");
		String id_in=scanner.next().toString();
		coust_id = id_in;
		System.out.println("\n");
	}
	


void deposit(int amount) { // ----> IntI deposit value

if (amount != 0) {
	balance = balance + amount;
	prev_trans = amount;
}
}

void withdraw(int amount) {
if (amount != 0) {
	balance = balance + amount;
	prev_trans = -amount;
}
}

void git_pre_trans(){
if (prev_trans > 0) {
	System.out.println("deposit" + prev_trans);
}else if (prev_trans < 0) {
	System.out.println( "withdraw" + Math.abs(prev_trans));
	
}else {
	System.out.println("no mony");
}
}
public void show_meuo() {
char option = '\0';


do {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome " + coust_name);
	System.out.println("Yor Id Is " + coust_id);
	System.out.println("-----------------");
	
	System.out.println("A. check Balnce");
	System.out.println("B.Deposit");
	System.out.println("c.withdraw");
	System.out.println("D. previous transaction");
	System.out.println("F. chang name && ID");
	System.out.println("E.EXIT");

		System.out.println("======================");
		System.out.println("Enter an option");
		System.out.println("======================");
		option = scanner.next().charAt(0);
		System.out.println("\n");

		switch (option) {
		case 'A': 
		System.out.println("----------------------");
		System.out.println("Balnce" + balance);
		System.out.println("----------------------");
		System.out.println("\n");
		break;
		
		case 'B': 
			System.out.println("----------------------");
			System.out.println("Enter amount to Deposit");
			System.out.println("----------------------");
			int amount = scanner.nextInt();
			deposit(amount);
			System.out.println("\n");
			break;
			
		case 'C': 
			System.out.println("----------------------");
			System.out.println("Enter amount to withdraw");
			System.out.println("----------------------");
			int amount2 = scanner.nextInt();
			withdraw(amount2);
			System.out.println("\n");
			break;
			
		case 'D': 
			System.out.println("----------------------");
			git_pre_trans();
			System.out.println("----------------------");
			System.out.println("\n");
			break;
			case 'E':
				System.out.println("****************************");
				break;
				
				case 'F':
					BankAccount();
					
					
			default :
				System.out.println("invaild option . \n");
				break;
		}
		
		
} 
while (option != 'E');
System.out.println("thank you");
}




}
