import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by anshu on 07/03/17.
 */
public class Rait_a_thon_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
