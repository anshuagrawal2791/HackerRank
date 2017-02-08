import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by anshu on 08/02/17.
 */
public class SherlockAndAnagrams {




        public static int Solve(String s) {
            int count=0; int n = s.length();
            int numberOfPairs=0;
            Map<String, Integer> map = new HashMap<String, Integer>();

            //Get all possible forward strings, and map anagramic frequency.
            for (int i=0;i<n;i++) {
                for (int j=1;j<=n-i;j++) {
                    String sub = s.substring(i, i+j);
                    char[] arr = sub.toCharArray();
                    Arrays.sort(arr);
                    sub = new String(arr);

                    if(!map.containsKey(sub)){
                        map.put(sub, count+1);
                    }
                    else{
                        map.put(sub, map.get(sub)+1);
                    }
                }
            }

            //System.out.println(map);

            for (String key: map.keySet()) {
                int val = map.get(key);
                numberOfPairs += (val*(val-1)) / 2;
            }
            return numberOfPairs;
        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();

            for (int i=0;i<t;i++) {
                String s = in.next();
                System.out.println(Solve(s));
            }

        }

}
