import java.util.Scanner;

public class Courses {
    public static void main(String[]args){

        Scanner cs = new Scanner(System.in);
        System.out.println("What is the description of the course?");
        String course = cs.next();
        String dpmt = course.substring(0,course.indexOf("''"));
        System.out.println(dpmt);

    }
}
