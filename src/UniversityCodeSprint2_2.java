import java.util.Scanner;

/**
 * Created by anshu on 17/02/17.
 */
public class UniversityCodeSprint2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int p=0;p<q;p++){
            String s = scan.next();
            boolean flag=true;
            for(int i=1;i<s.length()+1;i++){
                String a,b;
                a= s.substring(0,i);
                b = s.substring(i,s.length());

                if(a.length()>0&&b.length()>=a.length()) {
//                    System.out.println(a + " " + b);
//                    System.out.println(check(s.substring(0, i), s.substring(i, s.length())));
                    if(check(a,b)){
                        System.out.println("YES " + a);
                        flag=false;
                        break;
                    }

                }
            }
            if(flag)
                System.out.println("NO");
        }
    }

    private static boolean check(String number, String string) {
        System.out.println(number+" "+string);
        if(string.length()==0)
            return true;
        if(string.length()<number.length())
            return false;
        if(number.length()>1&&number.charAt(0)=='0')
            return false;
        double n = Double.parseDouble(number);
        String s1="",s2="";
        int i;
        if(number.charAt(number.length()-1)!='9'){
            for(i=0;i<number.length();i++)
                s1=s1.concat(String.valueOf(string.charAt(i)));
        }
        else if(number.charAt(number.length()-1)=='9'){

//            if(string.length()>number.length())
//            {
//                for(i=0;i<number.length()+1;i++){
//                    s2=s2.concat(String.valueOf(string.charAt(i)));
//                }
//            }
            if(number.matches("[9]+")&&number.length()<string.length()){
                for(i=0;i<number.length()+1;i++){
                    s1=s1.concat(String.valueOf(string.charAt(i)));
                }
            }
            else{
                for(i=0;i<number.length();i++){
                    s1=s1.concat(String.valueOf(string.charAt(i)));
                }
            }
        }
        else
            return false;

        if(Double.parseDouble(s1)-1==n)
        {

            return check(s1,string.substring(i,string.length()));
        }
        else
            return false;
    }
}
