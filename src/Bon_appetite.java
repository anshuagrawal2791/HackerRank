import java.util.Scanner;

/**
 * Created by anshu on 28/08/16.
 */
public class Bon_appetite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int a [] = new int[n];
        double suma=0,sumb=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            if(i!=k){
                suma+=(double)a[i]/2;
                sumb+=(double)a[i]/2;
            }
            else
            {
                suma+=(double)a[i];
            }

        }
        System.out.print((-7)%10);
        double b = scan.nextDouble();
        if(b==sumb)
            System.out.print("Bon Appetit");
        else
        {
            System.out.print((int)(b-sumb));
        }

    }
}
