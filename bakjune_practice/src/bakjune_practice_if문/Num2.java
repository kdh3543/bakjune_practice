package bakjune_practice_if¹®;

import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Grade = Integer.parseInt(sc.nextLine());


		if(Grade>=90&&Grade<=100) {
			System.out.println("A");
		}else if(Grade>=80&&Grade<=89) {
			System.out.println("B");
		}else if(Grade>=70&&Grade<=79) {
			System.out.println("C");
		}else if(Grade>=60&&Grade<=69) {
			System.out.println("D");
		}else 
			System.out.println("F");
	}
}
