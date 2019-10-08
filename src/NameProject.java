import java.util.Scanner;

public class NameProject {
    public static void main (String[]args){

        Scanner name = new Scanner(System.in);
        System.out.println("Enter first name");
        System.out.println("Enter last name");
        String first = name.nextLine();
        String last = name.nextLine();
        int flength = first.length();
        int llength = last.length();
        String firsts = first.substring(0,1)+last.substring(0,1);
        int compare = first.compareTo(last);
        String lastoffirst = first.substring(flength-1);
        int index1 = last.indexOf(lastoffirst);
        String lastoflast = last.substring(llength-1);
        int index2 = first.indexOf(lastoflast);


        System.out.println(first+" "+last);
        System.out.println(flength+llength);
        System.out.println(firsts);
        System.out.println(compare);
        System.out.println(index1);
        System.out.println(index2);


    }
}
