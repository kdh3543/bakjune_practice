package bakjune_practice_¹è¿­;

import java.util.Scanner;

public class Num_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] arr = new int[N];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}	
		System.out.println(arr[0]+" "+arr[N-1]);
	}
}
