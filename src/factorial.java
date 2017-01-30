/**
 * Created by anshu on 12/11/16.
 */
public class factorial {
    public static void main(String[] args) {
        System.out.print(fact(10));
    }

    private static int fact(int i) {
        if(i==1){
            return i;
        }
        return i*fact(i-1);
    }
}
