package bakjune_practice_���ڿ�;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		String N2 = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < N; i++) {
			char ch = N2.charAt(i);
			String change = Character.toString(ch);
			int a = Integer.parseInt(change);
			sum += a;
		}
		System.out.println(sum);
	}	
}
