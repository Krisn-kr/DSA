package BasicMaths;
import java.util.*;

public class PrimeNumber {


    static void checkprime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();



    //  Extreme brute force approach 
    // ===========================
    // o(n) ------>TC
   // ============================

        int cnt = 0; 
        for(int i = 2; i<n ; i++){

            if(n % i == 0){
                cnt++;
            } 
        }
        if(cnt == 2){
            System.out.println("Prime");
        } else{
            System.out.println("Not Prime");
        }


    // better solution
    // ===========================
    // o(sqrt(n)) ------>TC
   // ============================

    for(int i = 2; i*i<=n ; i++){

            if(n % i == 0){
                cnt++;
            } 
        }
        if(cnt == 2){
            System.out.println("Prime");
        } else{
            System.out.println("Not Prime");
        }



        sc.close();

    }
    public static void main(String[] args) {
        checkprime();
        
    }
}
