import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * Created by anshu on 11/01/17.
 */
public class LuckyNumberEight {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String number = scan.next();
        printsub(number);
//        System.out.print(number.substring(0,1).concat(number.substring(2,number.length())));
        // your code goes here
    }

    private static void printsub(String number) {
        if(number.length()>0){
            System.out.println(number);
            for(int i=0;i<number.length();i++){
                printsub(number.substring(0,i).concat(number.substring(i+1,number.length())));
            }
        }
        return;
    }

}
