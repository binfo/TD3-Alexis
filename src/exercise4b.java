import java.util.Scanner;


public class exercise4b {

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
		
		if (a < b){
			if (a < c){
				if (b < c)
				{
				System.out.println(""+a+" "+b+" "+c+"");
				}
			else{
				System.out.println(""+a+" "+c+" "+b+"");
				}
			}
				else
				{
					System.out.println(""+c+" "+a+" "+b+"");
				}
			} 
			else {
				if (b < c) 
				{
				if (a < c) 
				{
				System.out.println(""+b+" "+a+" "+c+"");
				}
				else 
				{ 
				System.out.println(""+b+" "+c+" "+a+"");
				}
				
				}
			
			else { 
				System.out.println(""+c+" "+b+" "+a+"");
				}
		}
	}
		
		
		 
		 
		}
		
	
	
