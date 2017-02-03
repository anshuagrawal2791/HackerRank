import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by anshu on 02/02/17.
 */
public class HourRank17_2 {
    public static int[][] M;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            M = new int[n][n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                }
            }
            // your code goes here

//            System.out.println(check(M,n));
            System.out.println(check(M,n));
        }
    }

    private static boolean check(int[][] m, int n) {
        ArrayList<Integer> sum_container = new ArrayList<>();
        ArrayList<Integer> sum_balls = new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum1=0,sum2=0;
            for(int j=0;j<n;j++){
                sum1+= m[i][j];
                sum2+=m[j][i];
            }
            sum_container.add(sum1);
            sum_balls.add(sum2);

        }
//        System.out.println(sum_balls+"    "+sum_container);
        Collections.sort(sum_balls);
        Collections.sort(sum_container);
        return (sum_container.equals(sum_balls));

    }




}
