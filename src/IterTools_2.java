import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by anshu on 16/02/17.
 */
public class IterTools_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<BigInteger> a = new ArrayList<>();
        ArrayList<BigInteger> b = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(scan.nextBigInteger());
        }
        for(int i=0;i<n;i++){
            b.add(scan.nextBigInteger());
        }
        BigInteger sum= BigInteger.ZERO;
        Collections.sort(a);
        Collections.sort(b, new Comparator<BigInteger>() {
            @Override
            public int compare(BigInteger o1, BigInteger o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i=0;i<n;i++)
            sum= sum.add(a.get(i).multiply(b.get(i)));
        System.out.println(sum);

    }
}
