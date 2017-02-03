import java.util.Scanner;

/**
 * Created by anshu on 02/02/17.
 */
public class HourRank17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int ans =0;
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            if(x>k){
                ans+=x-k;
                k=x;
            }
        }
        System.out.println(ans);
    }
}
