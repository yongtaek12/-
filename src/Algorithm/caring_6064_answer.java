package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;

public class caring_6064_answer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		int t = Integer.valueOf(bf.readLine());
 		while (t-->0){
 			String line[] = bf.readLine().split(" ");
 			int m = Integer.valueOf(line[0]);
 			int n = Integer.valueOf(line[1]);
 			int x = Integer.valueOf(line[2]) -1;
 			int y = Integer.valueOf(line[3]) -1;
 			boolean ok = false;
 			
 			for (int i = x; i < (n*m); i+=m) {
 				System.out.println(i);
				if(i%n==y){
					System.out.println(i+1);
					ok =true;
					break;
				}
			}
 			if(!ok){
				System.out.println(-1);
 			}
 		}
	}

}
