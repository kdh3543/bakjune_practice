package bakjune_practice_if??;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.nextLine());
		int M = Integer.parseInt(sc.nextLine());
		
		M = M-45;
		if(H==0&&M<0) {
			H=24;
			System.out.println((H-1)+" "+(M+60));
		}else if(H>=0&&M>=0) {
			System.out.println(H+" "+M);
		}else if(H>0&&M<0) {
			System.out.println((H-1)+" "+(M+60));
		}
	}
}
