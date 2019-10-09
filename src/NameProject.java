import java.util.Scanner;

public class NameProject {
    public static void main (String[]args){

        String first = "Carl";
        String last = "Sagan";
        int flength = first.length();
        int llength = last.length();
        String firsts = first.substring(0,1)+last.substring(0,1);
        int compare = first.compareTo(last);
        String lastoffirst = first.substring(flength-1);
        int index1 = last.indexOf(lastoffirst);
        String lastoflast = last.substring(llength-1);
        int index2 = first.indexOf(lastoflast);
        String fakefirst = first.substring(0,flength/2)+last.substring(llength/2);
        String fakelast = last.substring(0,llength/2)+first.substring(flength/2);

        System.out.println(first+" "+last);
        System.out.println(flength+llength);
        System.out.println(firsts);
        System.out.println(compare);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(fakefirst+" "+fakelast);

    }
}
