package bakjune_practice_for??;

import java.util.Scanner;

public class Num11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int N = Integer.parseInt(sc.nextLine());
		int X = Integer.parseInt(sc.nextLine());
		for(int i = 0; i<N;i++) {
			for(int j = N;j<i+1;j++) {
			System.out.print(" ");
			}
			System.out.print("*");
		}		
	}
}
