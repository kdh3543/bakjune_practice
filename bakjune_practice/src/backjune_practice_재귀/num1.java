package backjune_practice_Àç±Í;

import java.util.Scanner;

public class num1 {

	public static int efunction(int n) {
		if(n<=1) {
			return 1;
		}else {
			return efunction(n-1)*n;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(efunction(n));

	}

}
