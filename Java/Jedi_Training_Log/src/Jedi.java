import javax.swing.*;
public class Jedi {
    // initialization
    private String jediName;  // name
    private int hours;        // hours
    private double minutes;   // minutes
    private int iterations;     // however many iterations there are

    // Jedi Constructor
    public Jedi(String name, int h, double m, int id){
        jediName = name;
        hours = h;
        minutes = m;
        iterations = id;  // whichever iteration they are a part of is their id
    }

    // mutator fields
    public void setName(String name){
        jediName = name;
    }
    public void setHours(int h){
        hours = h;
    }
    public void setMinutes(double m){
        minutes = m;
    }
    public void setIdNum(int id){
        iterations = id;
    }

    // accessor fields / getters
    public String getJediName(){
        return jediName;
    }
    public int getHours(){
        return hours;
    }
    public double getMinutes(){
        return minutes;
    }
    public double getTotalTime(){

    }
    // get iterations (step 1)
    public int getIterations(){
        iterations = Integer.parseInt(JOptionPane.showInputDialog("How many Jedi will be training?"));
        return iterations;
    }
}