package bakjune_practice_ÇÔ¼ö;

import java.util.Scanner;

public class num3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count=0;

		if(N<100&N>=1){
			count=N;
		}else if(N>=100&&N<=1000) {
			count=99;
			for(int i =100;i<=N;i++) {
				int N1=i/100-i/10%10; // 0
				int N2=i/10%10-i%10; //-1
				if(N1==N2) {
					count++;
				}else
					continue;
			}
		}
		System.out.println(count);
	}

}
