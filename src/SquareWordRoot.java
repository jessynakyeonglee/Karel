import java.util.Scanner;

public class SquareWordRoot {
    public static void main(String[]args){

        Scanner swr = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = swr.next();
        double sqrtednum = Math.sqrt(word.length())+0.5;
        String sqrtedword = word.substring((int)(sqrtednum),(int)(sqrtednum)+1);
        System.out.print("The \"square root\" of "+word+" is "+sqrtedword);










    }
}
