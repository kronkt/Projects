import org.junit.Test;
import static org.junit.Assert.*;

public class Tristan_Speer_TemperatureTest {

    @Test
    public void testGetFahrenheit() {

        Tristan_Speer_Temperature temperature = new Tristan_Speer_Temperature(32.0);


        double result = temperature.getFahrenheit();


        assertEquals(32.0, result, 0.0);
    }

    @Test
    public void testGetCelsius() {

        Tristan_Speer_Temperature temperature = new Tristan_Speer_Temperature(32.0);

        // Call the method you want to test
        double result = temperature.getCelsius();

        // Use assertions to verify the expected result
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testGetKelvin() {

        Tristan_Speer_Temperature temperature = new Tristan_Speer_Temperature(32.0);


        double result = temperature.getKelvin();


        assertEquals(273.15, result, 0.01);
    }
}