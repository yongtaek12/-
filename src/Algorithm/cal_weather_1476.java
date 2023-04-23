package Algorithm;

import java.sql.Time;
import java.util.Scanner;

public class cal_weather_1476 {
	static int f_e (int e){
		int ans =0;
		
		if(e >15){
			ans = e%15;
			if(ans ==0){
				ans =15;
			}
		}else {
			ans = e;
		}
		return ans;
	}

	static int f_s (int e){
		int ans =0;
		
		if(e >28){
			ans = e%28;
			if(ans ==0){
				ans =28;
			}
		}else {
			ans = e;
		}		
		return ans;
	}
	static int f_m (int e){
		int ans =0;
		
		if(e >19){
			ans = e%19;
			if(ans ==0){
				ans =19;
			}
		}else {
			ans = e;
		}		
		return ans;
	}	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 1; i < 7981; i++) {
			if(f_e(i)==e &&f_s(i)==s&&f_m(i)==m){
				System.out.println(i);
				break;
			}			
		}
	}
}
