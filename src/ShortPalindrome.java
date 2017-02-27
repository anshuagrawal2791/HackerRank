import java.util.Scanner;

/**
 * Created by anshu on 27/02/17.
 */
public class ShortPalindrome {
    static char [] string;
    static double ans=0;
    public static final double constant = Math.pow(10,9)+7;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        string = s.toCharArray();
        check(string,0,0,new char[4]);
        System.out.printf("%.0f",ans);
    }

    private static void check(char[] string, int min, int index,char[] data) {
        if(index==4){
            if(isPalindrome(data))
            {
                ans = (ans+1)%constant;
            }
        }
        else {
            for (int i = min; i < string.length; i++) {
                data[index] = string[i];
                check(string, i + 1, index + 1, data);
            }
        }

    }

    private static boolean isPalindrome(char[] data) {
        for(int i=0;i<4;i++){
            if(data[i]!=data[3-i])
                return false;
        }
        return true;

    }
}
