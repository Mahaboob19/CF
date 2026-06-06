import java.util.*;

public class A59 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int Ucount = 0,Lcount = 0;
        for(char ch : str.toCharArray()){
            if(ch>='a' && ch<='z'){
                Lcount++;
            }else{
                Ucount++;
            }
        }
        if(Lcount > Ucount){
            System.out.println(str.toLowerCase());
        }else if(Lcount < Ucount){
            System.out.println(str.toUpperCase());
        }else{
            System.out.println(str.toLowerCase());
        }
    }
}