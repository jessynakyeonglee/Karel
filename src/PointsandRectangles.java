import java.awt.*;
import java.util.Scanner;

public class PointsandRectangles
{
    public static void main (String[]args){

        Scanner pr = new Scanner(System.in);
        System.out.println("Enter the x coordinate:");
        int x = pr.nextInt();
        System.out.println("Enter the y coordinate:");
        int y = pr.nextInt();
        System.out.println("Enter the width:");
        int width = pr.nextInt();
        System.out.println("Enter the length:");
        int length = pr.nextInt();
        Point p = new Point(x,y);
        System.out.println(p);
        Dimension d = new Dimension(width,length);
        System.out.println(d);
        Rectangle r = new Rectangle(x,y,width,length);
        System.out.println(r);





    }

}
