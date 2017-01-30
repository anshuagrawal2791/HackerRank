import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anshu on 15/08/16.
 */
public class Solution {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();

        }
//

        quicksort(a,0,a.length-1);
        for(int k =0;k<a.length;k++)
            System.out.print(a[k]+" ");
        System.out.println();

        countsort(a);

    }

    private static void countsort(int[] a) {
        int[] b = new int [1000000];

        for(int i =0;i<a.length;i++){
            b[a[i]]++;
        }
        for(int i=1;i<10;i++){
            b[i]+=b[i-1];
        }
        int output[] = new int[a.length];

        for(int i=0;i<a.length;i++){
            output[b[a[i]]-1]=a[i];
            b[a[i]]--;
        }
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+"-");
        System.out.println();



    }

    private static void quicksort(int[] a, int i, int length) {
        if(i<length){
            int pivot = partition(a,i,length);
               // System.out.println("pivot"+pivot);
//            for(int k =i;k<=length;k++)
//                System.out.print(a[k]+" ");
          //  System.out.println();
            quicksort(a,i,pivot-1);
            quicksort(a,pivot+1,length);
        }

    }

    private static int partition(int[] a, int low, int high) {

        int pivot = a[low],i,j;
       // System.out.println("higlow"+low+"  "+high);
        for( i=low,j=low+1;j<=high;j++){
           // System.out.println(i+"  "+j);
            if(a[j]<pivot){
                i++;
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
//                for(int k =low;k<=high;k++)
//            System.out.print(a[k]+" ");
//        System.out.println();
            }
            //System.out.println(a.toString());
        }
        //i++;
        int temp =a[low];
        a[low]=a[i];
        a[i]=temp;

        return (i);



    }

}
