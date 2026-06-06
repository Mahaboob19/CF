import java.util.*;

public class A677 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] arr = new int[n];
        int wd = 0;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(arr[i] <= h){
                wd = wd + 1;
            }else{
                wd = wd + 2;
            }
        }
        System.out.println(wd);
    }
}