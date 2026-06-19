package BasicMaths;
import java.util.*;
import java.math.*;
// import 
public class Maths {


    // ========================================
    //  O(log10(N))
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
    

    // Amstrog number
    static void anstrongNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int dupl = n;
        

        int sum = 0;
        while(n>0){
            int digit = n%10;
            n/=10;

            sum = sum +(digit*digit*digit);

        }
        if(dupl == sum){
            System.out.println("anstrong ");
        }else{
        System.out.println("not Anstrong");}



    }
    

    // print all divisons
// ==========================================
//  O(n) -----> time complpexity
// ============================================
    static void division(){

        System.out.println("\nDivion : ");
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i =1 ; i<=n; i++){
            if(n % i == 0){
                System.out.println(n+ " divisible by : "+i );
            }
        }

        // alternate way = better way


        // for(int i = 1; i<= Math.sqrt(n); i++){
        
        // for better time complexity -----------use this
            for(int i =1; i*i<=n ;i++ ){

             // Storing in the list

        

            if(n % i ==0){
                System.out.println(i);
                list.add(i);
                if(n/i != i){
                    System.out.println(n/i);
                    list.add(n/i);
                }


            }
            

        }
        System.out.println("unsorted \nList elemet : "+ list);

        System.out.print("Sorted \nList elements : ");

       Collections.sort(list);
       System.out.println(list);

    

       




    }
    


    // 
    public static void main(String[] args) {
        extractDigits();
        reverseNumber();
        // palindrom();
        // anstrongNumber();
        division();
    }
}
