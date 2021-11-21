package bakjune_practice_¹®ÀÚ¿­;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] alpha = new int[26];
		char[] arr = new char[str.length()];
		int[] count = new int[26];
		
		for(int i = 0; i<alpha.length;i++) {
			alpha[i] = i;
			count[i] = 1;
		}
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < alpha.length; j++) {
				if((int)str.charAt(i)==alpha[j]+65||(int)str.charAt(i)==alpha[j]+97) {
					count[j]++;
				}
			}
		}
		int num = count[0];
		for(int i = 1; i<alpha.length;i++) {
			for(int j = i+1; j< alpha.length;j++) {
				
			}
			System.out.println(i+ " : "+ count[i]);
		}
	}	
}