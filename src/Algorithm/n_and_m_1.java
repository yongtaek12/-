package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class n_and_m_1 {
		// 수를 사용했으면 True 아니면 false 반환
	   	static boolean[] c = new boolean[10];
	   	//결과를 저장하는 배열
	    static int[] a = new int[10];
	    static StringBuilder sb = new StringBuilder();
	    
	    static void go(int index, int n, int m) {
	        if (index == m) {
	            for (int i=0; i<m; i++) {
	                sb.append(a[i]);
	                
	                if (i != m-1) sb.append(" ");
	            }
	            sb.append("\n");
	            return;
	        }
	        for (int i=1; i<=n; i++) {
	        	
	            if (c[i]) continue;
	            c[i] = true;
	            a[index] = i;

	            go(index+1, n, m);

	            c[i] = false;
	        }
	    }   
	public static void main(String[] args) {
		//15649
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        go(0,n,m);
        System.out.print(sb.toString());
		

	}
}
