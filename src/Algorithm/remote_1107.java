package Algorithm;

import java.util.Iterator;
import java.util.Scanner;

public class remote_1107 {
public static boolean discorn(int n, int br[])
{
	boolean discorn = true;
	int length = (int)(Math.log10(n)+1);
	while (length>0) 
	{	
		for (int i = 0; i < br.length; i++) {
			if(n%10==br[i]){
				discorn = false;
			}
		}
		n= n/10;
		length--;
	}
	
	return discorn;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//입력하고자 하는 채널 
		int n = scan.nextInt();
		// 고장난 채널 갯수
		int brc = scan.nextInt();
		//고장난 채널
		int []br = new int[brc];
		//가용되는 채널
		int []wr = new int[(10-brc)];
		
		
		for (int i = 0; i < brc; i++) {
			br[i] = scan.nextInt(); 
		}
//		만들수 있는 채널을 생성합니다.
		if(brc !=0){
			int cnt =0;
			boolean c = true;
			for (int i = 0; i <10; i++) 
			{
				c = true;
				for (int j = 0; j < br.length; j++) 
				{
					if(i ==br[j]){
						c = false;
					}	
				}
				if(c == true)
				{
					wr[cnt] = i;
					cnt++;
					
				}
			}
		}
		// 자리수 구하기
		int plus = 0;
		int minus =0;
		for (int i = n; i < 10000000; i++) 
		{
			if (discorn(i, br)==true){
				System.out.println(i);
				plus = i;
				break;
			}
		}
		for (int i = n; i >= 0; i--) 
		{
			if (discorn(i, br)==true){
				minus = i;
				break;
			}
		}		

		int ans;
		int minus2 = minus;
		if(minus==0){
			minus2 =1;
		}
		int m = (n-minus) +((int)Math.log10(minus2)+1);
		int p = (plus-n) +((int)Math.log10(plus)+1);
//		System.out.println((int)Math.log10(minus2)+1);
//		System.out.println(n-minus);
		if(p>m){
			ans = m;
		}else{
			ans = p;
		}
//		System.out.println(ans);
		

	}
}


