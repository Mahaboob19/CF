package A;

import java.util.*;

public class A344 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = sc.next();
        int count = 1;
        for(int i=1;i<n;i++){
            String curr = sc.next();
            if(prev.charAt(1) == curr.charAt(0)){
                count++;
            }
            prev = curr;
        }
        System.out.println(count);
    }
}