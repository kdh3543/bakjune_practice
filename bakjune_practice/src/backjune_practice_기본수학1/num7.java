package backjune_practice_기본수학1;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 5;
		int y = 3;
		int N = sc.nextInt();

		if(N%x==0) {
			System.out.println(N/x);
		}else {
			loop1:for(int i=N/x;i>=0;i--) {
				for(int j=1;j<N;j++) {
					if(x*i+y*j==N) {
						System.out.println(i+j);
						break loop1;
					}else if(i==0&&j==N-1&&y*j!=N){
						System.out.println(-1);
						break loop1;
					}
				}
			}
		}
	}
}
