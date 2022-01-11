package backjune_practice_기본수학1;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T;i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int a = 0;
			int	sum = 0;
			for(int y=0;y<k;y++) {				
				for(int z=0;z<n;z++) {
					a++;
					sum+=a;
				}
				a=0;
			}
			System.out.println(sum);
		}
		
	}

}
