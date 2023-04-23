package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class guess_1248 {
	public static int n;
	public static char[] nrr;
	public static void go(int index, ArrayList<Integer> ans){
		System.out.println(ans);
		if(index >11){
			return;
		}

		if(ans.size()>n){
			System.out.println(ans);
			return;
		}
		for (int i = -10; i < 11; i++) {
			ans.add(i);
			go(i+1, ans);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		int s = n*(n+1)/2;
		String n1 = scan.next();
		nrr = new char[s];
		for (int i = 0; i < nrr.length; i++) {
			nrr[i] = n1.charAt(i);
		}

		ArrayList<Integer> arr = new ArrayList<>();
//		System.out.println("dd");

		go(0,arr);

	}

}
