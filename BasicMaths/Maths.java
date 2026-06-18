package BasicMaths;

public class Maths {

    static void extractDigits(){
        int n = 1234;
        int digit;
        while(n>0){
            int lastDigit = n%10;
            System.out.println(lastDigit);
            n /= 10;


        }
    }
    public static void main(String[] args) {
        extractDigits();
        
    }
}
