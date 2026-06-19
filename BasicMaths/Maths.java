package BasicMaths;
import java.util.*;
// import 
public class Maths {


    // ========================================
    //  O(log 10 (N))
    // ========================================
    
    static void extractDigits(){
        int n = 1234;
        int digit;
        while(n>0){
            int lastDigit = n%10;
            System.out.println(lastDigit);
            n /= 10;


        }

        // or

        // int cnt = (int)(Math.log10(n)+1);
        // System.out.println(cnt);
    }

    // Reverse number

    static void reverseNumber(){

        int n = 12345;
        int rNum=0;

        while(n>0){
            int digit = n%10;
            rNum = rNum *10 + digit;
            n/=10;



        }
        System.out.println("Reverse Number : "+ rNum);

        
    }

    // palindrom
    static void palindrom(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        // checking palindrom
        int rev = 0;
        int dup = n;

        while(n>0){
            int digit = n%10;
            n /=10;
            rev = (rev*10) + digit;
        }

        if(rev == dup){
            System.out.println("Entered number is a palindrom ");;
        }

    }
    public static void main(String[] args) {
        extractDigits();
        reverseNumber();
        palindrom();
        
    }
}
