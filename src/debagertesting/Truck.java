
package debagertesting;

/**
 * Author: Rudenko Sergiy, 
 * Email: silavsale@gmail.com
 * Created on Feb 6, 2018
 */
public class Truck {
 
    int dors =2;
    double speed =160;
    
    
     Truck(){}
    
    Truck(int a, double b){
    this.dors = a;
    this.speed = b;
    }
    
    public void setValues(int a, double b){
    this.dors = a;
    this.speed = b;
    }
    
    
    @Override
    public String toString(){
    
     return "has " + dors + " dors, and speed is " + speed;
    }
    
}
