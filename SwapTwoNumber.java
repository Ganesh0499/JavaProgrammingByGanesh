package ganesh;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		int temp=0;
		
		System.out.println("Enter no. 1");
		num1=sc.nextInt();
		
		System.out.println("Enter no.2");
		num2=sc.nextInt();
		
		System.out.println("before Swap");
		System.out.println(num1);
		System.out.println(num2);
		
		
		temp = num1;
        num1 = num2;
        num2 = temp;
		System.out.println("After swap");
		
		System.out.println(num1);
		System.out.println(num2);
		

	}

}
