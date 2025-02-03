package ganesh;

import java.util.Scanner;

public class CalulatorUisingCharInSwitchStatment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Enter a first number");
		num1=sc.nextInt();
		System.out.println("Enter a second number");
		num2=sc.nextInt();
		
		System.out.println("Enter a operation to perform(a=add,s=sub,m=mul,d=div):");
		char operation = sc.next().charAt(0);
		
		switch(operation) {
		case 'a':
			System.out.println("Addition"+(num1+num2));
			break;
			
		case 's':
			System.out.println("Subtration"+(num1-num2));
			break;
		case 'm':
			System.out.println("Multiplication"+(num1*num2));
			break;
			
		case 'd':
			System.out.println("Divison"+(num1/num2));
			break;
		
			default:
				System.out.println("invalid operation");
			
		}
		sc.close();
		
		

	}

}
