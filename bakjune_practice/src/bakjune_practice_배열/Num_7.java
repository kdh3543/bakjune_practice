package bakjune_practice_�迭;

import java.util.Scanner;

public class Num_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int count = 10;
		for(int i = 0;i<10;i++) {
			int A = sc.nextInt();
			arr[i] = A%42;
		}

		for(int i =0; i<9; i++) {
			for(int j=i+1;j<10;j++) {
				if(arr[i]==arr[j]) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
