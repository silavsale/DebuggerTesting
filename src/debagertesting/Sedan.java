package debagertesting;

/**
 * Author: Rudenko Sergiy, Email: silavsale@gmail.com Created on Feb 6, 2018
 */
public class Sedan {

     int dors = 4;
     double speed = 250;

    Sedan() {
    }

    Sedan(int a, double b) {
        this.dors = a ;
        this.speed = b ;
    }
    
    public void setValues(int a, double b) {
        this.dors = a ;
        this.speed = b ;
    }
 
    @Override
    public String toString() {

        return "has " + dors + " dors, and speed is " + speed;
    }
}
