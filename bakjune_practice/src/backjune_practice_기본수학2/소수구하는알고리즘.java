package backjune_practice_기본수학2;

import java.util.Scanner;

public class 소수구하는알고리즘 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i <= N; i++) {
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
		//제곱근 함수: Math.sqrt()
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return;
			}
		}
		// 위 반복문에서 약수를 가지고 있지 않는 경우 소수다.
		System.out.println(num);
		return;
	}

}
