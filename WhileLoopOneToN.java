package ganesh;

import java.util.Scanner;

public class WhileLoopOneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a value till you want to print:");
		int n;
		n=sc.nextInt();
		
		int i=1;
		
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		
		
		
		
		
		
	}

}
