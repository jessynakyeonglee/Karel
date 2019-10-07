import java.util.Scanner;

public class SeparatingDigits {
    public static int quotient (int entered){
        int number = entered/10;
        return number;
    }
    public static int remainder (int entered2){
        int number = entered2%10;
        return number;
    }
    public static void main(String[]args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter a four digit number");
        int init = sd.nextInt();
        int first = remainder(init);
        int firstremainder = quotient(init);
        int second = remainder(firstremainder);
        int secondremainder = quotient(firstremainder);
        int third = remainder(secondremainder);
        int thirdremainder = quotient(secondremainder);
        int fourth = remainder(thirdremainder);
        int fourthremainder = quotient(thirdremainder);
        System.out.print(fourth+" "+third+" "+second+" "+first);


    }
}