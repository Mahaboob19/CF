import java.util.*;

public class A339 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("\\+");
        Arrays.sort(arr);
        System.out.print(arr[0]);
        for(int i=1;i<arr.length;i++){
            System.out.print("+" + arr[i]);
        }
    }
}