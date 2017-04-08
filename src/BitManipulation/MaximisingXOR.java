package BitManipulation;

import java.util.Scanner;

/**
 * Created by anshu on 09/04/17.
 */
public class MaximisingXOR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int max =Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            for(int j=i;j<=r;j++){
                if((i^j)>max)
                    max=(i^j);
            }
        }
        System.out.println(max);
    }
}
