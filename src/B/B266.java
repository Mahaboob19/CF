import java.util.*;

public class B266 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] str = sc.next().toCharArray();
        while(t-- > 0){
            for(int i=0;i<n-1;i++){
                if(str[i]=='B' && str[i+1]=='G'){
                    char temp = str[i];
                    str[i] = str[i+1];
                    str[i+1] = temp;
                    i++;
                }
            }
        }
        System.out.println(new String(str));
    }
}