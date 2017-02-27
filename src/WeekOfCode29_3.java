import java.util.Scanner;

/**
 * Created by anshu on 22/02/17.
 */
public class WeekOfCode29_3 {
    static class Point{
    double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
    static Point[] square= new Point[4];
    static double w,h,xc,yc,r,area_square;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        w = scan.nextDouble();
        h = scan.nextDouble();
        xc = scan.nextDouble();
        yc = -scan.nextDouble();
        r= scan.nextDouble();
        square[0] = new Point(scan.nextDouble(),-scan.nextDouble());
        square[2] = new Point(scan.nextDouble(),-scan.nextDouble());

        square[1] = new Point((square[0].x+square[2].x+square[2].y-square[0].y)/2,(square[0].x-square[2].x+square[2].y+square[0].y)/2);
        square[3] = new Point((square[0].x+square[2].x-square[2].y+square[0].y)/2,(-square[0].x+square[2].x+square[2].y+square[0].y)/2);
//        square[1].y = (square[0].x-square[2].x+square[2].y+square[0].y)/2;
//        square[3].y = (-square[0].x+square[2].x+square[2].y+square[0].y)/2;

        area_square = Math.abs(((square[0].y-square[2].y)*(square[3].x-square[1].x)+(square[1].y-square[3].y)*(square[0].x-square[2].x))/2);

//        x2=
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(inside_circle(j,-i)) {
                    System.out.print("#");
//                    System.out.println("cirlce "+j+" -"+i);
                }
                else if(inside_square(j,-i)){
                    System.out.print("#");
//                    System.out.println("square "+j+" -"+i);
                }
                else
                    System.out.print(".");
            }
            System.out.println();
        }

        

    }
    static boolean inside_circle(double x,double y){
        double radiussquare = r*r;
        double distancesquare = Math.pow(x-xc,2)+Math.pow(y-yc,2);
        if(distancesquare<=radiussquare)
            return true;
        return false;
    }
    static boolean inside_square(double x,double y){
        double area1;
        area1 = Math.abs(square[0].x*(square[1].y-y)+square[1].x*(y-square[0].y)+x*(square[0].y-square[1].y))/2;
        area1+= Math.abs(square[1].x*(square[2].y-y)+square[2].x*(y-square[1].y)+x*(square[1].y-square[2].y))/2;
        area1+= Math.abs(square[2].x*(square[3].y-y)+square[3].x*(y-square[2].y)+x*(square[2].y-square[3].y))/2;
        area1+= Math.abs(square[3].x*(square[0].y-y)+square[0].x*(y-square[3].y)+x*(square[3].y-square[0].y))/2;
        if(area_square<(area1))
            return false;
        return true;
    }

}
