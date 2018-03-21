    package ho0203;
import java.awt.Color;
public class Car {
/****
 * Data types 
 * int 
 * double 
 * String
 * Color > AWT library
 * bool     */

double averageMilesPerGallon; 
String licensePlate; 
Color paintColor; 
boolean areTailingWorking; 

public Car (
        double inputAverageMPG, 
        String inputLicensePlate, 
        Color inputPaintColor, 
        boolean inputAreTaillightsWorking) { 
        
        this.averageMilesPerGallon = inputAverageMPG; 
        this.licensePlate = inputLicensePlate; 
        this.paintColor = inputPaintColor; 
        this.areTailingWorking = inputAreTaillightsWorking; 
}
        public void changePaintColor(Color newPaintColor) { // signture 
        this.paintColor = newPaintColor; 
        }

} 