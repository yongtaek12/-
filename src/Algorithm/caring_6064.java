package Algorithm;

import java.util.Scanner;

public class caring_6064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//백준 카잉 달력
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int []mArr  = new int [n];
		int []nArr  = new int [n];
		int []xArr  = new int [n];
		int []yArr  = new int [n];
		
		int[] ansArr = new int [n];
		
		for (int i = 0; i < n; i++) {
			mArr[i] = scan.nextInt();
			nArr[i] = scan.nextInt();
			xArr[i] = scan.nextInt();
			yArr[i] = scan.nextInt();
		}
		
		
		for (int i = 0; i < n; i++) {
			int m = 0;
			int n1 = 0;			
			for (int j = 0; j < 400000; j++) {
				
				if(m == xArr[i] && n1 == yArr[i]){
					ansArr[i] = j;
					break;
				}else {
					ansArr[i] = -1;
				}
				
				if(mArr[i]==m){
					m=0;
							
				}
				if(nArr[i]==n1){
					n1=0;
							
				}	
				m++;
				n1++;
			}
		}
		
		for (int i = 0; i < ansArr.length; i++) {
			System.out.println(ansArr[i]);
		}
	}

}
