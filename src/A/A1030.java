import java.util.*;

public class A1030 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hard = false;
        while(n > 0){
            int a = sc.nextInt();
            if(a == 1){
                hard = true;
            }
            n--;
        }
        System.out.println((hard) ? "HARD" : "EASY");
    }
}