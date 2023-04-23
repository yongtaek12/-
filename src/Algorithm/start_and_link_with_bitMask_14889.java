package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class start_and_link_with_bitMask_14889 {
	/*
	 * 스타트와 링크 비트마스크로 해결
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] s = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				s[i][j] = sc.nextInt();
			}
		}
        int ans = -1;

		for (int i = 1; i < (1<<n); i++) {
			ArrayList<Integer> first = new ArrayList<>();
			ArrayList<Integer> second = new ArrayList<>();
			for (int k = 0; k < n; k++) {
                if ((i&(1<<k)) != 0) {
                	first.add(k);
                }else{
                	second.add(k);
                }
			}
	        int t1 = 0;
            int t2 = 0;
			if(first.size()==n/2&&second.size()==n/2){
				for (int j = 0; j < first.size(); j++) {
					for (int j2 = 0; j2 < first.size(); j2++) {
	                    if (j == j2) continue;
	                    t1 += s[first.get(j)][first.get(j2)];
	                    t2 += s[second.get(j)][second.get(j2)];
					}
				}
	            int diff = Math.abs(t1-t2);
	            if(ans ==-1|| ans>diff){
	            	ans = diff;
	            }
			}
		}
        System.out.println(ans);
	}
}
