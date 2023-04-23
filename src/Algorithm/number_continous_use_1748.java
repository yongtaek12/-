package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_continous_use_1748 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//수 이어쓰기
		BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
		
		int n = Integer.valueOf(bf.readLine());
		
//		System.out.println((int)Math.log10(t)+1);
		long ans=0;
        for (int start=1, len=1; start<=n; start*=10, len++) {
            int end = start*10-1;
            if (end > n) {
                end = n;
            }
            System.out.println("end : " + end);

            ans += (long)(end - start + 1) * len;
        	System.out.println("ans : " + ans);

        }
        System.out.println(ans);

	}

}
