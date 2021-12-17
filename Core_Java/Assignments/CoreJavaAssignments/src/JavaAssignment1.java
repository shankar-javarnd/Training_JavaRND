/**************************************************************************************
 * Author : Shankar Thombare JAVA RND
 * Core Java Assignment-1
 * SET A
 * Create a program for a Car shop to calculate the no of cars sold. 
 * Car class has three attributes: speed (int), car owner (String), car type (String).
 * Write methods to get and set above values of the car object. Also devise a way to 
 * calculate the number of cars sold by the car shop.
******************************************************************************************/
import java.util.Scanner;
class CarShop {
	//Variable Declaration
	private int speed = 0;
	private String car_owner = null;
	private String car_type = null;
	private String car_status = null;
	
	//getter method for car status
	public String getCar_status() {  
		return car_status;
	}
	//setter method for car status
	public void setCar_status(String car_status) {
		this.car_status = car_status;
	}
	//getter method for speed
	public int getSpeed() {  
		return speed;
	}
	//setter method for speed
	public void setSpeed(int speed) {  
		this.speed = speed;
	}
	//getter method for car owner
	public String getCar_owner() {  
		return car_owner;
	}
	//setter method for car owner 
	public void setCar_owner(String car_owner) { 
		this.car_owner = car_owner;
	}
	//getter method for car type
	public String getCar_type() {  
		return car_type;
	}
	//setter method for car type
	public void setCar_type(String car_type) {  
		this.car_type = car_type;
	}
	
}
public class JavaAssignment1 {
	//method for calculate the number of cars sold by the car shop.
	public static void calStatus(CarShop[] cs) {
		int sflag = 0;   //sold car flag
		int uflag = 0;   //Unsold car flag

		for (int i = 0; i < cs.length; i++ ) {
			if(cs[i].getCar_status().equals("sold")) {
				sflag++;
			} 
			else {
				uflag++;
			}
		}
		System.out.println("\n\nTotal Number of cars = "+cs.length+"\nNumber of Car Sold   = "+sflag+"\nNumber of Car UnSold = "+uflag);
			
	}
	//main method
	public static void main(String[] args) {
		CarShop[] cs = new CarShop[5]; //car shop array object
		Scanner sc = new Scanner(System.in); //scanner class object
		
		System.out.println("\n====================CAR SHOP=====================");
		System.out.println("Enter Car Details : ");
		//setting the values using setter method
		for (int i = 0; i < 5; i++) {
			cs[i] = new CarShop();
			System.out.print("\nEnter the speed of Car : ");
			cs[i].setSpeed(sc.nextInt());
			System.out.print("Enter the Type of Car : ");
			cs[i].setCar_type(sc.next());
			System.out.print("Enter the Owner of Car : ");
			cs[i].setCar_owner(sc.next());
			System.out.print("Enter the Staus of Car (sold/unsold) : ");
			cs[i].setCar_status(sc.next());	
		}
		sc.close();
		System.out.println("\n======================CAR DETAILS======================");
		System.out.println("_________________________________________________________________");
		System.out.println("\n|Car Type\t|Car Speed\t|Car Owner\t|Car Status\t|");
		System.out.println("_________________________________________________________________");
		//printing the values using getter method
		for (int i = 0; i < cs.length; i++ ) {
			System.out.print("\n"+cs[i].getCar_type()+"\t\t   "+cs[i].getSpeed()+"\t\t"+cs[i].getCar_owner()+"\t\t   "+cs[i].getCar_status());
		}
		System.out.println("\n_________________________________________________________________");
		//calling status calculation method
		calStatus(cs);
	}
}
