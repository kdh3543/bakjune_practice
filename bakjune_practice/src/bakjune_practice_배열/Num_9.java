package bakjune_practice_?迭;

import java.util.Scanner;

public class Num_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =	Integer.parseInt(sc.nextLine());
		String[] test = new String[N];
		
		for(int i =0; i<test.length;i++) {
			test[i]=sc.nextLine();
		}
		
		int[] score = new int[N];	
		for(int i =0; i<test.length; i++) {
			int result = 0;
			for(int j = 0; j<test[i].length();j++){
				if(test[i].charAt(j)=='O') {
					result++;
					score[i] += result;
				}else if(test[i].charAt(j)=='X') {
					result=0;
				}else {
					continue;
				}
			}
		}
		
		for(int i = 0; i<test.length;i++) {
			System.out.println(score[i]);
		}
	}
}
