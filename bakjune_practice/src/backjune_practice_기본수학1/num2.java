package backjune_practice_�⺻����1;

import java.util.Scanner;

public class num2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//1, 6, 12, 18,24
		//1,7,19,37,61
		int i = 0;
		int sum = 1;
		while(true) {
			sum += 6*i;
			if(N>sum) {
				i++;
				continue;
			}else {
				break;
			}
			
		}
		System.out.println(i+1);
	}
}
