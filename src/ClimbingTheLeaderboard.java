import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anshu on 19/12/16.
 */
public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] scores = new Integer[n];


        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }

        int m = in.nextInt();

        Integer[] alice = new Integer[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }

//        ArrayList<Integer> scores2 = new ArrayList<>(Arrays.asList(scores));
//        ArrayList<Integer> alice2 = new ArrayList<>(Arrays.asList(alice));
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0;i<m;i++){
            int curr = alice[i];
            int rank=1;
            for(int j=0;j<scores.length;j++){
                if(scores[j]>curr&&!a.contains(scores[j])){
                    rank++;
                    a.add(scores[j]);
                }
                else if(scores[j]<=curr){
                    break;
                }
            }
            System.out.println(rank);
            a.clear();
        }
    }


}
