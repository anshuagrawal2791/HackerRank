import java.util.Scanner;

/**
 * Created by anshu on 19/12/16.
 */
public class MST_Prims {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();



        int[][] graph = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<m;i++){
            int p = scan.nextInt();
            int q = scan.nextInt();
            int r = scan.nextInt();
            if(r<graph[p-1][q-1]) {
                graph[p-1][q-1]=r;
                graph[q-1][p-1]=r;
            }
        }
        int current = scan.nextInt()-1;
        double answer =0;
        boolean[] visited = new boolean[n];
//        visited[current]=true;
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=Integer.MAX_VALUE;
        a[current]=0;
        for(int i=0;i<n;i++){
            int x = getNext(a,visited,n);
            visited[x]=true;
            answer+=a[x];
//            System.out.println("answer--"+answer);
            for(int j=0;j<n;j++){
                if(graph[x][j]!=Integer.MAX_VALUE&&a[j]>graph[x][j])
                    a[j]=graph[x][j];
            }
        }
        System.out.printf("%.0f",answer);







    }

    private static int getNext(int[] a, boolean[] visited,int n) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<n;i++){
//            System.out.print("   "+a[i]);
            if(a[i]<min&&visited[i]!=true){
                min = a[i];
                ans = i;
            }
        }
//        System.out.println();
//        System.out.println("ans--"+ans);

        return ans;
    }


}
