import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anshu on 27/02/17.
 */
//  https://www.hackerrank.com/challenges/angry-children
public class MaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int K = Integer.parseInt(in.readLine());
        int[] list = new int[N];

        for(int i = 0; i < N; i ++)
            list[i] = Integer.parseInt(in.readLine());

        int unfairness = Integer.MAX_VALUE;
        Arrays.sort(list);
        for(int i=0;i<=N-K;i++){
            int diff = list[i+K-1]-list[i];
            if(diff<unfairness)
                unfairness=diff;
        }

      /*
       * Write your code here, to process numPackets N, numKids K, and the packets of candies
       * Compute the ideal value for unfairness over here
      */

        System.out.println(unfairness);
    }
}
