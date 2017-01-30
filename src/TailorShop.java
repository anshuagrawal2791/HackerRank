import java.util.*;

/**
 * Created by anshu on 20/12/16.
 */
public class TailorShop {
    static HashSet numbers;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int cost = scan.nextInt();
//        int a[] = new int[n];
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(scan.nextInt());
        }
        Collections.sort(a);
//        int b[] = new int[(int)(Math.pow(10,5)/cost)];
//        HashSet b = new HashSet();
//        for(int i=0;i<(int)(Math.pow(10,5)/cost);i++){
//            b.add((i+1)*cost);
////            System.out.print(b[i]);
//        }
//        System.out.print(b[b.length-1]);

        numbers = new HashSet();
        double count =0;
        int y=0;
        for(int i=0;i<n;i++){
            if(i==0)
                y=(int)Math.ceil((double)a.get(i)/(double)cost);
            int x = (int)Math.ceil((double)a.get(i)/(double)cost);
            if(x>y)
                y=x;

//            while(numbers.contains(y)){
//                y++;
//            }
//            numbers.add(y);
            count+=y;
            y++;
        }
        System.out.printf("%.0f",count);
    }

//    private static int getNextDivisor(int cost, int a_i) {
//        int y= (int)Math.ceil((double)a_i/(double)cost);
//        while(true){
//            if(numbers.contains(y))
//                y++;
//            else
//                break;
//        }
//        return y;
//
//    }
}
