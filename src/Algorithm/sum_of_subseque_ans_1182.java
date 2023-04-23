package Algorithm;
import java.util.*;

public class sum_of_subseque_ans_1182 {
	//비트마스크로  부분수열 의 합을  찾는 방식

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        /*000000 까지 이진법 
        /*111111
         * 자리수를 의미한다. i가 31이면 5개의 원소를 포함하고 있는 상태. 표현값 31이 된다.
         * i가 31이면 i&(1<<k) 식으로 포함여부 가 다되니 n(5) 까지 다 더함
         */
        for (int i=1; i<(1<<n); i++) {

            int sum = 0;
            for (int k=0; k<n; k++) {
                if ((i&(1<<k)) != 0) {
                    sum += a[k];
                	if(i==4){
                     	System.out.println(" i : " + i);

                    	System.out.println(" k : " + k);
                    	System.out.println(" (1<<k): " + (1<<k));

                    	System.out.println(" a["+k+"] : " + a[k]);
                        System.out.println( " sum ::: " + sum);

                	}                    
                }
            }
            if (sum == s) {
                ans += 1;
            }
        }
    }
}
