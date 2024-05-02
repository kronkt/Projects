import javax.swing.JOptionPane;

public class Tristan_Speer_Assignment_02 {
    public static void main(String[] args) {

        String firstName;      // First Name
        String middleName;     // Middle Initial
        String lastName;       // Last Name
        int age;               // Age
        double grossAnnualPay; // Gross Annual Pay
        double taxRate;        // Tax Rate
        double netAnnualPay;

        // Gathering inputs for previous variables
        firstName = JOptionPane.showInputDialog("Please give your first name.");
        middleName = JOptionPane.showInputDialog("Please give your middle name.");

        // Convert string to char (use this from now on)
        char middleInitial = middleName.charAt(0);

        // continued...
        lastName = JOptionPane.showInputDialog("Please give your last name.");
        age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age."));
        grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("Please enter your gross annual pay."));
        taxRate = Double.parseDouble(JOptionPane.showInputDialog("Please enter your tax rate."));

        // math time
        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);

        // output
        System.out.printf(" Hello %s %c. %s, \n You are %s years old now. \n It is amazing that you made $%s this year." +
                " With the tax rate of %s, you can take home $%s.",firstName, middleInitial, lastName, age, +
                grossAnnualPay, taxRate, netAnnualPay);


    }
}