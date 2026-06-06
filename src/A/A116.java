import java.util.*;

public class A116 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxC = 0;
        int pC = 0;
        for(int i=1;i<=n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            pC -= a;
            pC += b;
            maxC = Math.max(maxC,pC);
        }
        System.out.println(maxC);
    }
}