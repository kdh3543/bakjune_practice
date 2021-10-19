package bakjune_practice_for¹®;

import java.util.Scanner;

public class Num1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int N = Integer.parseInt(sc.nextLine());	
		for(int i = 0; i<9;i++) {
			System.out.println(N+" * "+(i+1)+" = "+N*(i+1));
		}
	}
}
