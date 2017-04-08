import java.util.*;

/**
 * Created by anshu on 21/03/17.
 */
public class _101Hack47_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[p];
        for(int a_i=0; a_i < p; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[q];
        for(int b_i=0; b_i < q; b_i++){
            b[b_i] = in.nextInt();
        }

        int sums[][] = new int[p][q];
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                set.add(a[i]+b[j]);
            }
        }
        int y = set.last();
        y+=(n-1);
//        y=set.last()-y;
//        System.out.println("y--"+y);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=1000;i++){
            for (Integer number : set) {
                if((i+number)%n!=0)
                {
                    if(map.containsKey(i))
                    {
                        int x = map.get(i);
                        map.put(i,x+1);
                    }else{
                        map.put(i,1);
                    }
                }
            }
        }
        int maxFreq = Integer.MIN_VALUE;
        int number=0;
        int minnumber=Integer.MAX_VALUE;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey()+" "+pair.getValue());
            if((int)(pair.getValue())>maxFreq)
            {
                maxFreq=(int)pair.getValue();
                number=(int)pair.getKey();
            }
            if((int)pair.getKey()<minnumber)
                minnumber=(int)pair.getKey();
            it.remove(); // avoids a ConcurrentModificationException
        }

        if(n==0)
            System.out.println(minnumber);
        else
        System.out.println(number+"");
    }
}
