import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class PhysicsMainGUI extends JFrame {
    
    private static final int WIDTH = 500;
    private static final int HEIGHT = 281;

    public PhysicsMainGUI(){
        setTitle("Practice Problems Generator");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //TODO: setup commands
         Random rand = new Random();
         Scanner in = new Scanner(System.in);
        JButton PositionButton = new JButton("Position Problem");
        JButton VelocityButton = new JButton("Velocity Problem");
        JButton AccelerationButton = new JButton("Acceleration Problem");

        JLabel label = new JLabel("Pick a problem to solve");
        JPanel LabelPanel = new JPanel(new FlowLayout());
        LabelPanel.add(label);
        
        PositionButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               JFrame positionFrame = new JFrame("Position Problem");
                positionFrame.setSize(WIDTH, HEIGHT);
                positionFrame.setVisible(true);
                positionFrame.setLayout(new FlowLayout());

                JLabel positionLabel = new JLabel("Position Problem Solution");

                ArrayList<Double> positionProblems = new ArrayList<>();
                double x0 = Math.round(rand.nextDouble() * 100.0) / 10.0;
                double v0 = Math.round(rand.nextDouble() * 100.0) / 10.0;
                double t = Math.round(rand.nextDouble() * 100.0) / 10.0;
                double a = Math.round(rand.nextDouble() * 100.0) / 10.0;
                double x = x0 + v0 * t + 0.5 * a * t * t;
                double xRounded = Math.round(x * 100.0) / 100.0;

                ArrayList<String> variables = new ArrayList<>();
                variables.add("x0");
                variables.add("v0");
                variables.add("t");
                variables.add("a");
                variables.add("x");

                positionProblems.add(x0);
                positionProblems.add(v0);
                positionProblems.add(t);
                positionProblems.add(a);
                positionProblems.add(xRounded);

                int randIndex = rand.nextInt(positionProblems.size()); // randomly select which variable will be the answer

                double Answer = positionProblems.get(randIndex);        // get the value of the answer variable
                JLabel promptLabel = new JLabel("Find the value of " + variables.get(randIndex) + " given the following: ");
                positionFrame.add(promptLabel);
                for (int i = 0; i < positionProblems.size(); i++) {     
                    if (i != randIndex) {                               
                        JLabel varLabel = new JLabel(variables.get(i) + " = " + positionProblems.get(i));
                        positionFrame.add(varLabel);

                    }
                } 
                JTextField answerField = new JTextField(10);
                JButton submitButton = new JButton("Submit");
                JLabel resultLabel = new JLabel("");
            
                submitButton.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        double userAnswer = Double.parseDouble(answerField.getText());
                        if (userAnswer == Answer) {
                            resultLabel.setText("Correct!");
                        } else {
                            resultLabel.setText("Incorrect. The correct answer is: " + Answer);
                            
                        }
            }});
        
            positionFrame.add(answerField);
            positionFrame.add(submitButton);
            positionFrame.add(resultLabel);
            
        }});
         VelocityButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame velocityFrame = new JFrame("Velocity Problem");
                velocityFrame.setSize(WIDTH, HEIGHT);
                velocityFrame.setVisible(true);
                velocityFrame.setLayout(new FlowLayout());

                JLabel VelocityLabel = new JLabel("Velocity Problem Solution");

                 ArrayList<Double> velocityProblems = new ArrayList<>();
            double xf = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double v0v = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double tF = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double t0 = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double V = (xf - v0v) / (tF - t0);
            double VRounded = Math.round(V * 100.0) / 100.0;

            ArrayList<String> variablesV = new ArrayList<>();
            variablesV.add("xf");
            variablesV.add("v0");
            variablesV.add("tF");
            variablesV.add("t0");
            variablesV.add("V");

            velocityProblems.add(xf);
            velocityProblems.add(v0v);
            velocityProblems.add(tF);
            velocityProblems.add(t0);
            velocityProblems.add(VRounded);

                int randIndex = rand.nextInt(velocityProblems.size()); // randomly select which variable will be the answer

                double Answer = velocityProblems.get(randIndex);        // get the value of the answer variable
                JLabel promptLabel = new JLabel("Find the value of " + variablesV.get(randIndex) + " given the following: ");
                velocityFrame.add(promptLabel);
                for (int i = 0; i < velocityProblems.size(); i++) {     
                    if (i != randIndex) {                               
                        JLabel varLabel = new JLabel(variablesV.get(i) + " = " + velocityProblems.get(i));
                        velocityFrame.add(varLabel);
                    }
                } 
                JTextField answerField = new JTextField(10);
                JButton submitButton = new JButton("Submit");
                JLabel resultLabel = new JLabel("");
            
                submitButton.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        double userAnswer = Double.parseDouble(answerField.getText());
                        if (userAnswer == Answer) {
                            resultLabel.setText("Correct!");
                        } else {
                            resultLabel.setText("Incorrect. The correct answer is: " + Answer);
                            
                        }
            }});
             velocityFrame.add(answerField);
            velocityFrame.add(submitButton);
            velocityFrame.add(resultLabel);
            }});
            AccelerationButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame accelerationFrame = new JFrame("Acceleration Problem");
                    accelerationFrame.setSize(WIDTH, HEIGHT);
                    accelerationFrame.setVisible(true);
                    accelerationFrame.setLayout(new FlowLayout());

                    JLabel AccelerationLabel = new JLabel("Acceleration Problem Solution");

                     ArrayList<Double> accelerationProblems = new ArrayList<>();
                     double vf = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double v0a = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double tFa = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double t0a = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double aA = (vf - v0a) / (tFa - t0a);
            double aARounded = Math.round(aA * 100.0) / 100.0;

            ArrayList<String> variablesA = new ArrayList<>();
            variablesA.add("vf");
            variablesA.add("v0");
            variablesA.add("tF");
            variablesA.add("t0");
            variablesA.add("a");

            accelerationProblems.add(vf);
            accelerationProblems.add(v0a);
            accelerationProblems.add(tFa);
            accelerationProblems.add(t0a);
            accelerationProblems.add(aARounded);

             int randIndex = rand.nextInt(accelerationProblems.size()); // randomly select which variable will be the answer

                double Answer = accelerationProblems.get(randIndex);        // get the value of the answer variable
                JLabel promptLabel = new JLabel("Find the value of " + variablesA.get(randIndex) + " given the following: ");
                accelerationFrame.add(promptLabel);
                for (int i = 0; i < accelerationProblems.size(); i++) {     
                    if (i != randIndex) {                               
                        JLabel varLabel = new JLabel(variablesA.get(i) + " = " + accelerationProblems.get(i));
                        accelerationFrame.add(varLabel);
                    }
                } 
                JTextField answerField = new JTextField(10);
                JButton submitButton = new JButton("Submit");
                JLabel resultLabel = new JLabel("");
            
                submitButton.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        double userAnswer = Double.parseDouble(answerField.getText());
                        if (userAnswer == Answer) {
                            resultLabel.setText("Correct!");
                        } else {
                            resultLabel.setText("Incorrect. The correct answer is: " + Answer);
                            
                        }
            }});
             accelerationFrame.add(answerField);
            accelerationFrame.add(submitButton);
            accelerationFrame.add(resultLabel);
            }});
                
           
        add(PositionButton);
        add(VelocityButton);
        add(AccelerationButton);
        add(LabelPanel);
        setVisible(true);
    }


    public static void main(String[] args) {
        new PhysicsMainGUI();
        
    }
    
}

