import java.util.Scanner;

public class Password {
    public static void main (String[]args){


        Scanner pw = new Scanner(System.in);
        System.out.println("Enter first name");
        System.out.println("Enter middle name");
        System.out.println("Enter last name");
        System.out.println("Enter age");
        String first = pw.nextLine();
        String middle = pw.nextLine();
        String last = pw.nextLine();
        int age = pw.nextInt();
        String part1 = first.substring(first.length()/2,first.length()/2+1)+middle.substring(middle.length()/2,middle.length()/2+1)+last.substring(last.length()/2,last.length()/2+1);
        String part2 = first.substring(first.length()-1)+middle.substring(middle.length()-1)+last.substring(last.length()-1);
        int part3 = age*75;
        System.out.println("Password: "+part1.toUpperCase()+part2+part3);








    }
}
