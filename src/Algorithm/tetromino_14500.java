package Algorithm;

import java.util.Scanner;

public class tetromino_14500 {
	//테트로미노
	//try-catche

	static int w1(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i][j+1] + nm[i][j+2] + nm[i][j+3];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int w2(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i+1][j] + nm[i+2][j] + nm[i+3][j];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int r(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i][j+1] + nm[i+1][j] + nm[i+1][j+1];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int l1(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i+1][j] + nm[i+2][j] + nm[i+2][j+1];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	//대칭
	static int l2(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j+1] + nm[i+1][j+1] + nm[i+2][j+1] + nm[i+2][j];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int l3(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i+1][j] + nm[i+1][j+1] + nm[i+1][j+2] + nm[i][j+2];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int l4(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i+1][j] + nm[i+1][j+1] + nm[i+1][j+2];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}	
	static int l5(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i][j+1] + nm[i+1][j+1] + nm[i+2][j+1];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}	
	static int l6(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i+1][j] + nm[i][j+1] + nm[i][j+2];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int l7(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i][j+1] + nm[i+1][j] + nm[i+2][j];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;

	}
	static int l8(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i][j+1] + nm[i][j+2] + nm[i+1][j+2];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}	
	static int g1(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i+1][j] + nm[i+1][j+1] + nm[i+1][j+2];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int g2(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i+1][j] + nm[i+1][j+1] + nm[i][j+1] + nm[i][j+2];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int g3(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j+1] + nm[i+1][j+1] + nm[i][j+1] + nm[i][j+2];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int g4(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i][j+1] + nm[i+1][j+1] + nm[i+1][j+2];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}	
	static int f1(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i][j+1] + nm[i][j+2] + nm[i+1][j+1];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int f2(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j] + nm[i+1][j] + nm[i+2][j] + nm[i+1][j+1];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int f3(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i+1][j] + nm[i+1][j+1] + nm[i+1][j+2] + nm[i][j+1];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}
	static int f4(int i, int j, int nm[][]){
		int sum = 0;
		try {
			sum = nm[i][j+1] + nm[i+1][j+1] + nm[i+2][j+1] + nm[i+1][j];
		} catch (Exception e) {
			// TODO: handle exception
			sum =0;
			return sum;
		}
		return sum;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int nm [][] =  new int [n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				nm[i][j] =sc.nextInt();
			}
		}
		
		int temp;
		int ans =0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				temp = w1(i,j,nm);
//				System.out.println(temp);
				if(temp >ans){
					ans =temp;
				}
				temp = w2(i,j,nm);
				if(temp >ans){
					ans=temp;
				}
				temp = r(i,j,nm);
				if(temp >ans){
					ans =temp;
				}
				temp = l1(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = l2(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = l3(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = l4(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = l5(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = l6(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = l7(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = l8(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = f1(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = f2(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = f3(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = f4(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = g1(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = g2(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = g3(i,j,nm);
				if(temp>ans){
					ans =temp;
				}
				temp = g4(i,j,nm);
				if(temp>ans){
					ans =temp;
				}				
			}
		}
		System.out.println(ans);
	}
}
