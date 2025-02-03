package ganesh;

import java.util.Scanner;

public class MonthOfDayAndName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number between 1 to 12");
		num=sc.nextInt();
		
		if(num==1) {
			System.out.println("The month is jan days contains by month is 31");
		}else if(num==2) {
			System.out.println("The month is feb days contains by month is 28");
		}else if(num==3) {
			System.out.println("The month is mar days contains by month is 31");
		}else if(num==4) {
			System.out.println("The month is Apr days contains by month is 30");
		}else if(num==5) {
			System.out.println("The month is may days contains by month is 31");
		}
		else if(num==6) {
			System.out.println("The month is june days contains by month is 30");
		}
		else {
			System.out.println("Invaid option please enter a valid month");
		}

	}

}
