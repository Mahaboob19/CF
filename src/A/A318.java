package A;

import java.util.*;

public class A318 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long odds = (n+1)/2;
        long res;
        if(k <= odds){
            res = 2*k-1;
        }else{
            res = 2*(k-odds);
        }
        System.out.println(res);
    }
}