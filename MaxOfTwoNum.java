package ganesh;

import java.util.Scanner;

public class MaxOfTwoNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Enter a first number");
		num1=sc.nextInt();
		
		System.out.println("Enter a second number");
  		num2=sc.nextInt();
  		if(num1>num2) {
  		System.out.println("your no. is max no."+num1);
  		}
  		else {
  		System.out.println("your no. is max no."+num2);
  		}
		
		

	}

}
