import java.util.Scanner;

/**
 * Created by anshu on 11/01/17.
 */
public class TheGreatXOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            if((Math.log(x)/Math.log(2))==0.0){
                //System.out.print("a");
                System.out.println(x-1);
            }
            else{
                //System.out.print("B");
                System.out.printf("%.0f",Math.pow(2,(int)(Math.log(x)/Math.log(2))+1)-1-x);
            }
            // your code goes here
        }
    }
}
