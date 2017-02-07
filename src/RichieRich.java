import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anshu on 07/02/17.
 */
public class RichieRich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        char[] string = s.toCharArray();
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0;i<Math.ceil((double)n/2);i++){
            if(string[i]!=string[n-1-i]){
                if(k>0){
                    int temp = Math.max(Character.getNumericValue(string[i]),Character.getNumericValue(string[n-i-1]));
//                    System.out.print(temp);
                    string[i]= String.valueOf(temp).charAt(0);
                    string[n-1-i]=String.valueOf(temp).charAt(0);
//                    System.out.print(string);
                    indices.add(i);
                    k--;
                }
                else{
                    System.out.println(-1);
                    return;
                }
            }
        }
        if(k==0){
            for(int i=0;i<n;i++)
                System.out.print(string[i]);
        }
        else{
//            System.out.println(string);
            for(int i=0;i<n/2;i++){
                if(k>0){
                    if(string[i]!='9'){
                        if(indices.contains(i)){
                            string[i]='9';
                            string[n-i-1]='9';
                            k--;
                        }
                        else{
                            if(k>1){
                                string[i]='9';
                                string[n-i-1]='9';
                                k-=2;
                            }
                        }
                    }
                }
                else
                    break;
            }
//            System.out.println(string);
            if(n%2!=0&&k>0){
                string[(int)Math.ceil(n/2)]='9';
                k--;
            }

            for(int i=0;i<n;i++)
                System.out.print(string[i]);

        }
    }




}
