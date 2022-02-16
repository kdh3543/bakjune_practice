package backjune_practice_Àç±Í;

import java.util.Scanner;

public class num2 {
	public static int sum(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		for(int i=0; i<n-1;i++) {
			sum = b+a;
			a=b;
			b=sum;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = sum(n);
		if(n==1) {
			System.out.println(1);
		}else {
			System.out.println(result);
		}
		
	}
}
