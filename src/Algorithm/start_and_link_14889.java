package Algorithm;

import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class start_and_link_14889 {
	
	public static void go(String sum, int index, int[][] arr){
		String value[] = sum.split(",");
		if(value.length >= arr.length/2){
			int intValue[] = new int [arr.length/2];
			//int화
			for (int i = 0; i < value.length; i++) {
				intValue[i] = Integer.parseInt(value[i]);
			}
			for (int i = 0; i < intValue.length; i++) {
				
			}
			return;
		}

		if (index >= arr.length) {
			return;
		}
		go(sum+index+",", index+1, arr);
		go(sum, index+1, arr);
	}

	public static void main(String[] args) {
		//스타트 and link
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr [][] = new int [n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		go("",0,arr);
	}
}
