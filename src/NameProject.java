import java.util.Scanner;

public class NameProject {
    public static void main (String[]args){

        Scanner name = new Scanner(System.in);
        System.out.print("Enter first name");
        System.out.println("Enter last name");
        String first = name.nextLine();
        String last = name.nextLine();
        int length = first.length()+last.length();
        int subs = first.substring(0,2);



        System.out.println(subs);


    }
}
