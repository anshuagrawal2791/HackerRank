import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anshu on 20/08/16.
 */
public class GCD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t0 = scan.nextInt();
        int t1 = scan.nextInt();
        int n = scan.nextInt();
        ArrayList<BigInteger> a = new ArrayList<>();
        a.add(BigInteger.valueOf(t0));
        a.add(BigInteger.valueOf(t1));
        for(int i=2;i<n;i++){
            a.add((a.get(i-1).multiply(a.get(i-1))).add(a.get(i-2)));
        }
        System.out.print(a.get(n-1));

    }

    static int gcd(int a,int b){
        if(b%a==0)
            return a;
        else return (gcd(b%a,a));
    }
}
