
import java.util.Scanner;
public class exercise5 {

	
	public static double getNumber()
	{
		System.out.println("Please enter the first amount: ");
		
		Scanner reader = new Scanner(System.in);
		
		
		return reader.nextInt();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double userInput = getNumber();
	double taxcalc;
	double output;
	double amount1 = userInput;
	
	if (amount1 > 15001){
		taxcalc = amount1 - 15000;
		output = (taxcalc/100)*22 +3300;
		System.out.println("Tax payable on "+amount1+" is "+output+"");
	}
	else if (amount1 < 15000 && amount1 > 10001){
		taxcalc = amount1 - 10000;
		output = (taxcalc/100)*26 + 2000;
		System.out.println("Tax payable on "+amount1+" is "+output+"");
	}
	else taxcalc = amount1;
		output = (taxcalc/100)*20;
		System.out.println("Tax payable on "+amount1+" is "+output+"");
		
	
	}
	
	
	
	
	
	
		}
		
		
	


