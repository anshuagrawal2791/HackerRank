import java.math.BigInteger;
import java.util.*;

/**
 * Created by anshu on 21/02/17.
 */
public class WeekOfCode29_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        ArrayList<BigInteger> list = new ArrayList<>();
        BigInteger[] list = new BigInteger[n];
        for(int i=0;i<n;i++)
            list[i]=(scan.nextBigInteger());
        Arrays.sort(list);
        for(int i=0;i<n;i++)
            System.out.println(list[i]);
    }
}
