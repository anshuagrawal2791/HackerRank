import java.util.Scanner;

/**
 * Created by anshu on 13/02/17.
 */
public class HourOfCodeRound2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        for(int p=0;p<t;p++){
//            double y = scanner.nextDouble();
//            y*=6;
//            double i;
//            for(i=1;;i++){
//                if(i*(i+1)*((2*i)+1)>y)
//                    break;
//            }
//            System.out.printf("%.0f \n",i-1);
//        }


//
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        for(int p=0;p<t;p++){
//            double l = scanner.nextDouble();
//            double b = scanner.nextDouble();
//            double area = l*b;
//            double count =0;
//            while(true)
//
//
//        }
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int p=0;p<t;p++){
            double n = scanner.nextDouble();
            double k = scanner.nextDouble();
            double x = Math.pow(2,n)-1;
//            if(b>=x){
//                if(b%2!=0)
//                    System.out.println("SHOCK");
//                else
//                    System.out.println("NO SHOCK");
//            }
//            else{
//                System.out.println("NO SHOCK");
//            }
            if(k<x)
                System.out.println("NO SHOCK");
            else{
                if(k==x)
                    System.out.println("SHOCK");
                else{
                    if((k-x)%Math.pow(2,n)==0)
                        System.out.println("SHOCK");
                    else
                        System.out.println("NO SHOCK");
                }
            }


        }

    }
}
