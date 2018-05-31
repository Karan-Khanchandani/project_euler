import java.util.*;

public class Problem4{
    static boolean isPalin(int num){
        String s = String.valueOf(num);
        String r = new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        for(int i = 999 ; i >= 100; i--){
            for(int j = 999; j >= 100; j--){
                int prod = i*j;
                if(isPalin(prod)){
                   max = Math.max(max, prod);
                }
            }
        }
        System.out.println(max);
    }
}