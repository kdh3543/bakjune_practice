package bakjune_practice_ÇÔ¼ö;

public class num2 {
	public static void main(String[] args) {
		int[] n = new int[10035];
		
		for(int i=1;i<n.length;i++) {
			n[i-1] = i;
		}
		
		for(int i=0;i<n.length;i++) {
			if(n[i]<10) {
				n[0]+=n[i];
				System.out.println(n[i]);
			}else if(n[i]>=10&&n[0]<100) {
				n[0]= n[i]+n[i]/10+n[i]%10;
				System.out.println(n[i]);
			}else if(n[i]>=100&&n[0]<1000) {
				n[0] = n[i]+n[i]/100+(n[i]/10)%10+n[i]%10;
				System.out.println(n[0]);
			}else if(n[i]>=1000&&n[0]<10000) {
				n[0] = n[i]+n[i]/1000+(n[i]/100)%10+(n[i]/10)%10+n[i]%10;
				System.out.println(n[0]);
			}
		}
		
		
	}

}
