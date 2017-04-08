import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anshu on 25/03/17.
 */
public class NESE_ISB_1 {
    public static final int STD = 2;
    public static final int LTD = 5;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double a[] = new double[n];
        double ltma[] = new double[n];
        double stma[] = new double[n];
        double sum=0,sum1=0;
        
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
            if(i<LTD-1)
                sum+=a[i];
            else if(i==LTD-1){
                sum+=a[i];
                ltma[i] = round(sum/LTD,2);
            }else{
                sum+=a[i];
                sum-=a[i-LTD];
                ltma[i]= round(sum/LTD,2);
            }
            if(i<STD-1)
                sum1+=a[i];
            else if(i==STD-1){
                sum1+=a[i];
                stma[i] = round(sum1/STD,2);
            }else{
                sum1+=a[i];
                sum1-=a[i-STD];
                stma[i]= round(sum1/STD,2);
            }
            
        }
        

//        System.out.println(Arrays.toString(stma));
//        System.out.println(Arrays.toString(ltma));

        for(int i=LTD;i<n;i++){
            if((stma[i-1]>ltma[i-1]&&stma[i]<=ltma[i])||(stma[i-1]<ltma[i-1]&&stma[i]>=ltma[i])||(stma[i-1]==ltma[i-1]&&stma[i]!=ltma[i])){
                System.out.println((i+1)+" "+stma[i]+" "+ltma[i]);
            }

        }



    }
    public static double round2(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
