import java.util.Scanner;

/**
 * Created by anshu on 21/08/16.
 */
public class RonHermoine {
    static char a[][];
    static int  n;
    static int m;
    public static void main(String[] args) {



//        a = new char[][]{{'*', '.', 'M'}, {'.','X','.'}};
//        n=2;
//        m=3;
//        solve(0,2,0);
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int p=0;p<t;p++){
            n =scan.nextInt();
            m = scan.nextInt();
            int c=0,d=0;
            a = new char[n][m];
            for(int i=0;i<n;i++)
            {
                String s = scan.next();
                for(int j=0;j<m;j++){
                    a[i][j]=s.charAt(j);
                    if(a[i][j]=='M')
                    {
                        c=i;
                        d=j;
                    }
                }

            }
            solve(c,d,0);

        }

    }

    static boolean solve(int i,int j, int count){
        if(i<0||i>=n||j<0||j>=m||a[i][j]=='X'||a[i][j]=='v')
            return false;
        else if(a[i][j]=='*')
        {
            System.out.println("count"+count);
            return true;
        }
        else{
            a[i][j]='v';
            if(exactlyOne(i,j)){
                System.out.println("this");
                return (solve(i+1,j,count)||solve(i-1,j,count)||solve(i,j+1,count)||solve(i,j-1,count));
            }

            else{
                System.out.println("that");
                return (solve(i+1,j,count+1)||solve(i-1,j,count+1)||solve(i,j+1,count+1)||solve(i,j-1,count+1));

            }


        }
    }

    private static boolean exactlyOne(int i, int j) {
        if(i>0&&i<n-1&&j>0&&j<m-1)
            if(((a[i][j+1]=='.'||a[i][j+1]=='*')&&a[i][j-1]!='.'&&a[i+1][j]!='.'&&a[i-1][j]!='.')
                    ||(a[i][j+1]!='.'&&(a[i][j-1]=='.'||a[i][j-1]=='*')&&a[i+1][j]!='.'&&a[i-1][j]!='.')||
                    (a[i][j+1]!='.'&&a[i][j-1]!='.'&&(a[i+1][j]=='.'||a[i+1][j]=='*')&&a[i-1][j]!='.')||
                    (a[i][j+1]!='.'&&a[i][j-1]!='.'&&a[i+1][j]!='.'&&(a[i-1][j]=='.'||a[i-1][j]=='*')))
            {
                System.out.println("1");
                return true;
            }
        if(i==0&&j>0&&j<m-1)
            if(((a[i][j+1]=='.'||a[i][j+1]=='*')&&a[i][j-1]!='.'&&a[i+1][j]!='.')
                    ||(a[i][j+1]!='.'&&(a[i][j-1]=='.'||a[i][j-1]=='*')&&a[i+1][j]!='.')||
                    (a[i][j+1]!='.'&&a[i][j-1]!='.'&&(a[i+1][j]=='.'||a[i+1][j]=='*')))
            {
                System.out.println("2");
                return true;
            }
        if(j==0&&i>0&&i<n-1)
            if(((a[i][j+1]=='.'||a[i][j+1]=='*')&&a[i+1][j]!='.'&&a[i-1][j]!='.')
                    || (a[i][j+1]!='.'&&(a[i+1][j]=='.'||a[i+1][j]=='*')&&a[i-1][j]!='.')||
                    (a[i][j+1]!='.'&&a[i+1][j]!='.'&&(a[i-1][j]=='.'||a[i-1][j]=='*')))
            {
                System.out.println("3");
                return true;
            }
        if(i==n-1&&j>0&&j<m-1)
            if(((a[i][j+1]=='.'||a[i][j+1]=='*')&&a[i][j-1]!='.'&&a[i-1][j]!='.')
                    ||(a[i][j+1]!='.'&&(a[i][j-1]=='.'||a[i][j-1]=='*')&&a[i-1][j]!='.')||
                    (a[i][j+1]!='.'&&a[i][j-1]!='.'&&(a[i-1][j]=='.'||a[i-1][j]=='*')))
            {
                System.out.println("4");
                return true;
            }
        if(j==m-1&&i>0&&i<n-1)
            if(((a[i][j-1]=='.'||a[i][j-1]=='*')&&a[i+1][j]!='.'&&a[i-1][j]!='.')||
                    (a[i][j-1]!='.'&&(a[i+1][j]=='.'||a[i+1][j]=='*')&&a[i-1][j]!='.')||
                    (a[i][j-1]!='.'&&a[i+1][j]!='.'&&(a[i-1][j]=='.'||a[i-1][j]=='*')))
            {
                System.out.println("5");
                return true;
            }
        if(i==0&&j==0)
            if(((a[i+1][j]=='.'||a[i+1][j]=='*')&&a[i][j+1]!='.')||(a[i+1][j]!='.'&&(a[i][j+1]=='.'||a[i][j+1]=='*')))
            {
                System.out.println("6");
                return true;
            }
        if(i==n-1&&j==0)
            if(((a[i-1][j]=='.'||a[i-1][j]=='*')&&a[i][j+1]!='.')||(a[i-1][j]!='.'&&(a[i][j+1]=='.'||a[i][j+1]=='*')))
            {
                System.out.println("7");
                return true;
            }
        if(i==n-1&&j==m-1)
            if(((a[i][j-1]=='.'||a[i][j-1]=='*')&&a[i-1][j]!='.')||(a[i][j-1]!='.'&&(a[i-1][j]=='.'||a[i-1][j]=='*')))
            {
                System.out.println("8");
                return true;
            }
        if(i==0&&j==m-1)
            if(((a[i][j-1]=='.'||a[i][j-1]=='*')&&a[i+1][j]!='.')||(a[i][j-1]!='.'&&(a[i+1][j]=='.'||a[i+1][j]=='*')))
            {
                System.out.println("9");
                return true;
            }
        return false;

    }
}
