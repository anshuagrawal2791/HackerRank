import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by anshu on 11/11/16.
 */
public class JimAndTheOrders {


    static class order {
        private int i,t,d,sum;

        public order(int i, int t, int d, int sum) {
            this.i = i;
            this.t = t;
            this.d = d;
            this.sum = sum;
        }

        public int getI() {
            return i;
        }

        public int getT() {
            return t;
        }

        public int getD() {
            return d;
        }

        public int getSum() {
            return sum;
        }

        public void setI(int i) {
            this.i = i;
        }

        public void setT(int t) {
            this.t = t;
        }

        public void setD(int d) {
            this.d = d;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<order> orders = new ArrayList<>(n);
        for(int j=0;j<n;j++){
            int t = scan.nextInt();
            int d = scan.nextInt();
            order o = new order(j+1,t,d,t+d);
            orders.add(o);
        }
        Collections.sort(orders, new Comparator<order>() {
            @Override
            public int compare(order o1, order o2) {
                return Integer.compare(o1.d,o2.d);
            }
        });
        Collections.sort(orders, new Comparator<order>() {
            @Override
            public int compare(order o1, order o2) {
                return Integer.compare(o1.sum,o2.sum);
            }
        });
        for(int i=0;i<n;i++){
            System.out.print(orders.get(i).getI()+" ");
        }

    }
}
