package Algorithm;

import java.util.Scanner;

public class lottery_6603 {
    public static boolean next_permutation(int[] a) {
        int i = a.length-1;
        while (i > 0 && a[i-1] >= a[i]) {
            i -= 1;
        }

        if (i <= 0) {
            return false;
        }

        int j = a.length-1;
        while (a[j] <= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        while (true) {
			int n = scan.nextInt();
			if (n == 0) break; //해야 runtime error nosuchElement 에러 잡는다 0일때 반복문 탈출
			int arr[] = new int[n];
			int brr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			//순열로 나오는 케이스는 1 그외는 2로 세팅한다. 예시 111112 1111121 이런식?
			for (int i = 0; i < n; i++) {
				if (i<6){brr[i] = 1;}
				else{
					brr[i] =2;
				}
					
			}		
			do {
				for (int i = 0; i < n; i++) {
					//2인 경우 출력하면 안되니까 continue;
					if(brr[i] ==2)continue;
					System.out.print(arr[i]);
					System.out.print(" ");
				}
				System.out.println();
			} while (next_permutation(brr));
			System.out.println();
		}
	}
}
