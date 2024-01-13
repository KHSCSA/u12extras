public class RobotRunner {
    public static void main(String[] args){

    }
}

class Robot{
    private Motor leftMotor, rightMotor;
    private int maxSpeed;
    public Robot(){
        this.leftMotor = new Motor();
        this.rightMotor = new Motor();
        this.maxSpeed = 50;
    }
    public void move(int pwr, int deg){
        if(pwr < this.maxSpeed){
            this.leftMotor.spin(pwr, deg);
            this.rightMotor.spin(pwr, deg);
        }
    }
}

class Motor{
    private int currentPosition, power;
    private boolean isSpinning;
    public Motor(){
        this.currentPosition = 0;
    }
    public void spin(int pwr, int deg){
        this.power = pwr;
        this.isSpinning = True;
        while(this.isSpinning){ this.currentPosition++; }
        this.power = 0;
        this.isSpinning = False;
    }
}

class Autonomous{
    public Autonomous(){
        super();
    }

}

class DriverControl{

}
