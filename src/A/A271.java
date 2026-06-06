import java.util.*;

public class A271 {
    public static boolean hasDis(int yr){
        boolean[] seen = new boolean[10];
        while (yr > 0){
            int dig = yr % 10;
            if(seen[dig]) return false;
            seen[dig] = true;
            yr /= 10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true){
            n++;
            if(hasDis(n)){
                System.out.println(n);
                break;
            }
        }
    }
}