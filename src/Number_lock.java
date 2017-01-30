import java.util.Scanner;

/**
 * Created by anshu on 28/08/16.
 */
public class Number_lock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans=0;
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<5;i++){
            int n = scan.nextInt();
            ans+=Math.min(Math.abs(n-a[i]),10-Math.abs(n-a[i]));
        }
        System.out.print(ans);
    }
}
