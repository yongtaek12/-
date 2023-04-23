package Algorithm;

import java.util.Scanner;

public class candy_3085 {
	static int check(char [][] arr){
		
		int cnt = 1;
		int max =0;
		int max2 =0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {
	
				if(arr[i][j]==(arr[i][j-1])){
					cnt +=1;
				}else{
					cnt =1;
				}
				if (cnt >max2){
					max2 = cnt;
				}
			}
			if (max2 >max){
				max = max2;
			}
			max2=0;
			cnt =1;

		}
		
		
		int cnt1 = 1;
		int max1 =0;
		int max12 =0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				if(arr[j][i]==(arr[j-1][i])){
					cnt1 +=1;
				}else{
					cnt1 =1;
				}
				if (cnt1 >max12){
					max12 = cnt1;
				}
			}
			if (max12 >max1){
				max1 = max12;
			}
			max12=0;
			cnt1 =1;
		}
		if(max1>max)
		{
			return max1;
		}else{
			return max;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		char [][] arr = new char[n][n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next().toCharArray();
		}
		
		System.out.println(" done ");
		int max_w = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				char t = arr[i][j];
				
				arr[i][j] = arr[i][j-1];
				arr[i][j-1] = t;
				if(max_w < check(arr)){
					max_w = check(arr);
				};	
				//원복
				arr[i][j-1] = arr[i][j];
				arr[i][j] = t;
				
			}
		}
		System.out.println("max_w : "+ max_w);
		
		
		int max_h = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				char t = arr[j][i];
				
				arr[j][i] = arr[j-1][i];
				arr[j-1][i] = t;
				if(max_h < check(arr)){
					max_h = check(arr);
				};	
				//원복
				arr[j-1][i] = arr[j][i];
				arr[j][i] = t;
				
			}
		}
//		System.out.println("max_h : "+ max_h);
		int ans = max_h > max_w ? max_h : max_w;
		System.out.println("답 : "+ ans);

	}
	
}
