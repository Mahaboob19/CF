import java.util.*;

public class A236{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Character> dis = new HashSet<>();
        for(int i=0;i<str.length();i++){
            dis.add(str.charAt(i));
        }
        System.out.println((dis.size() % 2) == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}