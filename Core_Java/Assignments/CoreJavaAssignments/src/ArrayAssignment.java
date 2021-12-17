import java.util.Scanner;
public class ArrayAssignment {
	
	public static void main(String[] args) {
		int i, k, n;
		double t;
		
		Scanner sc = new Scanner(System.in);
		double[] a = {10.1, 20.2, 30.3, 40.4, 50.5, 60.6, 70.7, 80.8, 90.9, 100.10 };
		
		n = a.length;
		System.out.println("\n___________________________________________________________");
		System.out.println("\nOriginal array is: \n");
        for (k = 0; k < n; k++) {
            System.out.print(a[k] + ", ");
        }
        System.out.println("\n___________________________________________________________");
        for (i = 0; i < n / 2; i++) { //reversing the order of array
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
  
        // printing the reversed array
        System.out.println("\nReversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.print(a[k] + ", ");
        }
        System.out.println("\n___________________________________________________________");
	}

}
