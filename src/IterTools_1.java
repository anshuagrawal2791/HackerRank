import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anshu on 16/02/17.
 */
public class IterTools_1 {
    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static class Line{
        Point p1,q1;

        public Line(Point p1, Point p2) {
            this.p1 = p1;
            this.q1 = p2;
        }

        @Override
        public String toString() {
            return "Line{" +
                    "p1=" + p1 +
                    ", q1=" + q1 +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans=0;
        ArrayList<Line> lines = new ArrayList<>();
        for(int i=0;i<n;i++){
            lines.add(new Line(new Point(0,scan.nextInt()),new Point(1,scan.nextInt())));
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(doIntersect(lines.get(i).p1,lines.get(i).q1,lines.get(j).p1,lines.get(j).q1)){
//                    System.out.println(lines.get(i).p1.toString()+" "+lines.get(i).q1.toString()+" "+lines.get(j).p1.toString()+" "+lines.get(j).q1.toString());
                    ans++;
                }

            }
        }
        System.out.println(ans);
    }

    private static boolean doIntersect(Point p1, Point q1, Point p2, Point q2) {
        int o1 = orientation(p1, q1, p2);
        int o2 = orientation(p1, q1, q2);
        int o3 = orientation(p2, q2, p1);
        int o4 = orientation(p2, q2, q1);

        // General case
        if (o1 != o2 && o3 != o4)
            return true;

        // Special Cases
        // p1, q1 and p2 are colinear and p2 lies on segment p1q1
        if (o1 == 0 && onSegment(p1, p2, q1)) return true;

        // p1, q1 and p2 are colinear and q2 lies on segment p1q1
        if (o2 == 0 && onSegment(p1, q2, q1)) return true;

        // p2, q2 and p1 are colinear and p1 lies on segment p2q2
        if (o3 == 0 && onSegment(p2, p1, q2)) return true;

        // p2, q2 and q1 are colinear and q1 lies on segment p2q2
        if (o4 == 0 && onSegment(p2, q1, q2)) return true;

        return false;
    }

    private static boolean onSegment(Point p, Point q, Point r) {
        if (q.x <= Math.max(p.x, r.x) && q.x >= Math.min(p.x, r.x) &&
                q.y <= Math.max(p.y, r.y) && q.y >=Math.min(p.y, r.y))
            return true;

        return false;
    }

    private static int orientation(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x) -
                (q.x - p.x) * (r.y - q.y);

        if (val == 0) return 0;  // colinear

        return (val > 0)? 1: 2;
    }
}
