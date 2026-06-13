package A;

import java.util.*;

public class A136 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n+1];
        for(int i=1;i<=n;i++){
            ans[arr[i]] = i;
        }
        for(int i=1;i<=n;i++){
            System.out.println(ans[i]+" ");
        }
    }
}