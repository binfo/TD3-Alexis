import java.util.Scanner;
import java.lang.*;
public class exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter an integer: ");
		
		Scanner reader = new Scanner (System.in);
		
		int a = reader.nextInt();
		
		System.out.println("Please enter another integer: ");
		
		Scanner reader2 = new Scanner (System.in);
		
		int b = reader2.nextInt();
		
		//System.out.println(a );
		//System.out.println(b );
		
		int c = a +b;
		
		int sign = (int)Math.signum(c);
		
		System.out.println("The sign of the product is: ");
		System.out.println(sign);
		
		
		
		
	}
		
		
			
		
		
		
	}


