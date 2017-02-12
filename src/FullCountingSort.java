import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by anshu on 12/02/17.
 */
public class FullCountingSort {
    public static class object{
         int value;
         String text;

        public object(int value, String text) {
            this.value = value;
            this.text = text;
        }

        @Override
        public String toString() {
            return "object{" +
                    "value=" + value +
                    ", text='" + text + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
//        object[] data = new object[n];
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            int a = scan.nextInt();
//            String b = scan.next();
//            if(a>max)
//                max=a;
//            data[i]=new object(a,b);
//        }
//        max++;
//        int[] aux = new int[max];
//        for(int i=0;i<n;i++){
//            aux[data[i].value]++;
//        }
//        int[] aux2 = new int[max];
//        for(int i=0;i<max;i++)
//            aux2[i]=aux[i];
//        for(int i=1;i<max;i++){
//            aux2[i]+=aux2[i-1];
////            System.out.print(aux2[i-1]+" ");
//        }
////        System.out.print(aux2[max-1]);
//        object[] output = new object[n];
//        for(int i=0;i<n;i++){
////            System.out.println(aux2[data[i].value]-aux[data[i].value]);
//            if(i>=(n/2))
//                output[aux2[data[i].value]-aux[data[i].value]]=new object(data[i].value,data[i].text);
//            else
//                output[aux2[data[i].value]-aux[data[i].value]]=new object(data[i].value,"-");
//
//
//            aux[data[i].value]--;
//
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(output[i].text+" ");
//
//        }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String str [] = new String[n];
            int helper [] = new int[n];
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                String[] tmp = in.readLine().split(" ");
//                int x = Integer.parseInt(tmp[0]);
//                String s = tmp[1];


                helper[i] = Integer.parseInt(tmp[0]);
                str[i] = tmp[1];
                if(helper[i]>max)
                    max=helper[i];

            }
            for(int i=0;i<=max;i++){
                for(int j=0;j<n;j++)
                {
                    if(helper[j] == i){
                        if(j+1<=(n/2)){
                            System.out.print("- ");
                        }
                        else
                            System.out.print(str[j]+" ");
                    }
                }
            }





    }
}
