import java.util.*;

public class A71{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            int n = str.length();
            if(n > 10){
                StringBuilder res = new StringBuilder();
                res.append(str.charAt(0));
                res.append(n-2);
                res.append(str.charAt(n-1));
                System.out.println(res.toString());
            }else{
                System.out.println(str);
            }
        }
    }
}