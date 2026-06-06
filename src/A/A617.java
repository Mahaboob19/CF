import java.util.*;

public class A617 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = n % 5;
        if(rem == 0){
            System.out.println((n / 5));
        }else{
            System.out.println((n/5)+1);
        }
    }
}