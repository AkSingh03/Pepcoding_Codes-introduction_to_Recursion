import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        power(x , n);
        
    }

    public static int power(int x, int n){
        
        if (n == 0){
            
            return 1;
            
        }
        
        int nm1p = power(x,n-1);
        
        int np = (x * nm1p);
        
        return np ;
        
    }

}
