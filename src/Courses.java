import java.util.Scanner;

public class Courses {
    public static void main(String[]args){

        Scanner cs = new Scanner(System.in);
        System.out.println("What is the description of the course?");
        String course = cs.nextLine();

        int blank = course.indexOf(" ");
        String dpmt = course.substring(0,blank);
        System.out.println("Department: "+dpmt);
        int blank2 = course.indexOf(" ",blank+1);
        String coursenumber = course.substring(blank,blank2);
        System.out.println("Course numver: "+coursenumber);
        String title = course.substring(blank2);
        System.out.println("Title: "+title);

    }
}
