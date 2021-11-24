package bakjune_practice_¹®ÀÚ¿­;

import java.util.Scanner;
public class Num9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String t = sc.next();		
		int count = 1;
		
		for(int i = 1; i<t.length();i++) {
			count++;
			if(t.charAt(i)=='=') {
				if(t.charAt(i-1)=='z') {
					count--;
					if(t.charAt(i-2)=='d') {
						count--;
					}
				}else if(t.charAt(i-1)=='s'||t.charAt(i-1)=='c') {
					count--;
				}
			}else if(t.charAt(i)=='-') {
				if(t.charAt(i-1)=='c'||t.charAt(i-1)=='d') {
					count--;
				}
			}else if(t.charAt(i)=='j') {
				if(t.charAt(i-1)=='n'||t.charAt(i-1)=='l') {
					count--;
				}
			}
		}
		System.out.println(count);
	}	
}