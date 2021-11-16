package bakjune_practice_¹®ÀÚ¿­;

import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String A = sc.next();
		String B = sc.next();
		
		String[] A1 = A.split("");
		String[] B1 = B.split("");
		
		int A2 = Integer.parseInt(A1[2]+A1[1]+A1[0]);
		int B2 = Integer.parseInt(B1[2]+B1[1]+B1[0]);
		
		if(A2>B2) {
			System.out.println(A2);
		}else {
			System.out.println(B2);
		}
	}	
}