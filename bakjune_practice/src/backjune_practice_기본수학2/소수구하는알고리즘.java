package backjune_practice_�⺻����2;

import java.util.Scanner;

public class �Ҽ����ϴ¾˰��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i <= N; i++) {
			make_prime(i);
			
		}
	}
	
	public static void make_prime(int num) {
		if(num < 2) {
			return;
		}
		
		if(num == 2) {
			System.out.println(num);
			return;
		}
		//������ �Լ�: Math.sqrt()
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return;
			}
		}
		// �� �ݺ������� ����� ������ ���� �ʴ� ��� �Ҽ���.
		System.out.println(num);
		return;
	}

}
