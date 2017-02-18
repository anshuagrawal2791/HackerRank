import java.util.Scanner;

/**
 * Created by anshu on 17/02/17.
 */
public class UniversityCodeSprint2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max=0,min=0;
        int max_changes=0,min_changes=0;
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            if(i==0){
                max=a;
                min=a;
            }
            else{
                if(a>max){
                    max=a;
                    max_changes++;

                }
                else if(a<min){
                    min=a;
                    min_changes++;
                }
            }
        }
        System.out.println(max_changes+" "+min_changes);
    }
}
