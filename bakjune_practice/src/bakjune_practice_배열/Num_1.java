package bakjune_practice_¹è¿­;

import java.util.Scanner;

public class Num_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ea = Integer.parseInt(sc.nextLine());
		int[] test = new int[ea];
		for(int i = 0; i<ea; i++) {
			test[i] = Integer.parseInt(sc.nextLine());
		}
	
		for(int i = 0; i<ea-1;i++) {
			for(int j = 0; j<ea-1;j++) {
				if(test[i]>test[j+1]) {
				int tmp = test[i];
				test[i] = test[j+1];
				test[j+1] = tmp;
				}
			}		
		}
		int sum = 0;
		for(int i=0; i<ea;i++) {
			sum += (double)test[i]/test[ea-1]*100; 
		}
		double avg = (double)sum / ea;
		System.out.println(avg);
	}

}
