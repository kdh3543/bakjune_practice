package bakjune_practice_�迭;

import java.util.Scanner;

public class Num_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int[] avg = new int[N];
		for(int i = 0; i<N;i++) {
			avg[i] = sc.nextInt();
		}
		
		for(int i = 0; i<N-1;i++) {
			if(avg[i]>avg[i+1]) {
				int tmp = avg[i+1];
				avg[i+1] = avg[i];
				avg[i] = tmp;
			}
		}
	
		double[] newavg = new double[N];
		double sum = 0;
		for(int i = 0; i<N;i++) {
			newavg[i] = (double)avg[i]/avg[N-1]*100;
			sum += newavg[i];
		}
		
		System.out.println((double)sum/N);
	}
}
