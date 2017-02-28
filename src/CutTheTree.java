import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by anshu on 28/02/17.
 */
// https://www.hackerrank.com/challenges/cut-the-tree
    /*
        we first find the sum of all subtrees and store in sum array
        the we minimise sum[0] - 2*sum[i]

        sum[0] has the sum of the whole tree
        sum[i] has sum of subtrees with root i

     */
public class CutTheTree {

   static int [] values;
   static int [] sum;
   static boolean [] visited;
    static int v;
    static LinkedList<Integer> adj[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        v = scan.nextInt();
        values = new int[v];
        sum = new int[v];
        visited = new boolean[v];
        adj = new LinkedList[v];
        for(int i=0;i<v;i++) {
            values[i]=scan.nextInt();
            adj[i] = new LinkedList<>();
        }
        for(int i=0;i<v-1;i++){
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            adj[a].add(b);
            adj[b].add(a);
        }
        dfs(0,visited);
//        for(int i=0;i<v;i++)
//            System.out.println(sum[i]+" ");
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<v;i++){
            int x = Math.abs(sum[0]-(2*sum[i]));
            if(x<ans)
                ans=x;
        }
        System.out.println(ans);
    }

    private static int dfs(int n,boolean[] visited) {
        visited[n]=true;
        if(sum[n]!=0)
            return sum[n];
        else{
            sum[n]=values[n];
            for(int i=0;i<adj[n].size();i++)
            {
                if(!visited[adj[n].get(i)])
                    sum[n]+=dfs(adj[n].get(i),visited);
            }
            return sum[n];
        }
    }
}
