package Algorithm;
import java.util.*;

public class abcde_13023 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //인접행렬
        boolean[][] a = new boolean[n][n];
        //인접리스트
        ArrayList<Integer>[] g = (ArrayList<Integer>[]) new ArrayList[n];
        //간선리스트
        ArrayList<Edge> edges = new ArrayList<Edge>();
        for (int i=0; i<n; i++) {
            g[i] = new ArrayList<Integer>();
        }
        for (int i=0; i<m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            edges.add(new Edge(from, to));
            edges.add(new Edge(to, from));
            a[from][to] = a[to][from] = true;
            g[from].add(to);
            g[to].add(from);
        }
        m *= 2;
//        System.out.println("edge : " + edges.toString());
//        System.out.println("g : " + g.toString());
        for (int i = 0; i < edges.size(); i++) {
        	System.out.println("edges from: " + edges.get(i).from);
        	System.out.println("edges to : " + edges.get(i).to);

		}
//        for (int i = 0; i < g.length; i++) {
//			
////			System.out.println(" ddd + "+g[i].get(i));
//		}
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(" " + a[i][j]);
			}
		}
        for  (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                int A = edges.get(i).from;
                int B = edges.get(i).to;
                int C = edges.get(j).from;
                int D = edges.get(j).to;
                if (A == B || A == C || A == D || B == C || B == D || C == D) {
                    continue;
                }
                if (!a[B][C]) continue;
                for (int E : g[D]) {
                    if (A == E || B == E || C == E || D == E) {
                        continue;
                    }
                    System.out.println(1);
                    System.exit(0);
                }
            }
        }
        System.out.println(0);
    }
}
