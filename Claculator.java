package ganesh;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		//Javaprogramusingswithstatement
		
		Scanner sc=new Scanner(System.in);
		
		int num1,num2;
		System.out.println("Enter1st number");
		num1=sc.nextInt();
		
		System.out.println("Enter2nd number");
		num2=sc.nextInt();
		sc.nextLine();
		
		System.out.println("To perform operation enter a Operations Like(add,sub,mul,div):");
		String opertion = sc.nextLine().toLowerCase();
		
		switch(opertion) {
		
		case "add":
			System.out.println("Addtion performed and result is:"+(num1+num2));
			break;
		case "sub":
			System.out.println("Subtration performed and result is:"+(num1-num2));
			break;
		case "mul":
			System.out.println("Multiplication performed and result is :"+(num1*num2));
			break;
			
		case "div":
			System.out.println("Division perforemd and result is :"+(num1/num2));
			break;
		default:
			System.out.println("Invalid operation you entered");
			
			
		}
		sc.close();
		
		

	}

}
