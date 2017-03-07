import java.util.Scanner;

/**
 * Created by anshu on 07/03/17.
 */
public class Rait_a_thon_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int p=0;p<t;p++){
            int n = scan.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int c[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=scan.nextInt();
            }
            for(int i=1;i<n;i++){
                b[i]=b[i-1]+a[i-1];
            }
            for(int j=n-2;j>=0;j--){
                c[j]=c[j+1]+a[j+1];
            }
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(b[i]==c[i]){
                    System.out.println("YES");
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println("NO");
        }
    }
}
