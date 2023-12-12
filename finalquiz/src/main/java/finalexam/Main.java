package finalexam;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

//author: cassie berry

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Chemistry Quiz");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonPanel myPanel = new ButtonPanel();
        myFrame.add(myPanel);
        myFrame.pack();
        myFrame.setVisible(true);

    }
}