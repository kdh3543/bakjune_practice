package backjune_practice_기본수학2;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for(int i = 0; i < N; i++) {
			int number = sc.nextInt();
			int j=0;
			for(j = 2; j < number; j++) {
				if(number%j==0) {
					break;
				}
			}
			if(j==number) {
				count++;
			}
		}
		System.out.println(count);
	}

}
