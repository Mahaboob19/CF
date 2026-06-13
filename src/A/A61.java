package A;

import java.util.*;

public class A61 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] str1 = sc.next().toCharArray();
        char[] str2 = sc.next().toCharArray();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str1.length;i++){
            if(str1[i] == str2[i]){
                res.append('0');
            }else{
                res.append('1');
            }
        }
        System.out.println(res.toString());
    }
}