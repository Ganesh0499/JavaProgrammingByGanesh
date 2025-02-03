package ganesh;

import java.util.Scanner;

public class EvenNumbersTillN_usingWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter a number till you want even Numbers");
		num=sc.nextInt();
		
		int i=2;
		
		while(i<=num) {
			System.out.println(i);
			i +=2;
			
		}
		

	}

}
