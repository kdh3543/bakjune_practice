package bakjune_practice_ÀÔÃâ·Â;

import java.util.Scanner;

public class Num_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A*(B%10));
		System.out.println(A*((B/10)%10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
	}
}
