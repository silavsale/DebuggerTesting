/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debagertesting;

/**
 *
 * @author silav
 */
public class DebagerTesting {

    public static void main(String[] args) {

        final int speedLimit = 110;
        boolean seatBelts;

        Truck FordF150 = new Truck();
        Sedan NissanAltima = new Sedan();

        // TODO code application logic here
        System.out.println("List of cars with properties");

        FordF150.dors = 4;

        FordF150.speed = 132;

        seatBelts = true;
        
        
        System.out.println("FordF150 " + FordF150.toString());

        FordF150.setValues(6, 200);

        System.out.println("FordF150 " + FordF150.toString());

        System.out.println("NissanLife " + NissanAltima.toString());

        NissanAltima.setValues(5, 200);

        System.out.println("NissanLife " + NissanAltima.toString());

        System.out.println("End of the program");
        
        

    }

}
