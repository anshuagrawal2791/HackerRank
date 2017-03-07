import java.io.*;
import java.util.*;

public class Rait_a_thon_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int p=0;p<t;p++){
            int n = scan.nextInt();
            int m = scan.nextInt();
            int s = scan.nextInt();
            int ans = (m+s-1)%n;
            if(ans!=0)
            System.out.println(ans);
            else
                System.out.println(n);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}