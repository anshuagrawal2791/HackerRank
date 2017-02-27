import java.util.Scanner;

/**
 * Created by anshu on 25/02/17.
 */

public class WeekOfCode29_4 {
    public static final double pi = 3.1415926535897932384626433832795028841971693993751;
    static double mind,maxd;
    static double minn,maxn;
    static fraction a,b,c,A;

    static class fraction{
        double num,den;

        public fraction(double num, double den) {
            this.num = num;
            this.den = den;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        mind = scan.nextDouble();
        maxd = scan.nextDouble();
        a =new fraction(3,1);b=new fraction(4,1);
        A=new fraction(3,1);
        while(true){
            c = new fraction(a.num+b.num,a.den+b.den);
            double x = gcd(c.num,c.den);
            c.num/=x;
            c.den/=x;
            if(c.den>maxd||c.den<mind)
            {
                System.out.printf("%.0f/%.0f",A.num,A.den);
                return;
            }

            if(Math.abs(pi-(c.num/c.den))<Math.abs(pi-(A.num/A.den)))
                A=c;
            if(pi<=(c.num/c.den)&&pi>=(a.num/a.den))
                b=c;
            else
                a=c;

        }


    }

    private static double gcd(double num, double den) {
        if(den == 0){ return num; } return gcd(den, num%den);


    }
}
