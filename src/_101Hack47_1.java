import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by anshu on 21/03/17.
 */
public class _101Hack47_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] s = new int[m];
        for(int s_i=0; s_i < m; s_i++){
            s[s_i] = in.nextInt();
        }
        HashMap<Integer,Boolean> map = new HashMap<>();
        boolean flag = true;
        for(int i=0;i<m;i++){
            if(map.containsKey(s[i]))
            {
                System.out.println("NO");
                flag=false;
            }
            else
            {
                map.put(s[i],true);
            }
        }
        if(flag)
            System.out.println("YES");
    }
}
