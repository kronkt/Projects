public class Tristan_Speer_Temperature{

    private double ftemp;
// constructor
    public Tristan_Speer_Temperature(double fahrenheit){
        ftemp = fahrenheit;
    }
// stores fahrenheit into ftemp
    public void setFahrenheit(double fahrenheit){
        ftemp = fahrenheit;
    }
    public double getFahrenheit(){
        return ftemp;
    }
    public double getCelsius(){
        return (5.0/9.0)*(ftemp-32);
    }
    public double getKelvin(){
        return ((5.0/9.0)*(ftemp-32))+273;
    }
}