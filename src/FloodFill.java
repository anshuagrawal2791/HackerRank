import java.util.Scanner;

/**
 * Created by anshu on 21/08/16.
 */
public class FloodFill {
    static int a[][],n,m;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        a = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=scan.nextInt();
        int large =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                if(a[i][j]==1)
                large=Math.max(large,floodfill(i,j));
        }
        System.out.print(large);

    }

    private static int floodfill(int i, int j) {
        if(i<0||i>=n||j>=m||j<0||a[i][j]==0)
            return 0;
        if(a[i][j]==2)
            return 0;
        a[i][j]=2;
        return 1+floodfill(i-1,i-1) + floodfill(i-1,j) + floodfill(i-1,j+1) + floodfill(i,j-1) + floodfill(i,j+1) + floodfill(i+1,j-1) + floodfill(i+1,j) + floodfill(i+1,j+1);

    }
}
