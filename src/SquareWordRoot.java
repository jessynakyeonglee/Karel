import java.util.Scanner;
//This program will give you the square rooted number of
public class SquareWordRoot {
    public static void main(String[]args){

        Scanner swr = new Scanner(System.in);
        System.out.println("Enter your word:");
        String urword = swr.next();
        double sqrtednum = Math.sqrt(urword.length())+0.5;
        String sqrtedword = urword.substring((int)(sqrtednum),(int)(sqrtednum)+1);
        System.out.print("The \"square root\" of "+urword+" is "+sqrtedword);










    }
}
