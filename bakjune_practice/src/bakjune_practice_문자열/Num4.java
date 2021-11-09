package bakjune_practice_¹®ÀÚ¿­;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] R = new int[T];
		for(int i = 0; i<R.length;i++) {
			R[i]=sc.nextInt();
			sc.nextLine();
			String S = sc.next();
			for(int j = 0; j<R[i];j++) {
				for(int k = 0; k<R[i];k++) {
					System.out.print(S.charAt(j));
				}
			}
		}
	}	
}