package ho0206;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
// 31, 45, 22, 98, 10
    int[]numbers = new int[5]; 
    
    numbers[0] = 31; 
    numbers[1] = 45; 
    numbers[2] = 22; 
    numbers[3]  = 98; 
    numbers[4] = 10; 
    
    int[]numbers2 = {31, 45, 22, 98, 10};
    Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    
    String[] myFavoriteTravels = {"Peru", "Crete", "Cycladen"  };
        System.out.println("Index 2" + ""+ myFavoriteTravels[1] );
        System.out.println("Index 2:" + myFavoriteTravels[2]);
        System.out.println("Length:" +myFavoriteTravels.length);
        
       // Array.get(myFavoriteTravels, 2);
        
    }
}
