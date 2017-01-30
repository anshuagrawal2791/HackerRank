import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by anshu on 20/08/16.
 */
public class BFS {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int p=0;p<t;p++){
          //  System.out.println(p+"-----"+t);
            int n = scan.nextInt();
            int m = scan.nextInt();
           // System.out.println(n+"++++++++"+m);
            graph g = new graph(n);
            for(int i=0;i<m;i++){
                g.addEdge(scan.nextInt()-1,scan.nextInt()-1);
            }
            g.dijikstra(scan.nextInt()-1);
            System.out.println();
        }




    }

    static class graph{
        private int v;
        private LinkedList<Integer> adj[];

        public graph(int v) {
            this.v = v;
            adj = new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i]= new LinkedList<>();
            }
        }

        void addEdge(int a , int b){
            adj[a].add(b);
            adj[b].add(a);
        }
        void bfs(int source){

            boolean[] visited = new boolean[v];
            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(source);
            while(!queue.isEmpty()){
                int s = queue.poll();
                System.out.print(s+" ");

                for(int i=0;i<adj[s].size();i++){
                    if(!visited[adj[s].get(i)]){
                        queue.add(adj[s].get(i));
                        visited[s]=true;
                    }

                }
            }

        }

        void dijikstra(int source){
            int a[] = new int[v];
            boolean[] visited = new boolean[v];
            for(int i=0;i<v;i++){
                a[i]= Integer.MAX_VALUE;
                visited[i]=false;

            }
            a[source]=0;
            for(int i=0;i<v-1;i++){


                int s = minDistance(a,visited);
               // System.out.println(s);
                visited[s]=true;

                for(int j=0;j<adj[s].size();j++){
                    if(!visited[adj[s].get(j)]&&a[s]!= Integer.MAX_VALUE&&a[adj[s].get(j)]>a[s]+6)
                        a[adj[s].get(j)]=a[s]+6;
                }



            }
            for(int i=0;i<v;i++){
                if(i!=source){
                    if(a[i]==Integer.MAX_VALUE)
                        System.out.print("-1 ");
                    else
                        System.out.print(a[i]+" ");
                }

            }


        }

        private int minDistance(int[] a, boolean[] visited) {
            int minindex=0, min= Integer.MAX_VALUE;
            for(int i=0;i<a.length;i++){
                if(a[i]<=min&&!visited[i]){
                    min = a[i];
                    minindex = i;
                }

            }
            return minindex;


        }

    }
}

