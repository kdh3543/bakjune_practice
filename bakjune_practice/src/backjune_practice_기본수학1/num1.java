package backjune_practice_기본수학1;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		if(C-B>0) {
			if(A%(C-B)>0||A%(C-B)==0) {
				A=A/(C-B)+1;
			}
		}else {
			A=-1;
		}
		
		System.out.println(A);
	}
}
