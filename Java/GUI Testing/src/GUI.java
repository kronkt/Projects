import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    // constructor for the GUI
    public GUI(){

        frame = new JFrame();
        // creating a button as well as an "action listener" whenever an action is performed, gets sent to actionPerformed
        button = new JButton("Click me!");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100,100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // adds panel to the frame
        frame.add(panel, BorderLayout.CENTER);
        // tells it what to do when you close the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // makes the title name
        frame.setTitle("My GUI");
        // compacts it to make it fit all of the components in
        frame.pack();
        // prioritizes it and makes it visible
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new GUI();
    }
    // this method gets called when the action (or button) gets pressed
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}