package ho0203;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        
        Car myCar = new Car (
            25.5, 
            "1bcBLEU",
            Color.BLUE, true );
        
           Car redCar = new Car (
            25.5, 
            "1bcRED",
            Color.RED, false );
           
           System.out.println("My car's liceseplate:" + myCar.licensePlate);
        System.out.println("My Redcar's liceseplate:" + redCar.licensePlate);
        
        System.out.println(myCar.paintColor.toString());
        redCar.changePaintColor(Color.PINK);
        System.out.println(redCar.paintColor.toString());
         
    } 
} 
       