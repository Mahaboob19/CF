import java.util.*;

public class A58 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String t = "hello";
        int j=0;
        for(int i=0;i<str.length() && j<t.length();i++){
            if(str.charAt(i) == t.charAt(j)){
                j++;
            }
        }
        System.out.println(j==t.length() ? "YES" : "NO");
    }
}