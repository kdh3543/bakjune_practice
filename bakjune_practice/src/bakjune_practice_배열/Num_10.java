package bakjune_practice_?迭;

import java.util.Scanner;

public class Num_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C =	sc.nextInt(); // 5
		int[] N = new int[C]; // 5
		double[] avg = new double[C];
		double[] result = new double[C];
		for(int i = 0; i < C; i++) {
			N[i] = sc.nextInt(); // N[0]=5,N[1]=7,N[2]=3,N[3]=3,N[4]=9
			int sum = 0;
			int score[] = new int[N[i]];
			for(int j = 0; j<N[i];j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avg[i] = (double)sum/N[i];

			result[i] = 0;
			for(int m = 0; m < N[i];m++) {
				if(avg[i]<score[m]) {
					result[i]++;
				}
			}
		}
		for(int i = 0;i<C;i++) {
			System.out.printf("%.3f",(double)result[i]/N[i]*100);
			System.out.println("%");
		}
	}
}
