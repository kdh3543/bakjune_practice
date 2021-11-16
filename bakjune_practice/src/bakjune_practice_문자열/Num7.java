package bakjune_practice_¹®ÀÚ¿­;

import java.util.Scanner;

public class Num7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String str = sc.nextLine();
		String[] splitStr = str.split(" ");	
		int count = 0;
		
		for(int i = 0; i < splitStr.length;i++) {
			if(splitStr[i].equals("")) {
				count=0;
			}else {
				count++;
			}
		}
		System.out.println(count);
		
	}	
}