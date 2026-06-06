import java.util.*;

public class A281{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println(str);
    }
}