package BitManipulation;

import java.util.Scanner;

/**
 * Created by anshu on 09/04/17.
 */
public class LonelyInteger {
    private static int lonelyInteger(int[] a) {
        int ans=0;
        for(int i=0;i<a.length;i++){
            ans=ans^a[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
