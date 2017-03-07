import java.io.IOException;

/**
 * Created by anshu on 07/03/17.
 */
public class Rait_a_thon_1 {
    public static void main(String[] args) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();
        int d = scan.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=a[(i+d)%n];
            System.out.print(b[i]+" ");
        }
    }
}
