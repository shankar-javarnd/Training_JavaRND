/*********************************************************************
 * Author : Shankar JAVA RND
 * Assignment-2-B : Calculate Area of Shape Triangle, Rectangle, Square
 *********************************************************************/
import java.util.Scanner;
class Shape{
	float length, breadth, height, side; 
	public float calculateArea() {
		return 0;
	}
}

class Rectangle extends Shape {
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float calculateArea() {
		return length * breadth;
	}	
}

class Triangle extends Shape {
	public Triangle(float breadth, float height ) {
		this.breadth = breadth;
		this.height = height;
	}
	@Override
	public float calculateArea() {
		
		return ((breadth * height) / 2);
	}
}

class Square extends Shape {
	public Square(float side) {
		this.side = side;
	}
	@Override
	public float calculateArea() {
		return (side * side);
	}	
}

class CalculateArea {
	public CalculateArea() {
		calArea(); 
	}
	public void calArea() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("_________________________________________________________________");
			System.out.println("\n1. Rectangle\n2. Triangle\n3. Sqare\n4. Exit");
			System.out.print("\nEnter Your Choice : ");
			int ch = sc.nextInt();
			System.out.println("_________________________________________________________________");
			if (ch == 1) {
				
				System.out.print("Enter the length of Rectangle : ");
	            float length = sc.nextFloat();
	            System.out.print("Enter the width of Rectangle : ");
	            float width = sc.nextFloat();
	            
	            Rectangle ra = new Rectangle(length, width);
	            System.out.println("\nArea of Rectangle is : " + ra.calculateArea());
			}
			else if (ch == 2) {
				
	            System.out.print("Enter the width of Triangle : ");
	            float width = sc.nextFloat();
	            System.out.print("Enter the height of Triangle : ");
	            float height = sc.nextFloat();
	            
	            Triangle ta = new Triangle(width, height);
	            System.out.println("\nArea of Triangle is : " + ta.calculateArea());
			}
			else if (ch == 3) {
				
	            System.out.print("Enter the Side of Sqaure : ");
	            float side = sc.nextFloat();
	            
	            Square sa = new Square(side);
	            System.out.println("\nArea of Square is : " + sa.calculateArea());
			}
			else if (ch == 4) {
				System.exit(0);
			}
			else {
				System.out.println("Enter the Correct Choice!!!!");
			}
		}
	}
}

public class JavaAssignment2B {

	public static void main(String[] args) {
		System.out.println("\n=======================Shape AREA CALCULATION======================");
		CalculateArea ca = new CalculateArea();
	}

}
