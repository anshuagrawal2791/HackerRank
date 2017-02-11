import java.util.*;

/**
 * Created by anshu on 11/02/17.
 */
public class RookieRank2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        TreeSet<Double> set = new TreeSet<>();
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scan.nextDouble());
        }
//        System.out.print(set);
        double ans = Double.MAX_VALUE;


        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)-list.get(i)<ans)
                ans=list.get(i+1)-list.get(i);
        }
        System.out.printf("%.0f",Math.abs(ans));
    }
}

