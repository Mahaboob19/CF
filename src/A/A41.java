package A;

import java.util.*;

public class A41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        /*
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev.equals(str1) ? "YES" : "NO");
        */
        if(str1.length() != str2.length()){
            System.out.println("NO");
            return;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt(str2.length() - 1 - i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}