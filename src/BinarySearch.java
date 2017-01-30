/**
 * Created by anshu on 20/08/16.
 */
public class BinarySearch {

    public static void main(String [] args){

        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 1;
        int result = binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);


    }

    static int binarySearch(int [] a, int low,int high,int x){
        int m = (high+low)/2;
        if(high>=low) {
            if (a[m] == x)
                return m;
            else if (a[m] > x)
                return (binarySearch(a, low, m - 1, x));
            else
                return (binarySearch(a, m + 1, high, x));
        }
        return -1;

    }
}
