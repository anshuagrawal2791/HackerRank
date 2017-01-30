import java.util.Scanner;

/**
 * Created by anshu on 21/08/16.
 */
public class MissingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[10000];
        int b[] = new int[10000];
        for(int i=0;i<n;i++){
            a[scan.nextInt()-1]++;
        }
        int m = scan.nextInt();
        for(int i=0;i<m;i++)
            b[scan.nextInt()-1]++;
        for(int i=0;i<10000;i++){
            if(a[i]<b[i])
                System.out.print((i+1)+" ");
        }
    }
}
