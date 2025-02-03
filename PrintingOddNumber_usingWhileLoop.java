package ganesh;

import java.util.Scanner;

public class PrintingOddNumber_usingWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number till you want to print odd number");
		num=sc.nextInt();
		int i=1;
		
		while(i<=num) {
			System.out.println(i);
			//i +=2;
			i=i+2;
		}

	}

}
