package bakjune_practice_???ڿ?;

import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		char[] arr = new char[S.length()];
		
		int[] alpha = new int[26];
		for(int i = 0; i<alpha.length;i++) {
			alpha[i] = -1;
			
		}
		for(int i = 0; i<arr.length;i++) {
			arr[i] = S.charAt(i);
			
			for(int j=0;j<alpha.length;j++) {
				if((int)arr[i] == j+97) { // arr[0] = b, alpha[1] = b alpha
					if(alpha[j]==-1) {
					alpha[j] = i;
					}					
				}
			}
		}
		
		for(int i =0; i<alpha.length;i++) {
			System.out.print(alpha[i]+" ");
		}
		
	}	

}
