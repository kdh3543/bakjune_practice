package backjune_practice_기본수학1;

import java.util.Scanner;

public class num4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double V = sc.nextDouble();
		
		if(A==V) {
			System.out.println(1);
		}else {
			System.out.println((long)(Math.ceil((V-A)/(A-B))+1));
		}
	}
}
