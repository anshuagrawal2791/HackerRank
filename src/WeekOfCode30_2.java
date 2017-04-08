import java.io.IOException;

/**
 * Created by anshu on 14/03/17.
 */
public class WeekOfCode30_2 {
    public static void main(String[] args) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();
        recur(n);
    }

    private static void recur(int n) {
        if(n==2){
            System.out.print("min(int, int)");
            return;
        }else{
            System.out.print("min(int, ");
            recur(n-1);
            System.out.print(")");
        }
    }
}
