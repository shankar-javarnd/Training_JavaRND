/**********************************************************************
 * Author : Shankar JAVA RND
 * Problem Statement :
 * Modify the Day Assignment 2 Set B. 
·         Make new Rectangle, Square & Triangle classes in which there
 		  will be an Inner class which will have methods for area calculation. 
 		  For example: Rectangle will have an inner class with method which 
 		  calculates area for Rectangle.

·         Make another inner class inside the above method which stores the 
          formulas for Area calculation. 

·         Make another static inner class which has an addArea static method. 
		  This method adds all the areas calculated thus far for Rectangle.
**********************************************************************/
import java.util.Scanner;

class Rectangle1 {
	class InRectangle { //Rectangle Inner Class
		public double calculateArea() {			
			class LocalRectangle{ //Local Inner Class
				double rectarea;
				public double calRectArea() {
					
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter the length of Rectangle : ");
		            float length = sc.nextFloat();
		            System.out.print("Enter the width of Rectangle : ");
		            float width = sc.nextFloat();
		        
		            System.out.println("\nArea of Rectangle is : " + (rectarea = (length * width)));
					return rectarea;
				}
			}
			LocalRectangle lra = new LocalRectangle();
			return (lra.calRectArea());
		}
	}	
}

class Triangle1 {
	class InTriangle { //Triangle Inner Class
		public double calculateArea() {			
			class LocalTriangle{ //Local Inner Class
				double triarea;
				public double calTriArea() {
					
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter the width of Triangle : ");
		            float width = sc.nextFloat();
		            System.out.print("Enter the height of Triangle : ");
		            float height = sc.nextFloat();
		           
		            System.out.println("\nArea of Triangle is : " + (triarea = ((width * height) / 2)));
					return triarea;
				}
			}
			LocalTriangle lta = new LocalTriangle();
			return (lta.calTriArea());
		}
	}	
} 

class Square1 {
	class InSquare { //Square Inner Class
		public double calculateArea() {			
			class LocalSquare{ //Local Inner Class
				double squarearea;
				public double calSquareArea() {
					
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter the Side of Sqaure : ");
		            float side = sc.nextFloat();
		            
		            System.out.println("\nArea of Square is : " + (squarearea = (side * side)));
					return squarearea;
				}
			}
			LocalSquare lsa = new LocalSquare();
			return (lsa.calSquareArea());
		}
	}	
}

public class JavaAssignment3B {
	//inner static class for addition of all Areas
	static class AddAreas {
		public static void addArea(double rectangle, double triangle, double square) {
			System.out.println("\nTotal Addition of all Shape Areas = "+(rectangle + triangle + square)); 
		}
	}
	
	public static void main(String[] args) { // main method
		System.out.println("\n=============Shape Area Calculations============");
		double rectangle, triangle, square;
		Scanner sc = new Scanner(System.in);
		//System.out.print("\nEnter The Amount : ");
		//double amount = sc.nextDouble();
		
		System.out.println("______________________________________________");
		Rectangle1 ra = new Rectangle1(); 
		Rectangle1.InRectangle ira = ra.new InRectangle();
		rectangle = ira.calculateArea();
		System.out.println("_______________________________________________");
		
		Triangle1 ta = new Triangle1(); 
		Triangle1.InTriangle ita = ta.new InTriangle();
		triangle = ita.calculateArea();
		System.out.println("_______________________________________________");
		
		Square1 sa = new Square1(); 
		Square1.InSquare isa = sa.new InSquare();
		square = isa.calculateArea();
		System.out.println("_______________________________________________");
		JavaAssignment3B.AddAreas.addArea(rectangle, triangle, square);;
		System.out.println("_______________________________________________");
	}
}
