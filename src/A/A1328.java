import java.util.*;

public class A1328 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(b != 0) {
                System.out.println((b - (a % b)) % b);
            }else{
                System.out.println(0);
            }
        }
    }
}