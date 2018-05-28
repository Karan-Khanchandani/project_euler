import java.util.*;

public class Problem2{
    public static void main(String[] args) {
        int a = 1, b = 2;
        int sum = b;
        int c = 0;
        while(c < 4e6){   
            c = a+b;
            if(c %2 == 0) sum += c;
            a = b; b = c;
        }
        System.out.println(sum);
        
       
    }
}