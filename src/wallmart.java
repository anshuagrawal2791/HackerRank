import java.util.Scanner;

/**
 * Created by anshu on 05/11/16.
 */
public class wallmart {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++ ){
            for(int j =0 ;j<n;j++)
                a[i][j]=scan.nextInt();

        }


        int count = solve(a,n,0);
        System.out.println("final" + count);
    }

    private static int  solve(int[][] a, int n, int count) {
        if(n==1){
            System.out.print(a[0][0]);
            System.out.println("count"+ count);
            if(a[0][0]==1)
                return count+1;
            else
                return count;

        }
        else{
            for(int i=0;i<n;i++){
                if(a[0][i]==1){
                    int b[][] = new int [n-1][n-1];
                    int p=0;
                    for(int j=0;j<n;j++){
                        if(j==0)
                            continue;
                        int  q=0;
                        for(int k=0;k<n;k++){
                            if(k==i){
                                continue;
                            }
                            b[p][q]=a[j][k];
                            q++;

                        }
                        p++;
                    }
                for(int l=0;l<n-1;l++){
                    for(int m=0;m<n-1;m++){
                        System.out.print(" "+b[l][m]);
                    }
                    System.out.println();
                }
                    System.out.println();

                    count = solve(b,n-1,count);

                }

            }
        }

        return count;
    }
}
