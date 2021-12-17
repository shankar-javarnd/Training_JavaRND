/**********************************************************************
 * Author : Shankar JAVA RND
 * Problem Statement :
 * 1.  Modify the  Assignment 2 Set A
·      Make new Rupee, Dollar & Euro class in which there will be 
	   an Inner class which will have methods for conversion to 
	   other currencies. For example: Rupee will have an inner class 
	   with methods which converts Amount to Dollar & Euro.

·      Make another inner class inside the above method which stores 
	   the rates for currency conversion. 

·      Make another static inner class which has an addAmount static 
       method. This method adds all the amount passed for 
       Rupee/Dollar/Euro.
**********************************************************************/
import java.util.Scanner;

class Rupee1 {
	class InRupee { //Rupee Inner Class
		public double conversion(double amount) {			
			class LocalRupee{ //Local Inner Class
				double rd, re;
				public double rupeeToDollar() {
					System.out.println("\nRupees to Dollar Conversion : ");
					System.out.println("INR "+amount+" = "+"USD "+(rd = amount/74));
					return rd;
				}
				public double rupeeToEuro() {
					System.out.println("\nRupees to Euro Conversion : ");
					System.out.println("INR "+amount+" = "+"EUR "+(re = amount/84));
					return re;
				}
			}
			LocalRupee lrc = new LocalRupee();
			return (lrc.rupeeToDollar()) + (lrc.rupeeToEuro());
		}
	}	
}

class Dollar1 {
	class InDollar { // Dollar Inner class
		public double conversion(double amount) {
			class LocalDollar{ //Local Inner Class
				double dr, de;
				public double dollarToRupee() {
					System.out.println("\nDollar to Rupees Conversion : ");
					System.out.println("USD "+amount+" = "+"INR "+(dr = amount*74));
					return dr;
				}
				public double dollarToEuro() {
					System.out.println("\nDollar to Euro Conversion : ");
					System.out.println("USD "+amount+" = "+"EUR "+(de = amount*0.88));
					return de;
				}
			}
			LocalDollar ldc = new LocalDollar();
			return (ldc.dollarToRupee() + ldc.dollarToEuro());
		}
	}
} 

class Euro1 {
	class InEuro { // Inner Euro class
		public double conversion(double amount) {
			class LocalEuro{ // Local Inner Class
				double er, ed;
				public double euroToRupee() {
					System.out.println("\nEuro to Rupees Conversion : ");
					System.out.println("EUR "+amount+" = "+"INR "+(er = amount*84));
					return er;
				}
				public double euroToEuro() {
					System.out.println("\nEuro to Dollar Conversion : ");
					System.out.println("EUR "+amount+" = "+"USD "+(ed = amount/0.88));
					return ed;
				}
			}
			LocalEuro lec = new LocalEuro();
			return (lec.euroToRupee() + lec.euroToEuro());
		}
	}		
}

public class JavaAssignment3A {
	//inner static class for addition of all currency
	static class AddCurrency {
		public static void addAmount(double rupee, double dollar, double euro) {
			System.out.println("\nTotal Addition of all converted Currency = "+(rupee + dollar + euro )); 
		}
	}
	
	public static void main(String[] args) { // main method
		System.out.println("\n=============CURRENCY CONVERSION============");
		double rupee, dollar, euro;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter The Amount : ");
		double amount = sc.nextDouble();
		
		System.out.println("______________________________________________");
		Rupee1 rc = new Rupee1(); 
		Rupee1.InRupee irc = rc.new InRupee();
		rupee = irc.conversion(amount);
		System.out.println("_______________________________________________");
		
		Dollar1 dc = new Dollar1(); 
		Dollar1.InDollar idc = dc.new InDollar();
		dollar = idc.conversion(amount);
		System.out.println("_______________________________________________");
		
		Euro1 ec = new Euro1(); 
		Euro1.InEuro iec = ec.new InEuro();
		euro = iec.conversion(amount);
		System.out.println("_______________________________________________");
		JavaAssignment3A.AddCurrency.addAmount(rupee, dollar, euro);
		System.out.println("_______________________________________________");
	}
}
