import java.util.*;

public class A734 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int aC = 0,dC = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'A'){
                aC++;
            }else{
                dC++;
            }
        }
        System.out.println((aC > dC) ? "Anton" : (dC > aC) ? "Danik" : "Friendship");
    }
}