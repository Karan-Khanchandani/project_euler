import java.util.*;


public class Problem6{
    static long calc(long n){
        long sq_sum = (n*(n+1)*(2*n+1))/6;
        long sum_sq = (n*n*(n+1)*(n+1))/4;
        return sum_sq - sq_sum;

    }
    public static void main(String[] args) {
        System.out.println(calc(10));
        System.out.println(calc(100));
    }
}