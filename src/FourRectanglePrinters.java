import java.awt.*;

public class FourRectanglePrinters {
    public static void main (String[]args){

        Rectangle box = new Rectangle(0,0,5,10);
        System.out.println(box);
        box.translate(5,0);
        System.out.println(box);
        box.translate(5,-10);
        System.out.println(box);
        box.translate(0,-10);
        System.out.println(box);



    }
}
