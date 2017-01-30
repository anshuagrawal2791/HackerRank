import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by anshu on 23/12/16.
 */
public class ZeroMoveNim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int p=0;p<t;p++){
            int n = scan.nextInt();
            BigInteger a[] = new BigInteger[n];
            for(int i=0;i<n;i++)
            {
//                a[i]=scan.nextBigInteger().add(BigInteger.ONE);
                BigInteger b =scan.nextBigInteger();
                if(b.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE))
                    a[i]=b.add(BigInteger.ONE);
                else
                    a[i]=b.subtract(BigInteger.ONE);
                System.out.print(a[i]+ " ");
            }
            BigInteger nimsum = a[0];

            System.out.println("---");
            for(int i=1;i<n;i++){
//                nimsum = nimsum^a[i];
                nimsum = nimsum.xor(a[i]);
//                System.out.println(nimsum);
            }
//            System.out.println("nimsum "+nimsum);
            if(nimsum.intValue()==0)
                System.out.println("L");
            else
                System.out.println("W");

        }
    }
}
