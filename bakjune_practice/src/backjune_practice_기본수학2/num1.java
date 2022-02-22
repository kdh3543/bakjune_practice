package backjune_practice_기본수학2;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for(int i = 0; i < N; i++) {
			int some = sc.nextInt();
			if(some==1) {
				continue;
			}else if((some!=2&&some!=3&&some!=5&&some!=7)&&(some%2==0||some%3==0||some%5==0||some%7==0)) {
				continue;
			}else {
				count++;
			}
		}
		System.out.println(count);

	}

}
