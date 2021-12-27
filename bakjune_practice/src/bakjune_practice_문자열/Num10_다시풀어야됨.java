package bakjune_practice_문자열;

import java.util.Scanner;

public class Num10_다시풀어야됨 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] arr = new String[N];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextLine();
		}
		int count = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].length()<=2) {
				count = arr[i].length();
			}else if(arr[i].length()>2) {
				count++;
				for(int j = 0; j < arr[i].length();j++) {
					if(arr[i].charAt(j+1)<arr[i].length()) {
						if(arr[i].charAt(j)==arr[i].charAt(j+1)) {
							
						}else {
							
						}
					}
				}
			}
		}
	}
}