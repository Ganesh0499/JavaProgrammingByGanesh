package ganesh;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a num");
		num=sc.nextInt();
		if(num % 5==0) {
		System.out.println("Your no. is divisible by 5");
		}else {
		System.out.println("Your no. is not divisible by 5");
		}
		
		
	}

}
