/*********************************************************************
 * Author : Shankar JAVA RND
 * Assignment-2-A : Method Overriding : Currency Conversion(Rupee, Dollar, Euro) 
 *********************************************************************/
import java.util.Scanner;
class Currency{//Parrent class
	double amount = 0;
	int ch = 0;
	public double conversion(double amount){
		return 0;
	}	
}

class Rupee extends Currency{ //child class of currency
	public Rupee(double amount, int ch) {
		this.amount = amount;
		this.ch = ch;
	}
	@Override
	public double conversion(double amount) {
		if (ch == 1)
		{
			System.out.println("\nRupees to Dollar Conversion : ");
			System.out.println("INR "+amount+" = "+"USD "+(amount/74));
		}
		else if (ch == 2)
		{
			System.out.println("\nRupees to Euro Conversion : ");
			System.out.println("\nINR "+amount+" = "+"EUR "+(amount/84));
		} 
	return 0;
	}
}

class Dollar extends Currency{//child class of currency
	public Dollar(double amount, int ch) {
		this.amount = amount;
		this.ch = ch;
	}
	
	@Override
	public double conversion(double amount) {
		if (ch == 3)
		{
			System.out.println("\nDollar to Rupees Conversion : ");
			System.out.println("USD "+amount+" = "+"INR "+(amount*74));
		}
		else if (ch == 4)
		{
			System.out.println("\nDollar to Euro Conversion : ");
			System.out.println("\nUSD "+amount+" = "+"EUR "+(amount*0.88));
		} 
	return 0;
	}
}

class Euro extends Currency{//child class of currency
	public Euro(double amount, int ch) {
		this.amount = amount;
		this.ch = ch;
	}

	@Override
	public double conversion(double amount) {
		if (ch == 5)
		{
			System.out.println("\nEuro to Rupees Conversion : ");
			System.out.println("EUR "+amount+" = "+"INR "+(amount*84));
		}
		else if (ch == 6)
		{
			System.out.println("\nEuro to Dollar Conversion : ");
			System.out.println("\nEUR"+amount+" = "+"USD "+(amount/0.88));
		} 
	return 0;
	}	
}

class CalculateCurrency{
	
	//CalculateCurrency Constructor
	public CalculateCurrency() {	
	callConversion();
	}
	
	//calling conversion method
	public void callConversion() {
		System.out.println("\n======================CURRENCY CONVERTOR======================");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("_________________________________________________________________");
			System.out.println("\nEnter 1 for Rupee to Dollar.\nEnter 2 for Rupee to Euro.\nEnter 3 for Dollar to Rupee.\nEnter 4 for Dollar to Euro.\nEnter 5 for Euro to Rupee.\nEnter 6 for Euro to Dollar.\nEnter 7 for Exit.");
			System.out.print("\nEnter Your Choice : ");
			int ch = sc.nextInt();
			System.out.print("\nEnter The Amount : ");
			double amount = sc.nextDouble();
			
			if(ch == 1 || ch == 2) {
				Rupee rc = new Rupee(amount, ch);
				rc.conversion(amount);
			} 
			else if(ch == 3 || ch == 4) {
				Dollar dc = new Dollar(amount, ch);
				dc.conversion(amount);
			}
			else if(ch == 5 || ch == 6) {
				Euro ec = new Euro(amount, ch);
				ec.conversion(amount);
			}
			else if(ch == 7) {
				System.exit(0);
			}
			else {
				System.out.println("Enter Correct choice!!!!");
			}
		}
	}
}

public class JavaAssignment2A {
	public static void main(String[] args) {
		CalculateCurrency cc = new CalculateCurrency();			
	}
}
