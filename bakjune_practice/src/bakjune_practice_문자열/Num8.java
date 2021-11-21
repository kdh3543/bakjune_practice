package bakjune_practice_¹®ÀÚ¿­;

import java.util.Scanner;

public class Num8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String num = sc.nextLine();
		int[] count = new int[num.length()];
		for(int i = 0; i< num.length();i++) {
			if(num.charAt(i)=='A'||num.charAt(i)=='B'||num.charAt(i)=='C') {
				count[i] = 3;
			}else if(num.charAt(i)=='D'||num.charAt(i)=='E'||num.charAt(i)=='F') {
				count[i] = 4;
			}else if(num.charAt(i)=='G'||num.charAt(i)=='H'||num.charAt(i)=='I') {
				count[i] = 5;
			}else if(num.charAt(i)=='J'||num.charAt(i)=='K'||num.charAt(i)=='L') {
				count[i] = 6;
			}else if(num.charAt(i)=='M'||num.charAt(i)=='N'||num.charAt(i)=='O') {
				count[i] = 7;
			}else if(num.charAt(i)=='P'||num.charAt(i)=='Q'||num.charAt(i)=='R'||num.charAt(i)=='S') {
				count[i] = 8;
			}else if(num.charAt(i)=='T'||num.charAt(i)=='U'||num.charAt(i)=='V') {
				count[i] = 9;
			}else if(num.charAt(i)=='W'||num.charAt(i)=='X'||num.charAt(i)=='Y'||num.charAt(i)=='Z') {
				count[i] = 10;
			}
		}
		int sum = 0;
		for(int i = 0; i<count.length;i++) {
			sum += count[i];
		}
		System.out.println(sum);
	}	
}