public class SDV{
    // define your attributes here
    private int idNum, wheelSize, totalDistance;
    private boolean hasVision;
    private String name;

    // this is the constructor
    // similar to __init__ in Python
    public SDV(String nameParam){
        System.out.println("...constructing new SDV object...");
        this.hasVision = false;
        this.wheelSize = 6;
        this.idNum = (int)(Math.random()*900) + 100;
        this.name = nameParam;
        this.totalDistance = 0;
    } // close constructor

    // note that these methods are NOT 'static' methods!
    public void sayHello(){
        System.out.println(this.name + " says hello!");
    }

    public void moveForward(int amt){
        System.out.println(this.name + " is moving forward");
        this.totalDistance += amt;
    }

    public void turnLeft(){
        System.out.println(this.name + " is turning left");
    }

    public void turnRight(){
        System.out.println(this.name + " is turning right");
    }

    public boolean getVision(){
        return this.hasVision;
    }

    /*
    // another 'default' method that we should write
    public String toString(){
        String temp = "";
        temp += this.name + " has traveld " + this.totalDistance + " units.";
    }
    */


} // close class