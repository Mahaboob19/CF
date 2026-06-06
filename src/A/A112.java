import java.util.*;

public class A112{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) < str2.charAt(i)){
                System.out.println(-1);
                return;
            }
            if(str1.charAt(i) > str2.charAt(i)){
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}