package bakjune_practice_if��;

import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yun = Integer.parseInt(sc.nextLine());
		if(yun%4==0&&(yun%100!=0||yun%400==0)) {
			System.out.println("1");
		}else
			System.out.println("0");
	}
}
