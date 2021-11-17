package bakjune_practice_¹®ÀÚ¿­;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		int[] R = new int[T];
		
		for(int i = 0; i<R.length;i++) {
			R[i]=sc.nextInt();//R[0]=3,R[1]=5
			
			String S=sc.nextLine();
			
			String[] arr = S.split("");
			
			for(int j = 1; j<arr.length;j++) {
				for(int k = 0; k<R[i];k++) {					
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
	}	
}