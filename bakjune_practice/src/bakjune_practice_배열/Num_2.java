package bakjune_practice_배열;

import java.util.Scanner;

public class Num_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("테스트 케이스의 개수: ");
		int ea = Integer.parseInt(sc.nextLine());

		String[] test = new String[ea];
		int[] sum = new int[ea];

		for(int i = 0 ; i<ea; i++) {
			test[i] = sc.nextLine();
			String[] str = test[i].split("");

			int count = 1;
			for(int j = 0; j < str.length; j++) {

				if(str[j].equals("O")) {
					sum[i] += count++;
				}else if(str[j].equals("X")) {
					count = 1;
				}else {
					System.out.println("잘못된 작성입니다.");
				}
			}
		}
		for(int i = 0; i<ea;i++) {
			System.out.println(sum[i]);
		}
	}
}
