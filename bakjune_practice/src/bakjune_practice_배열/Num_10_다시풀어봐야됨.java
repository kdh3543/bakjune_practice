package bakjune_practice_¹è¿­;

import java.util.Scanner;

public class Num_10_´Ù½ÃÇ®¾îºÁ¾ßµÊ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C =	sc.nextInt(); // 5
		double[] avg = new double[C]; // 5
		int N = 0;
		int[] score = null;
		for(int i =0;i<C;i++) {
			N = sc.nextInt(); // 5
			int sum = 0;
			score = new int[N]; // 5
			for(int j =0;j<score.length;j++) {
				score[j] = sc.nextInt(); // 50 50 70 80 100
				sum += score[j];  // sum = 50 100 170 250 350
				 
			}
			avg[i] = (double)sum/N; // avg[0] = 70.0
		}
		int[] result = new int[C]; // 5
		for(int i = 0; i<C;i++) {
			result[i] = 0; // result[0] = 0;
			for(int j =0; j<score.length;j++) {
				if(avg[i]<score[j] ) { // avg[0] < score[0]~score[4]
					result[i]++; // 70 <  
				}else {
					continue;
				}
			}
		}
		
		for(int i = 0; i<C;i++) {
			System.out.printf("%.3f",(double)result[i]/N*100);
			System.out.println("%");
		}


	}
}
