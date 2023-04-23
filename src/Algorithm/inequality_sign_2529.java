package Algorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class inequality_sign_2529 {
	// 백준 부등호 2529
	static int n;
    static boolean[] check = new boolean[10];
    static ArrayList<ArrayList> ans = new ArrayList<>();

	static void go(int index, ArrayList<Integer> listN, String nrr[]){
//		System.out.println(index);

		if(listN.size() ==n+1){
			System.out.println();
			ans.add(listN);
			return;
		}
		if(index >9){
			return;
		}
        for (int i=0; i<=9; i++) {
            if (check[i]) continue;
            check[i] = true;        	
        	listN.add(index);
            go(index+1, listN, nrr);
            check[i] = false;
        }
	};
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);		
		n = scan.nextInt();
		String[] nrr = new String[n];
		for (int i = 0; i < n; i++) {
			nrr[i] = scan.next();
		}
		ArrayList<Integer> listN = new ArrayList<>();
		go(0, listN, nrr);
		System.out.println(ans);

	}
}
