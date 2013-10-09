import java.util.Scanner;

public class exercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Please enter an integer: ");
		
		Scanner reader = new Scanner(System.in);
		
		int a = reader.nextInt();
		
System.out.println("Please enter an integer: ");
		
		Scanner reader2 = new Scanner(System.in);
		
		int b = reader2.nextInt();
		
System.out.println("Please enter an integer: ");
		
		Scanner reader3 = new Scanner(System.in);
		
		int c = reader3.nextInt();
		
System.out.println("Please enter an integer: ");
		
		Scanner reader4 = new Scanner(System.in);
		
		int d = reader4.nextInt();
		
		int minimum = Math.min( Math.min( a, b ), Math.min( c, d ) );
		
		System.out.println( minimum);
		
		
		
		
		
	}

}
