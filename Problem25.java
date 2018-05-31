import java.math.BigInteger;
import java.util.*;

public class Problem25{
    
    public static void main(String[] args) {
       double phip = 0.5*(1 + Math.sqrt(5));
        double num = 999 + 0.5*Math.log10(5);
        double den = Math.log10(phip);
        System.out.println(Math.ceil(num/den));
    }
}