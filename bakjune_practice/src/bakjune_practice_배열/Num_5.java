package bakjune_practice_¹è¿­;

import java.util.Scanner;

public class Num_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}		
		int max = 0;
		int count = 0;	
		for(int i = 0; i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				count=i+1;
			}else {
				continue;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}
