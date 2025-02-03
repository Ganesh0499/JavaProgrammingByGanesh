package ganesh;

import java.util.Scanner;

public class CheckingOddOrEvenNum {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a Number:");
		
		num=sc.nextInt();
		
		
		if(num %2==0) {
		System.out.println("even number");
		}
		else {
		System.out.println("Odd number");
		}
		
	}

}
