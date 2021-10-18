package bakjune_practice_if¹®;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = Integer.parseInt(sc.nextLine());
		int B = Integer.parseInt(sc.nextLine());
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else
			System.out.println("=");

	}
}
