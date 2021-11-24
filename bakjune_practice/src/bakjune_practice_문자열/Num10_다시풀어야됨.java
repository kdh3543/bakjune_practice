package bakjune_practice_문자열;

import java.util.Scanner;

public class Num10_다시풀어야됨 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;
		boolean bool=false;
		String[] list = new String[num];
		for(int i = 0; i<list.length;i++) {
			list[i] = sc.nextLine();
		}
		
		for(int i = 0; i<list.length;i++) {
			ab:for(int j = 1; j<list.length-1;j++) {
				if(list[i].charAt(j)==list[i].charAt(j+1)) {
					bool=true;
					continue;
				}else {
					for(int k = 0; k<j;k++) {
						if(list[i].charAt(j+1)==list[i].charAt(k)) {
							bool=false;
							break;
						}else {
							bool=true;
							continue;
						}
					}
				}
				
			}
			if(bool) {
				count++;
			}else {
				continue;
			}
		}
		System.out.println(count);
		
	}	
}