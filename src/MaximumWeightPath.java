import java.util.Scanner;

/**
 * Created by anshu on 17/01/17.
 */
public class MaximumWeightPath {
    static int N,M;
    static int output;
    static int[] x_move = new int[]{0,0,1,-1};
    static int[] y_move = new int[]{1,-1,0,0};


    public static boolean isValidAndSafe(int a, int b, int [][] visited){

        if (a>=0 && a<N && b>=0 && b<M){
            if(visited[a][b]==0){
                return true;
            }

            else
                return false;
        }
        return false;

    }

    public static void findPath(int weigh[][], int i,int j, int x,int y,int weight,int [][] visited){

        if(i==x&&j==y){
            output = Math.min(output,weight);
            return;
        }
        if(weight>output)
            return;
        visited[i][j]=1;
        for(int k=0;k<4;k++){
            if(isValidAndSafe(i+x_move[k],j+y_move[k],visited)){
                findPath(weigh,i+x_move[k],j+y_move[k],x,y,weight+weigh[i+x_move[k]][j+y_move[k]],visited);
            }

        }
        visited[i][j]=0;


    }


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            M = sc.nextInt();
            int weighMat[][] = new int[N][M];
            int visited[][] = new int[N][M];
            for(int i=0; i<N;i++){
                for(int j =0; j<M;j++){
                    weighMat[i][j] = sc.nextInt();
                }
            }
            int r1,r2,c1,c2;
            int Q = sc.nextInt();
            for(int k=0;k<Q;k++){
                r1 = sc.nextInt();
                c1 = sc.nextInt();
                r2 = sc.nextInt();
                c2 = sc.nextInt();
                output = Integer.MAX_VALUE;
                for(int i=0; i<N;i++){
                    for(int j =0; j<M;j++){
                        visited[i][j] = 0;
                    }
                }
                findPath(weighMat,r1,c1,r2,c2,weighMat[r1][c1],visited);
                System.out.println(output);

            }
    }

}
