package Algorithm;

import java.util.Scanner;

public class recur {
	
	static void recur(int n){
		if(n>0){
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		int x = scan.nextInt();
		recur(x);
	}

}
