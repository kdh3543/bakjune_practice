package bakjune_practice_if??;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.nextLine());
		int Y = Integer.parseInt(sc.nextLine());
		if(X>0&&Y>0) {
			System.out.println("1");
		}else if(X>0&&Y<0) {
			System.out.println("4");
		}else if(X<0&&Y<0) {
			System.out.println("3");
		}else
			System.out.println("2");
	}
}
