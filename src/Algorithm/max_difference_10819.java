package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class max_difference_10819 {
	 public static boolean next_permutation(int[] a) 
		{	
		int i = a.length-1;
	    while (i > 0 && a[i-1] >= a[i]) {
	        i -= 1;
	    }

        if (i <= 0) {
            return false;
        }

        int j = a.length-1;
        while (a[j] <= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
		
	}	
	public static int sum(int a[]){
		int i = 0;
		int temp=0;
		while (i<a.length-1) {
			temp += Math.abs(a[i]-a[i+1]);
			i+=1;
		}
		return temp;
	}

	public static void main(String[] args) {
		// 차이를 최대로 백준 : 10819
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		do{
			if(max<sum(a))
				max = sum(a);
		}while(next_permutation(a));		
		System.out.println(max);

	}
}
