package bakjune_practice_배열;

import java.util.Scanner;

public class Num_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int num = A*B*C;
		int[] arr = new int[10];
		int[] tmp = new int[10];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = i;
			tmp[i] = 0;
		}
		int length = (int)(Math.log10(num)+1); // int형 정수 자리수 구하는 법
		for(int i = 0; i<length;i++) {
			int num2 = num%10;
			num /= 10;
			for(int j = 0; j<10;j++) {
				if(num2==arr[j]) {
					tmp[j]++;
				}
			}
		}
		
		for(int i = 0; i<10;i++) {
			System.out.println(tmp[i]);
		}
	}
}
