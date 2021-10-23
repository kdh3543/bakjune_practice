package bakjune_practice_while¹®;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = Integer.parseInt(sc.nextLine());
		int t = A;
		int count = 0;
		while(true) {
			int x = A/10;
			int y = A%10;
			int z = x+y;	
			A = 10*y+z%10; 
			count++;
			if(t == A) {
				System.out.println(count);
				break;
			}
		}
	}
}
