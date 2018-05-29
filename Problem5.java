import java.util.*;
public class Problem5{
    static long gcd(long x , long y){
        if(y == 0) return x;
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long p = 1;
        for(int i = 2; i <=n; i++){
            p = ((((long)i * p)) /
            (gcd((long)i, p)));
        }
        System.out.println(p);
    }
}