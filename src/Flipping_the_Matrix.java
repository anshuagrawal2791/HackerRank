import java.util.Scanner;

/**
 * Created by anshu on 28/08/16.
 */
public class Flipping_the_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int p=0;p<t;p++){

            int n = scan.nextInt();

            int a[][] = new int[2*n][2*n];
            double sum=0;
            for(int i=0;i<2*n;i++){
                for (int j=0;j<2*n;j++){
                    a[i][j]=scan.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.println(a[i][j]+"  "+ a[2*n-1-i][j]+"  "+ a[i][2*n-1-j]+"  "+a[2*n-1-i][2*n-1-j]);
                    sum+=Math.max(Math.max(a[i][j],a[2*n-1-i][j]),Math.max(a[i][2*n-1-j],a[2*n-1-i][2*n-1-j]));
                }
            }
            System.out.printf("%.0f",sum);
        }
    }
}
