package A;

import java.util.*;

public class A228 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> cols = new HashSet<>();
        for(int i=0;i<4;i++){
            cols.add(sc.nextInt());
        }
        System.out.println(4- cols.size());
    }
}