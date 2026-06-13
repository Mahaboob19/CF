package A;

import java.util.*;

public class A2236 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                min = Math.min(arr[i],min);
                max = Math.max(arr[i],max);
            }
            System.out.println(max - min + 1);
        }
    }
}