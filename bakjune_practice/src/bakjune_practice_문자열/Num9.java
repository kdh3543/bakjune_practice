package bakjune_practice_¹®ÀÚ¿­;

import java.util.Scanner;
public class Num9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String t = sc.next();		
		int count = 0;

		for(int i = 0; i<t.length();i++) {
			char ch =t.charAt(i);
			if(ch=='c') {
				if(i<t.length()-1) {
					if(t.charAt(i+1)=='=') {
						i++;
					}else if(t.charAt(i+1)=='-') {
						i++;
					}
				}
		
			}else if(ch=='d') {
				if(i<t.length()-1) {
					if(t.charAt(i+1)=='z') {
						if(i<t.length()-2) {
							if(t.charAt(i+2)=='=') {
								i+=2;
							}
						}
					}else if(t.charAt(i+1)=='-') {
						i++;
					}
				}
				
			}else if(ch=='l'||ch=='n') {
				if(i<t.length()-1) {
					if(t.charAt(i+1)=='j') {
						i++;
					}
				}
				
			}else if(ch=='z'||ch=='s') {
				if(i<t.length()-1) {
					if(t.charAt(i+1)=='=') {
						i++;
					}
				}
				
			}
			count++;
		}
		System.out.println(count);
	}	
}