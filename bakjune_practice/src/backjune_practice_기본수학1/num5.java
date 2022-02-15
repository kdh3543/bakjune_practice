package backjune_practice_기본수학1;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for(int i = 0; i<T; i++) {
			int x = 0;
			int y = 0;
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			if(N%H==0&&N/H<=1) {
				x=H*100;
				y=N/H;
			}else if(N%H==0&&N/H>1){
				x = H*100;
				y=N/H;
			}else {
				x = N%H*100;
				y = N/H+1;
			}
			System.out.println(x+y);
		}	
	}
}
