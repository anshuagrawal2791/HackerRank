import java.util.Scanner;

/**
 * Created by anshu on 11/02/17.
 */
public class RookieRank2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int p=0;p<q;p++){
            String string = scan.next();
            if(isSubsequence("hackerrank",string,10,string.length()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean isSubsequence(String a, String b, int m, int n) {
        if(m==0)
            return true;
        if(n==0)
            return false;
        if(a.charAt(m-1)==b.charAt(n-1))
            return isSubsequence(a,b,m-1,n-1);
        return isSubsequence(a,b,m,n-1);

    }
}
