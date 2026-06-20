package BasicMaths;

import java.util.Scanner;

public class GCD_HCF {

static void GCD(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n1 number : ");
    int n1 = sc.nextInt();
    System.out.print("Enter n2 number : ");
    int n2 = sc.nextInt();

    int gcd =0;
    //  brute force -----------------------------------------------------
    // =================================================================
    // O(min(n1,n2))
    // ==============================================================

    for(int i = Math.min(n1,n2) ; i>=1; i--){

        if(n1%i == 0 && n2 % i ==0){
            
             gcd = i;
            System.out.println("GCD  =  "+gcd);
            break;
        }

    }

    // =================================================================
    // Euclidean algorithm
    // ------------------------
    // 

    // if(n1>n2){
    //     gcd = (n1-n2,n2);
    // }
    // if(a>b){
    //     gcd = (a-b,b);
    // }

    sc.close();
    
}
    public static void main(String[] args) {
        GCD();
         
    }
}
