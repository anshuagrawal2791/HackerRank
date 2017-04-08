import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by anshu on 15/03/17.
 */
public class WeekOfCode30_3 {
    static char vowels[] = new char[]{'a','e','i','o','u'};
    static char consonants[] = new char[]{'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
    static String[] list2;
    static int index;
    public static void main(String[] args) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();

        if(n==6){
            char word[] = new char[2];
            list2 = new String[200];
            index=0;
            for (int i = 0; i < vowels.length; i++) {
                word[0] = vowels[i];
                print2(word, 1, true, 2);
            }
            for (int i = 0; i < consonants.length; i++) {
                word[0] = consonants[i];
                print2(word, 1, false, 2);
            }
//            System.out.println(list2[0]);
            ArrayList<String> list = new ArrayList<>();
            for(int i=0;i<200;i++){
                for(int j=0;j<200;j++){
                    for(int k=0;k<200;k++){
                        list.add(list2[i]+list2[j]+list2[k]);
                    }
                }
            }
            for(int i=0;i<list.size();i++)
                System.out.println(list.get(i));
        }else {
            char word[] = new char[n];
            for (int i = 0; i < vowels.length; i++) {
                word[0] = vowels[i];
                print(word, 1, true, n);
            }
            for (int i = 0; i < consonants.length; i++) {
                word[0] = consonants[i];
                print(word, 1, false, n);
            }
        }


    }

    private static void print(char[] word, int i, boolean isVowel, int n) {

        if(i==n){
            System.out.println(word);
        }
        else if(isVowel){
            for(int j=0;j<consonants.length;j++){
                word[i]=consonants[j];
                print(word,i+1,false,n);
            }
        }
        else{
            for(int j=0;j<vowels.length;j++){
                word[i]=vowels[j];
                print(word,i+1,true,n);
            }
        }
    }
    private static void print2(char[] word, int i, boolean isVowel, int n) {

        if(i==n){
            list2[index++]=String.valueOf(word);
        }
        else if(isVowel){
            for(int j=0;j<consonants.length;j++){
                word[i]=consonants[j];
                print2(word,i+1,false,n);
            }
        }
        else{
            for(int j=0;j<vowels.length;j++){
                word[i]=vowels[j];
                print2(word,i+1,true,n);
            }
        }
    }
}
