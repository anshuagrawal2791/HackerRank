import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by anshu on 13/02/17.
 */

// https://www.hackerrank.com/challenges/pairs
public class Pairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            map.put(a,a);
            list.add(a);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(map.keySet().contains(list.get(i)+k))
                ans++;
        }
        System.out.println(ans);


    }
}
