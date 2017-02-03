import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anshu on 01/02/17.
 */
public class Abbreviation {
    public static ArrayList<String> visited;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i=0;i<q;i++){
            visited = new ArrayList<>();
            String a = scan.next();


            if(check(a,scan.next()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean check(String a, String b) {
        visited.add(a);
        if(a.toLowerCase().matches(b.toLowerCase()))
            return true;
        for(int i=0;i<a.length();i++){
            String p = a.substring(0,i).concat(a.substring(i+1,a.length()));
            if(Character.isLowerCase(a.charAt(i))&&!visited.contains(p)){
                if(check(p,b)==true)
                    return true;
            }
        }
        return false;
    }
}
