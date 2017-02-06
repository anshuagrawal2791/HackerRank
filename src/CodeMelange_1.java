import java.util.Scanner;

/**
 * Created by anshu on 06/02/17.
 */
public class CodeMelange_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] sum = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i]+=scan.nextInt();
            }
            sum[i]+=1;
        }
        int aux[] = new int[n];
        for(int i=0;i<n;i++){
            aux[sum[i]-1]++;
        }
        int no_of_zeroes;

        for(int i=0;i<n;i++){
            no_of_zeroes=0;
            for(int j=0;j<sum[i];j++)
            {
                if(aux[j]==0)
                    no_of_zeroes++;
            }
            System.out.print(sum[i]-no_of_zeroes+" ");
        }
    }
}
