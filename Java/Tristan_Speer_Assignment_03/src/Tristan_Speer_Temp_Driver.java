import java.util.*;

public class Tristan_Speer_Temp_Driver {

    public static void main(String[] args){
        // making scanner object
        Scanner input = new Scanner(System.in);
        // getting fahrenheit temp
        System.out.println("Enter Fahrenheit temp: ");
        int ftemp = input.nextInt();
        // creating new temperature object
        Tristan_Speer_Temperature temp = new Tristan_Speer_Temperature(ftemp);
        // outputs
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Kelvin: " + temp.getKelvin());
    }

}
