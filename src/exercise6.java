import java.util.Scanner;
public class exercise6



{

	public static int getFormat(){
		
		System.out.println("Please select time format but typing 12 or 24: ");
		
		Scanner formatInput = new Scanner (System.in);
		
		return formatInput.nextInt();
		
		
	}
	
	public static void formatTwelve(){
		//need to change this method to return the right type
	
		
		
		
	}
	
	public static void formatTwentyFour(){
		//need to change this method to return the right type
		System.out.println("You have selected format 24h");
		
		System.out.println("Please enter hours");
		
		Scanner hourInput = new Scanner (System.in);
		
		int hours = hourInput.nextInt();
		//recursive infinite loop here - fixed with break
		while (hours > 23){
			System.out.println("The number you have entered for hours was incorrect, you were killed by a grue");
			formatTwentyFour();
			break;
		}
		
		Scanner minuteInput = new Scanner (System.in);
		
		System.out.println("Please enter minutes");
		
		int minutes = minuteInput.nextInt();
		
		while (minutes > 59){
			System.out.println("The number of minutes you entered was invalid. You were killed by a grue");
			formatTwentyFour();
			break;
		}
		
		Scanner secondsInput = new Scanner (System.in);
		
		System.out.println("Please enter seconds");
		
		int seconds = secondsInput.nextInt();
		
		while (seconds > 59){
			System.out.println("The number of seconds you entered was invalid. You were killed by a grue");
			formatTwentyFour();
			break;
		}
		
		System.out.println("You entered "+hours+" "+minutes+" "+seconds+"");
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int formatSelection = getFormat();
		
		while (formatSelection != 12 && formatSelection != 24){
			
			formatSelection = getFormat();
			}
		
		if (formatSelection == 12){
			
			formatTwelve();
		}
		else {formatTwentyFour();
		
		}
		
		
		
		
		
		}
		
		
		
		
		
	}


