package backjune_practice_기본수학2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		List arr = new ArrayList();
		
		for(int i = M; i <= N; i++) {
			int j = 0;
			
			for(j = 2; j < i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==i) {
				arr.add(i);
			}
		}
		int sum = 0;
		for(int i = 0; i < arr.size(); i++) {
			sum += (int)arr.get(i);
		}
		
		if(arr.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(arr.get(0));
		}
		
	}

}
