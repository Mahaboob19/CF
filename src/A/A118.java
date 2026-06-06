import java.util.*;

public class A118{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder res = new StringBuilder();
        String vol = "AEIOUYaeiouy";
        for(char ch : str.toCharArray()){
            if(vol.indexOf(ch) == -1){
                res.append('.').append(Character.toLowerCase(ch));
            }
        }
        System.out.println(res.toString());
    }
}