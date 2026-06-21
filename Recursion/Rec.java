package Recursion;

import java.util.*;

public class Rec {

    
    static void print(int n){
        if(n <= 0){
            return 0;
        
    }
    else{
        System.out.println(n);
        n--;
    }
    
    print(n);

}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        print(n);
        sc.close();
        
    }
}
