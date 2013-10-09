import java.util.Scanner;
import java.util.Arrays;

public class exercise4 {

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
		
	int[] Array;
	
	Array = new int [3];
	
	Array[0] = a;
	
	Array[1] = b;
	
	Array[2] = c;
	
	Arrays.sort(Array);
	
	int i;
	
	for (i=0; i < Array.length; i++) {System.out.println("num:" + Array[i]);
	
	}
	
	
		
		
	}

}
