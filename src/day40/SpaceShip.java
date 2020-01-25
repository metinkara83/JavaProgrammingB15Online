package day40;

public class SpaceShip {

    String name;
    int xCoordinate;
    int yCoordinate;
    String currentDirection; // up , down , right , left

    // provide initial position of spaceship with two int parameters
    public void setInitialPosition(int x , int y){
        xCoordinate = x;
        yCoordinate = y;
    }

    //
    public void setDirection(String direction){
       if (    direction.equalsIgnoreCase("up")||
               direction.equalsIgnoreCase("down")||
               direction.equalsIgnoreCase("right")||
               direction.equalsIgnoreCase("left")) {
           currentDirection = direction.toLowerCase();
       } else {
           System.out.println("Invalid Direction!");
       }
        move1Block();
    }

    public void move1Block(){
        switch (currentDirection){
            case "up":
                ++yCoordinate;
                break;
            case "down":
                --yCoordinate;
                break;
            case "right":
                ++xCoordinate;
                break;
            case "left":
                --xCoordinate;
                break;
            default:
                break;
        }
    }

    public String toString() {
        return "SpaceShip{" +
                "name = '" + name + '\'' +
                " , xCoordinate = " + xCoordinate +
                " , yCoordinate = " + yCoordinate +
                " , currentDirection='" + currentDirection + '\'' +
                '}';
    }
}

