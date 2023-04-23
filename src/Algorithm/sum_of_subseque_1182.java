package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * 재귀함수로 부분수열의 합 구하는 방식 비효율적
 */
public class sum_of_subseque_1182 {
	public static int n;
	public static int[] nrr;
	public static int ans;
	public static Set<Set<Integer>> ansArr = new HashSet<>();
    static boolean[] check = new boolean[20];
    //집합의 합이 두번째 주어진 값과 같은지 체크 하는 함수
    public static boolean checkAns (ArrayList<Integer> arr){
    	if(arr.size()==0){
    		return false;
    	}else{
        	int val =0;
        	for (int i = 0; i < arr.size(); i++) {
    			val += arr.get(i);
    		}
        	if(val == ans){
        		return true;
        	}
        	return false;
    	}
    }

	public static void go(int index, ArrayList<Integer> arr){

		if(checkAns(arr) == true){
			//정렬용
	        ArrayList<Integer> al = new ArrayList<>(arr);
			Collections.sort(al);
			//중복제거용
			Set<Integer> set = new HashSet<>(al);
			ansArr.add(set);
		}
		for (int i = 0; i < n; i++) {
            if (check[i]) continue;
            check[i] = true;
			arr.add(nrr[i]);
			go(index+1, arr);
			arr.remove(arr.size()-1);
            check[i] = false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		nrr = new int[n];
		ans = sc.nextInt();
		for (int i = 0; i < nrr.length; i++) {
			nrr[i] = sc.nextInt();
		}
		ArrayList<Integer> arr = new ArrayList<>();
		go(0,arr);
		System.out.println(ansArr.size());

	}
}
