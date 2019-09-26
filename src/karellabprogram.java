import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class karellabprogram {
    public static void main(String[]args){

        City chicago = new City();

        Robot karel = new Robot(chicago, 0,0,Direction.SOUTH, 1);
        Robot carl = new Robot(chicago, 0,3,Direction.EAST  );

        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        carl.pickThing();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.putThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();



    }
}


