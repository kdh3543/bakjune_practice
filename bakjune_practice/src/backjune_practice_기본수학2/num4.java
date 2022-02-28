package backjune_practice_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class num4 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		List<Integer> arr = new ArrayList<>();

		for(int i = M; i <= N; i++) {
			int j = 2;

			for(j = 2; j < i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==i) {
				arr.add(i);
			}
		}

		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}
}
