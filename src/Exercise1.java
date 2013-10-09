
import java.util.Scanner;
public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Please enter temperature: ");
		
		Scanner reader = new Scanner (System.in);
		
		int temp = reader.nextInt();
		
		if (temp <=0){
			System.out.println("Water at this temperature is a solid");
		}
		else if (temp > 0 && temp < 100) { 
			System.out.println("Water at this temperature is a liquid");
		}
		else if (temp > 100 ){
			System.out.println("Water at this temperature is a gas");
		}
		
		
		}
		
	}


