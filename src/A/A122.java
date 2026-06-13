package A;

import java.util.*;

public class A122 {
    public static void genLN(int curr,int lim,ArrayList<Integer> lst){
        if(curr > lim) return;
        if(curr > 0) lst.add(curr);
        genLN(curr*10 + 4, lim, lst);
        genLN(curr*10 + 7,lim, lst);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ln = new ArrayList<>();
        genLN(0,1000,ln);
        boolean isAL = false;
        for(int l : ln){
            if(n % l == 0){
                isAL = true;
                break;
            }
        }
        System.out.println(isAL ? "YES" : "NO");
    }
}