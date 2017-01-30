import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anshu on 11/11/16.
 */
public class MiniMaxSum {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double max = Double.MIN_VALUE;
        Double min = Double.MAX_VALUE;
        ArrayList<Double> list = new ArrayList<>(5);
        Double sum1=0.0,sum2=0.0;

        for(int i=0;i<5;i++){
            Double a = scan.nextDouble();
            if(a>max)
                max=a;
            if(a<min)
                min=a;
            list.add(a);
//            System.out.print(a);

        }
        for(int i=0;i<5;i++){
            if(list.get(i)!=max)
                sum1+=list.get(i);
            if(list.get(i)!=min)
                sum2+=list.get(i);
        }
        System.out.print(String.format("%.0f",sum1)+" "+ String.format("%.0f",sum2));

    }
}
