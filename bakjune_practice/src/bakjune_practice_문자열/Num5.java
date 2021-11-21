package bakjune_practice_¹®ÀÚ¿­;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] alpha = new int[26];
		int[] count = new int[26];

		for(int i = 0; i<alpha.length;i++) {
			alpha[i] = i;
			count[i] = 0;
		}

		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < alpha.length; j++) {
				if((int)str.charAt(i)==alpha[j]+65||(int)str.charAt(i)==alpha[j]+97) {
					count[j]++;
				}
			}
		}
		boolean bool = true;
		int num = count[0];
		for(int i = 1; i<alpha.length;i++) {
			if(num>count[i]) {
				continue;
			}else if(num<count[i] ) {
				num=count[i];
				bool=true;
			}else{
				bool = false;
			}
		}
		for(int i = 0;i<alpha.length;i++) {
			if(num==count[i] ) {
				num=alpha[i];
				break;
			}
		}
		if(bool==false) {
			System.out.println("?");
		}else {		
			System.out.println((char)(num+65));
		}
		
	}	
}