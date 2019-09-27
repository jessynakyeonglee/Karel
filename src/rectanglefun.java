import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
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
        int perimeter = 2*width+2*length;
        System.out.println("Perimeter:"+ perimeter);

        }


    }


