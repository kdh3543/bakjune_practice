package backjune_practice_기본수학2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 2; i <= N; i++) {
			if(N%i==0) {
				System.out.println(i);	
				N = N/i;			
				i=1;				
			}
			if(N==1) {
				break;
			}
			
		}
	}
}
