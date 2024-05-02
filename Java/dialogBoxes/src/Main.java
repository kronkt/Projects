import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // establishing field objects
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();

        // creates the layout, adds the labels for each prompt, Y_AXIS arranges the prompts vertically
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Text 1:"));
        panel.add(textField1);
        panel.add(new JLabel("Text 2:"));
        panel.add(textField2);
        panel.add(new JLabel("Text 3:"));
        panel.add(textField3);

        // This creates the header for the dialog box, makes it have the ok_cancel option. PLAIN_MESSAGE is the message-
        // type parameter
        int result = JOptionPane.showConfirmDialog(null, panel, "Enter Information",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String text1 = textField1.getText();
            String text2 = textField2.getText();
            String text3 = textField3.getText();

            System.out.println("Text 1: " + text1);
            System.out.println("Text 2: " + text2);
            System.out.println("Text 3: " + text3);
        }
        // -------------------------------------------------------------------------------------------------------------


        // regular dialog box

        String answer = JOptionPane.showInputDialog("Give me something!");
        System.out.println(answer);

        int yes_no = JOptionPane.showConfirmDialog(null, "Do you like money?", "Question????", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);

    }
}