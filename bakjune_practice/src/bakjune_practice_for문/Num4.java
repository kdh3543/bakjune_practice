package bakjune_practice_for??;

import java.util.Scanner;

public class Num4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int T = Integer.parseInt(sc.nextLine());
		for(int i = 0; i<=T;i++) {
			int A = Integer.parseInt(sc.nextLine());
			int B = Integer.parseInt(sc.nextLine());
			System.out.println(A + B);
		}
		
	}
}
