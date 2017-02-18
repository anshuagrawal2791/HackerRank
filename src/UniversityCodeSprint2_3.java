import java.util.*;

/**
 * Created by anshu on 18/02/17.
 */
public class UniversityCodeSprint2_3 {
    static int x;
    static int ans;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int p=0;p<t;p++){
            int n =scan.nextInt();
            int m =scan.nextInt();
            ans=0;
            x =scan.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            Stack<Integer> a1 = new Stack<>();
            Stack<Integer> b1 = new Stack<>();
            for(int i=0;i<n;i++)
                a.add(scan.nextInt());
            for(int i=0;i<m;i++)
                b.add(scan.nextInt());

            for(int i=n-1;i>=0;i--)
                a1.push(a.get(i));
            for(int i=m-1;i>=0;i--)
                b1.push(b.get(i));


            check(a1,b1,0,0);
            System.out.println(ans);
        }
    }

    private static void check(Stack<Integer> a, Stack<Integer> b, int sum,int count) {
        System.out.println(sum+" "+count);
        ans=Math.max(ans,count);
        if(sum>x||(a.size()==0&&b.size()==0))
        {
//            ans = Math.max(ans,count);
            return;
        }


        if(a.size()>0){

            int a1= a.peek();
            if(a1+sum<=x){
                a.pop();
                check(a,b,sum+a1,count+1);
                a.push(a1);}


        }
        if(b.size()>0){
            int b1 = b.peek();
            if(b1+sum<=x){
            b.pop();
            check(a,b,sum+b1,count+1);
            b.push(b1);}

        }

    }
}
