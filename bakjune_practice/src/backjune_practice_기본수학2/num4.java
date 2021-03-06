package backjune_practice_?⺻????2;

import java.io.IOException;
import java.util.Scanner;

public class num4 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for(int i = M+1; i <= N; i++) {
			make_prime(i);
		}
	}
	
	public static void make_prime(int num) {
		if(num < 2) {
			return;
		}
		
		if(num == 2) {
			System.out.println(num);
			return;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return;
			}
		}
		
		System.out.println(num);
		return;
	}
}
