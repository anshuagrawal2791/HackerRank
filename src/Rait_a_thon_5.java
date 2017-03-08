import java.util.*;

/**
 * Created by anshu on 07/03/17.
 */
public class Rait_a_thon_5 {
    static HashMap<Point,Boolean> helper;
    static final int SIZE=15;
    static int winner;
    static class Point{
        int i,j;

        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int p=0;p<t;p++){

            winner=0;
            helper=new HashMap<>();
            bfs(scan.nextInt()-1,scan.nextInt()-1);
            System.out.println(winner);
        }
    }

    private static void bfs(int j, int i) {
        int a [][] = new int[15][15];
        Stack<Point> q = new Stack<>();
        q.add(new Point(i,j));
        a[i][j]=2;
        while (!q.isEmpty()){
            Point curr = q.pop();
            if(canMove(curr.i,curr.j)){
//                for(int l=0;l<helper.keySet().size();l++){
//                    Point point = helper.keySet().
//                }
                Iterator it = helper.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry)it.next();
                    Point point = (Point)pair.getKey();
                    if(a[curr.i][curr.j]==1)
                    a[point.i][point.j]=2;
                    else
                    a[point.i][point.j]=1;
                    q.push(point);
//                    System.out.println(pair.getKey() + " = " + pair.getValue());
                    it.remove(); // avoids a ConcurrentModificationException
                }
            }
            else{
                winner = a[curr.i][curr.j];
            }
        }





    }

    private static boolean canMove(int i,int j) {
        helper.clear();
        if(j-2>=0&&i-1>=0)
            helper.put(new Point(i-1,j-2),true);
        if(j-2>=0&&i+1<SIZE)
            helper.put(new Point(i+1,j-2),true);
        if(i-2>=0&&j-1>=0)
            helper.put(new Point(i-2,j-1),true);
        if(i-2>=0&&j+1<SIZE)
            helper.put(new Point(i-2,j+1),true);
        if(helper.keySet().isEmpty())
            return false;
        else return true;
    }
}
