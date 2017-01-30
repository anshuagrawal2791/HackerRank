import java.util.Scanner;

/**
 * Created by anshu on 22/12/16.
 */
public class HackonacciNumber {
    public static void main(String[] args) {
//        char a[] = new char[2000*2000];
//        getNumbers(a);
//        for(int i=0;i<a.length;i++)
//            System.out.println(i+1+" "+a[i]);
        int a[] = new int[7];
        a[1]='o';
        a[2]='e';
        a[3]='o';
        a[4]='e';
        a[5]='e';
        a[6]='o';
        a[0]='o';
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int [] queries = new int[q];
        int [] answers = new int[4];
        for(int i=0;i<q;i++)
            queries[i]=(scan.nextInt()/90)%4;

        char b[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[(int)((Math.pow((i+1)*(j+1),2))%7)]=='o'){
//                    System.out.println((i+1)+" "+(j+1));
                    b[i][j]='y';
                    b[j][i]='y';
                }
                else{
                    b[i][j]='x';
                    b[j][i]='x';
                }
            }
        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++)
//                System.out.print(b[i][j]+" ");
//            System.out.println();
//        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                if(b[i][j]!=b[j][n-i-1]){
//                    System.out.println("90---"+(i)+" "+(j));
//                    if(i==j)
//                        answers[1]++;
//                    else
                        answers[1]+=1;
                }if(b[i][j]!=b[n-1-i][n-1-j]){
//                    if(i==j)
//                        answers[2]++;
//                    else
                        answers[2]+=1;
                }if(b[i][j]!=b[n-1-j][i]){
//                    if(i==j)
//                        answers[3]++;
//                    else
                        answers[3]+=1;
                }
            }
        }
//        for(int i=0;i<answers.length;i++)
//            System.out.print(answers[i]*2+" ");
        for(int i=0;i<queries.length;i++){
            System.out.println(answers[queries[i]]);
        }
    }

//    private static void getNumbers(char[] a) {
//        a[0]='o';
//        a[1]='e';
//        a[2]='o';
//        a[3]='e';
//        a[4]='e';
//        a[5]='o';
//        a[6]='o';
//        for(int i=7;i<a.length;i++){
//            a[i]=a[i-7];
//        }
//    }
}
