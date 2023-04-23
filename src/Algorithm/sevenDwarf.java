package Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sevenDwarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[]a = new int [n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        	sum+=a[i];
			
		}
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(sum - (a[i]+a[j])==100){
					for (int j2 = 0; j2 < n; j2++) {
						if(i==j2 || j==j2){
							continue;
						}													
						System.out.println(a[j2]);
					}
                    System.exit(0);

				}
			}
		}
	}
}
