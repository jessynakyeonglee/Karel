import java.util.Scanner;

public class NameProject {
    public static void main (String[]args){

        String first = "Carl";
        String last = "Sagan";

        System.out.println(first+" "+last);
        System.out.println(first.length()+last.length());
        System.out.println(first.substring(0,1)+last.substring(0,1));
        System.out.println(first.compareTo(last));
        System.out.println(last.indexOf(first.substring(first.length()-1)));
        System.out.println(first.indexOf(last.substring(last.length()-1)));
        System.out.println(first.substring(0,first.length()/2)+last.substring(last.length()/2)+" "+last.substring(0,last.length()/2)+first.substring(first.length()/2));

    }
}
