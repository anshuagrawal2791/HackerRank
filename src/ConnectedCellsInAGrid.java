import java.util.Scanner;

/**
 * Created by anshu on 27/02/17.
 */
public class ConnectedCellsInAGrid {
    static int [][] a;
    static int n,m;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        a = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=scan.nextInt();
        int largest=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int x;
                if(a[i][j]==1)
                {
                    x = find(i,j);
                    if(x>largest)
                        largest=x;
                }
            }
        }
        System.out.println(largest);

    }

    private static int find(int i, int j) {
        if(i<0||i>=n||j<0||j>=m)
            return 0;
        if(a[i][j]==2||a[i][j]==0)
            return 0;
        a[i][j]=2;
        return 1+find(i-1,j-1)+find(i-1,j)+find(i-1,j+1)+find(i,j+1)+find(i+1,j+1)+find(i+1,j)+find(i+1,j-1)+find(i,j-1);
    }
}
