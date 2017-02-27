import java.util.Scanner;

/**
 * Created by anshu on 20/02/17.
 */
public class WeekOfCode29_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if(year>1918){
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                System.out.println("12.09."+year);
            }
            else
                System.out.println("13.09."+year);
        }
        else if(year==1918){
            System.out.println("26.09.1918");
        }
        else{
            if(year%4==0){
                System.out.println("12.09."+year);
            }
            else
                System.out.println("13.09."+year);
        }
    }
}
