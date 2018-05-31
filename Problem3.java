import java.math.BigInteger;
import java.util.*;


public class Problem3{

    static boolean isPrime(long n){
        boolean yes = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                yes = false;
                break;
            }
        }
        return yes;
    }
    public static void main(String[] args) {
        long n = 600851475143L;
        long i = (long) Math.sqrt(n);
        while(i >= 2){           
            if(n%i == 0 && isPrime(i)){
                System.out.println(i);
                break;
            }
            i--;  
        }
    }
}