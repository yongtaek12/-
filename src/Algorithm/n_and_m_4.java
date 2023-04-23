package Algorithm;

import java.util.Scanner;

public class n_and_m_4 {
	static StringBuilder sb = new StringBuilder();
	// 수를 사용했으면 True 아니면 false 반환
   	static boolean[] c = new boolean[10];
   	//결과를 저장하는 배열
    static int[] a = new int[10];	
	static void go (int index,int start, int m, int n)
	{
		if(index ==m){
			for (int i = 0; i < m; i++) {
				sb.append(a[i]);
                System.out.println("****** a["+i+"]:"  +a[i]);

                if (i != m-1) sb.append(" ");				
			}
			sb.append("\n");
	        return;
		}
		
		for (int i = start; i <= n; i++) {
//			if(c[i]==true)continue;
//			c[i] =true;
			a[index] = i;
            System.out.println("for 문의  a["+index+"]:"  +a[index]);
            System.out.println("for 문의  i 값 : " + i);
			System.out.println(" start 값 : "+start);
			go(index+1,i, m, n);
//			c[i] =false;
		}
        System.out.println("for 문 종료");

	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	go(0,1, m, n);
	System.out.println(sb.toString());

	}

}
