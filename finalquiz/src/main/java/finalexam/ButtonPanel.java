package finalexam;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;


public class ButtonPanel extends JPanel {

    //Initiating labels and creating the form
    private JLabel Question1;
    private JLabel Question2;
    private JLabel Question3;
    private JLabel Question4;
    private JLabel Question5;
    private JLabel Question6;
    private JLabel Question7;
    private JLabel Question8;
    private JTextField Answer1;
    private JTextField Answer2;
    private JTextField Answer3;
    private JTextField Answer4;
    private JTextField Answer5;
    private JTextField Answer6;
    private JTextField Answer7;
    private JTextField Answer8;
    private String response1;
    private String response2;
    private String response3;
    private String response4;
    private String response5;
    private String response6;
    private String response7;
    private String response8;
    private double Points;
    private JLabel score;


    //Creating the window
    public ButtonPanel () {
        initPanel();
    }

    private void initPanel() {
        setPreferredSize(new Dimension(500,300));
        setBackground(Color.LIGHT_GRAY);


        //Making the questions
        Question1 = new JLabel("How many protons are in Carbon? ");
        Question2 = new JLabel("Write the number of electrons on a neutral Bromine atom: ");
        Question3 = new JLabel("How many elements are considered halogens? ");
        Question4 = new JLabel("How many neutrons are in Flourine? ");
        Question5 = new JLabel("Write the full electron configuration for Silver: ");
        Question6 = new JLabel("Write the condensed electron configuration for Selenium: ");
        Question7 = new JLabel("What is the 17th element on the Periodic Table of Elements? ");
        Question8 = new JLabel("How many electrons does a 1+ charged Xenon have? ");

        //Adding space for responses
        Answer1 = new JTextField(4);
        Answer2 = new JTextField(4);
        Answer3 = new JTextField(4);
        Answer4 = new JTextField(4);
        Answer5 = new JTextField(12);
        Answer6 = new JTextField(12);
        Answer7 = new JTextField(4);
        Answer8 = new JTextField(4);

        //Adding the action listeners to the textfields
        Answer1.addActionListener(new AnswerListener1());
        Answer2.addActionListener(new AnswerListener2());
        Answer3.addActionListener(new AnswerListener3());
        Answer4.addActionListener(new AnswerListener4());
        Answer5.addActionListener(new AnswerListener5());
        Answer6.addActionListener(new AnswerListener6());
        Answer7.addActionListener(new AnswerListener7());
        Answer8.addActionListener(new AnswerListener8());

        //Writing the score
        String result = Double.toString(Points);
        score = new JLabel("Your score is: " + result);

        //Adding everything to the panel
        add(Question1);
        add(Answer1);
        add(Question2);
        add(Answer2);
        add(Question3);
        add(Answer3);
        add(Question4);
        add(Answer4);
        add(Question5);
        add(Answer5);
        add(Question6);
        add(Answer6);
        add(Question7);
        add(Answer7);
        add(Question8);
        add(Answer8);
        add(score);

    }

    //Making the action listeners
    private class AnswerListener1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            response1 = Answer1.getText();

            calculatePoints();
        }
    }
    
    private class AnswerListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            response2 = (Answer2.getText());

            calculatePoints();
        }
    }
    
    private class AnswerListener3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            response3 = (Answer3.getText());

            calculatePoints();
        }
    }
    
    private class AnswerListener4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            response4 = (Answer4.getText());

            calculatePoints();
        }
    }
    
    private class AnswerListener5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            response5 = (Answer5.getText());
            
            calculatePoints();
        }
    }
    
    private class AnswerListener6 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            response6 = (Answer6.getText());
            
            calculatePoints();
        }
    }
    
    private class AnswerListener7 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            response7 = (Answer7.getText());

            calculatePoints();
        }
    }

    private class AnswerListener8 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            response8 = (Answer8.getText());
            
            calculatePoints();
        }
    }

    //If-else statements to calculate points
    public double calculatePoints() {
        double points;


        //Question 1
        if (response1.equals("6")) {
            points = Points + 1;
        } if (response2.equals("35")) {
            points = Points + 1;
        } else {
            points = Points + 0;
        }

        //Question 3
        if (response3.equals("6")) {
            Points = Points + 1;
        } else {
            Points = Points + 0;
        }

        //Question 4
        if (response4.equals("10")) {
            Points = Points + 1;
        } else {
            Points = Points + 0;
        }

        //Question 5
        if (response5.equals("1s22s2p63s2p6d104s2p6d105s")) {
            Points = Points + 1;
        } else {
            Points = Points + 0;
        }

        //Question 6
        if (response6.equals("[Ar]4s23d104p4")) {
            Points = Points + 1;
        } else {
            Points = Points + 0;
        }

        //Question 7
        if (response7.equals("Chlorine")) {
            Points = Points + 1;
        } else {
            Points = Points + 0;
        }

        //Question 8
        if (response8.equals("53")) {
            Points = Points + 1;
        } else {
            Points = Points + 0;
        }

        return points;

    }

}

