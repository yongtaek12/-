package Algorithm;

import java.util.Scanner;

public class oneTwoThree_add_ans_9095 {
    public static void go(int sum, int goal, String words) {
//    	System.out.println("sum + " + sum);
    	
        if (sum > goal) {
            return;
        }
        if (sum == goal) {
            System.out.println(words.substring(0, words.length() - 1));
//            words.sub
        }
        String now="";
        for (int i=1; i<=3; i++) {
            go(sum+i, goal, words +i +"+");
        }
  
    }
	public static void main(String[] args) {
		// 1,2,3, 더하기...9095
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
            int n = sc.nextInt();
            int nrr[] = new int[n+10];
            go(0, n, "");
//            System.out.println(go(0, n, ""));
//        }
    }
}
