package Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class next_permutation {
	static void go(int[] nArr){
		
		int m =0;
		for (int i = nArr.length-1; i >0 ; i--) {

			if (nArr[i]>nArr[i-1]) {
				m = i;
				break;
			}
			
		}

		if (m==0) {
			System.out.println("-1");
			
		}else{
			int j =999999999;
			for (int i = nArr.length-1; i >= m; i--) {
				if(nArr[m-1]<nArr[i]&&nArr[i]<j){
					j = i;
				}
			}
			int temp =0;
			temp = nArr[m-1];
			nArr[m-1] = nArr[j];
			nArr[j] = temp;
			
			// 거꾸로 배열      
			int[] reverseArr = new int[nArr.length-m];
			
			for (int i = nArr.length-1, j1=0; i >= m; i--, j1++) {
//				
				reverseArr[j1] = nArr[i];
				
			}
			
			for (int i = m, k = 0; i < nArr.length; i++, k++) {
				nArr[i] = reverseArr[k];
			}
			
//			return nArr;
		}				
	}

	public static void main(String[] args) {
		// 10972
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nArr = new int [n];
		for (int i = 0; i < n; i++) {
			nArr[i] = sc.nextInt();
		}
//		System.out.println(nArr[nArr.length-n-1]);
		go(nArr);

	}
}
