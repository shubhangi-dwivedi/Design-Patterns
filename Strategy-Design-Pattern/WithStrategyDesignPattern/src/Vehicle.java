import Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj; // not doing = new SportsDriveStrategy etc, as it'll be bound to that specific class

    //Constructor injection
    Vehicle(DriveStrategy driveObj){
        this.driveObj=driveObj; //assign the obj of which  every class will be received
    }

    public void drive(){
        driveObj.drive();
    }

}
