package bakjune_practice_for¹®;

import java.util.Scanner;

public class Num2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int T = Integer.parseInt(sc.nextLine());
		for(int i = 0; i<T;i++) {
			int	A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}
	}
}
