package Algorithm;

import java.util.Scanner;

public class oneTwoThree_add_9095 {

	public static void main(String[] args) {
		// dp
		int[]  dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i < 11; i++) {
			dp[i] = dp[i-1] + dp[i-2] +dp[i-3];
		} 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n-- >0){
			System.out.println(dp[scan.nextInt()]);
		}
		

	}

}
