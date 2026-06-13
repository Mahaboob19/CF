package B;

import java.util.*;

public class B200 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int fract = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            fract += arr[i];
        }
        double res = (double) fract / n;
        System.out.println(res);
    }
}