package ganesh;

import java.util.Scanner;

public class MonthOfDaysUsingSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num;
		num=sc.nextInt();
		
		switch(num) {
		case 1: System.out.println("The month is jan days contains by month is 31");
		break;
		case 2: System.out.println("The month is feb days contains by month is 28");
		break;
		case 3: System.out.println("The month is mar days contains by month is 31");
		break;
		case 4: System.out.println("The month is apr days contains by month is 30");
		break;
		case 5: System.out.println("The month is may days contains by month is 31");
		break;
		default : System.out.println("Invalid option enter a valid input");
		break;
		}
		System.out.println("Ganesh");
		

	}

}
