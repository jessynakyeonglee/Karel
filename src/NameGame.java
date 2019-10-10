import java.util.Scanner;

public class NameGame {

    public static void verse (String name) {

        System.out.println(name+" "+name+", bo-B"+name.substring(1));
        System.out.println("Banana-fana fo-F"+name.substring(1));
        System.out.println("Fee-fi-mo-M"+name.substring(1));
        System.out.println(name.toUpperCase()+"!");
        System.out.println("");

    }
    public static void main(String[]args){

        Scanner ng = new Scanner(System.in);
        System.out.println("Enter first name");
        System.out.println("Enter last name");
        String firstname = ng.nextLine();
        String lastname = ng.nextLine();
        verse(firstname);
        verse(lastname);
    }
}