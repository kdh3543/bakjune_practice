package backjune_practice_기본수학2;

import java.io.IOException;
import java.util.Scanner;

public class num5 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}else {
				int count = 0;
				int sum = 0;
				for(int i = n+1; i <= 2*n; i++) {
					sum += make_prime(i,count);
				}
				System.out.println(sum);
			}
			
		}
		
	}
	
	public static int make_prime(int num, int count) {
		if(num < 2) {
			return 0;
		}
		
		if(num == 2) {
			
			return ++count;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {		
				return 0;
			}
		}
		
		
		return ++count;
	}
}
