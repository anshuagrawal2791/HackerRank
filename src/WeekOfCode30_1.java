import java.io.IOException;

/**
 * Created by anshu on 13/03/17.
 */
public class WeekOfCode30_1 {
    public static void main(String[] args) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();
        int t = scan.nextInt();
        int curr=n;
        int put=0;
        for(int i=1;i<=t;i++){
            int picked = scan.nextInt();
            curr-=picked;
            if(curr<5&&i!=t){
                put+=(n-curr);
                curr=n;
            }
        }
        System.out.println(put);
    }
}
