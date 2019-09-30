import java.awt.Rectangle;
import java.util.Scanner;
public class rectanglefun
{
    public static void main (String[]args)
    {

        Scanner rf = new Scanner(System.in);
        System.out.print("Width:");
        int width = rf.nextInt();
        System.out.print("Length:");
        int length = rf.nextInt();
        System.out.print("X:");
        int X = rf.nextInt();
        System.out.print("Y:");
        int Y = rf.nextInt();

        Rectangle r = new Rectangle(X,Y,width,length);
        double perimeter = r.getWidth()*2+r.getHeight()*2;
        System.out.println("Perimeter:"+ perimeter);
        r.setLocation(X-4,Y+2);
        System.out.println("New location is ("+r.getX()+","+r.getY()+")");
        }


    }


