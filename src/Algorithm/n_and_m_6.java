package Algorithm;

import java.util.Scanner;

public class n_and_m_6 {
	static StringBuilder sb = new StringBuilder();
	static int a[] = new int [10];
	static boolean c[] = new boolean [10];
	static void go(int index, int start, int n, int m, int nArr[])
	{
		if(index ==m){
			for (int i = 0; i < m; i++) {
				sb.append(a[i]);
//				System.out.println(a[i]);
				if(i!=m-1) sb.append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = start; i < n; i++) {
			if(c[i]==true)continue;
			c[i] =true;
			a[index] =nArr[i];
			go(index+1,i+1, n, m, nArr);
			c[i] = false;
		}
		
	}
	public static void main(String[] args) {
		// 15654

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] nArr = new int [n];
		
		for (int i = 0; i < n; i++) {
			nArr[i] = sc.nextInt();
		}
		
		int tmp =0;
		for (int i = 0; i < nArr.length; i++) {
			for (int j = i+1; j < nArr.length; j++) {
				if(nArr[i]>nArr[j]){
					tmp = nArr[i];
					nArr[i] = nArr[j];
					nArr[j] = tmp;
				}
			}
		}

		go(0, 0,n, m, nArr);
		System.out.println(sb.toString());
//		
	}

}
