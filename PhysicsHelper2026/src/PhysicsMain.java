import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhysicsMain extends JFrame{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 281;

    public PhysicsMain(){
        setTitle("Physics GUI");//name of file 
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //TODO: set up commands
        PGUI();

        setVisible(true);
    }


    public void PGUI(){
        
        JPanel buttonPanel = new JPanel(new GridLayout(2,2)); 
        //JTextField fileField = new JTextField(5);

        JLabel Label1 = new JLabel();
        Label1.setText("Choose a Selection");

        JButton CalcButt = new JButton("Calculators");
        JButton button2 = new JButton("Tabler");
        JButton button3 = new JButton("Practice Problems");

        button3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel probPanel = probGui();
                add(probPanel);
                //repaint();
                //revalidate();
            }
            
        });


        add(Label1);
        buttonPanel.add(CalcButt);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        add(buttonPanel);

    
        //add(fileField);

        CalcButt.addActionListener(new ActionListener(){
        @Override
            
            public void actionPerformed(ActionEvent e){
            
            JFrame CalcFrame = new JFrame("Calculators");
            CalcFrame.setSize(WIDTH, HEIGHT);
            CalcFrame.setVisible(true);

            JPanel buttonPanel = new JPanel(new GridLayout(11, 1));

            JLabel Label1 = new JLabel();
            Label1.setText("Choose a Selection");


        JButton PosButt = new JButton("Position");
        JButton velButt = new JButton("Velocity");
        JButton AccButt = new JButton("Acceleration");
        JButton FPButt = new JButton("Fluid Pressure ");
        JButton AMButt = new JButton("Angular Motion");
        JButton projXButt = new JButton("Projectile X");
        JButton projYButt = new JButton("Projectile Y");
        JButton BernoullisButt = new JButton("Bernoulli's Equation");
        JButton SButt = new JButton("Speed");
        JButton DButt = new JButton("Distance");
        JButton TButt = new JButton("Time");

SButt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            JFrame calcFrame = new JFrame("Porjectile Y");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText("Distance");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText("Time");


            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel("\n Speed = distance/Time ");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)\n");



finish.addActionListener(new ActionListener(){
            @Override
            //TODO: Check Math
            public void actionPerformed(ActionEvent e){
                String d = field1.getText();
                String t = field2.getText();

            try{ double num1 = Double.parseDouble(d);
                double num2 = Double.parseDouble(t);
          
                double num5 = num1 / num2;
            equal.setText("\n Equals: "+ num5);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}
            }
        });
        calcFrame.add(box);
        box.add(field1);
        box.add(field2);

        box.add(finish);

        
        box.add(Label1);
        box.add(Label2);

        
        box.add(equal);
       
    }
});

DButt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            JFrame calcFrame = new JFrame("Distance");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText(" Speed");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText("Time");


            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel("\n Distance = Speed*Time ");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)\n");



finish.addActionListener(new ActionListener(){
            @Override
            //TODO: Check Math
            public void actionPerformed(ActionEvent e){
                String s = field1.getText();
                String t = field2.getText();

            try{ double num1 = Double.parseDouble(s);
                double num2 = Double.parseDouble(t);
          
                double num5 = num1 * num2;
            equal.setText("\n Equals: "+ num5);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}
            }
        });
        calcFrame.add(box);
        box.add(field1);
        box.add(field2);

        box.add(finish);

        
        box.add(Label1);
        box.add(Label2);

        
        box.add(equal);
       
    }
});

TButt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            JFrame calcFrame = new JFrame("Porjectile Y");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText("Distance");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText("Speed");


            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel("\n time = distance/speed ");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)\n");



finish.addActionListener(new ActionListener(){
            @Override
            //TODO: Check Math
            public void actionPerformed(ActionEvent e){
                String d = field1.getText();
                String s = field2.getText();

            try{ double num1 = Double.parseDouble(d);
                double num2 = Double.parseDouble(s);
          
                double num5 = num1 / num2;
            equal.setText("\n Equals: "+ num5);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}
            }
        });
        calcFrame.add(box);
        box.add(field1);
        box.add(field2);

        box.add(finish);

        
        box.add(Label1);
        box.add(Label2);

        
        box.add(equal);
       
    }
});


BernoullisButt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            JFrame calcFrame = new JFrame("Porjectile Y");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText("Fluid Density");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText(" initial height (y1)");

            JTextField field3 = new JTextField(4);
            field3.setToolTipText(" initial velocity (v1)");

            JTextField field4 = new JTextField(4);
            field4.setToolTipText(" final height (y2)");


            JTextField field5 = new JTextField(4);
            field5.setToolTipText(" final velocity (v2)");

            JTextField field6 = new JTextField(4);
            field5.setToolTipText(" Enter Final pressure (p2)");

            //TODO: Fix math


            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel("\n bernoulli = p2 + (densityB * g * y1 - densityB * g * y2) + (0.5 * densityB * v2 * v2 - 0.5 * densityB * v1 * v1) ");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)\n");
System.out.println("Enter fluid density (p): ");


finish.addActionListener(new ActionListener(){
            @Override
            //TODO: Check Math
            public void actionPerformed(ActionEvent e){
                String densityB = field1.getText();
                String y1 = field2.getText();
                String v1 = field3.getText();
                String y2 = field4.getText();
                String v2 = field5.getText();
                String p2 = field6.getText();


                final double g = -9.81;


            try{ double num1 = Double.parseDouble(densityB);
                double num2 = Double.parseDouble(y1);
                double num3 = Double.parseDouble(v1);
                double num4 = Double.parseDouble(y2);
                double num5 = Double.parseDouble(v2);
                double num6 = Double.parseDouble(p2);

    double numFinal = num6 + (num1 * g * num2 - num1 * g * num4) + (0.5 * num1 * num5 * num5 - 0.5 * num1 * num3 * num3);
            equal.setText("\n Equals: "+ numFinal);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}
            }
        });
        calcFrame.add(box);
        box.add(field1);
        box.add(field2);
        box.add(field3);
        box.add(field4);
        box.add(field5);
        box.add(field6);


        box.add(finish);

        
        box.add(Label1);
        box.add(Label2);

        
        box.add(equal);
       
    }
});

projYButt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            JFrame calcFrame = new JFrame("Porjectile Y");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText(" Enter initial y position (yi)");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText("initial y velocity (yx)");

            JTextField field3 = new JTextField(4);
            field3.setToolTipText(" current y time (tx)");
            //TODO: Fix math


            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel("\n y = yi+ (yv*yt)-.5*(g*(yt*yt)) ");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)\n");



finish.addActionListener(new ActionListener(){
            @Override
            //TODO: Check Math
            public void actionPerformed(ActionEvent e){
                String yi = field1.getText();
                String yv = field2.getText();
                String yt = field3.getText();


            try{ double num1 = Double.parseDouble(yi);
                double num2 = Double.parseDouble(yv);
                double num3 = Double.parseDouble(yt);
          
                double num5 = num1 + (num2*num3) - .5*(-9.81*(num3*num3));
            equal.setText("\n Equals: "+ num5);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}
            }
        });
        calcFrame.add(box);
        box.add(field1);
        box.add(field2);
        box.add(field3);
        box.add(finish);

        
        box.add(Label1);
        box.add(Label2);

        
        box.add(equal);
       
    }
});
    
        projXButt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            JFrame calcFrame = new JFrame("Porjectile X");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText(" initial x position (xi)");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText("initial x velocity (xv)");

            JTextField field3 = new JTextField(4);
            field3.setToolTipText(" current x time (tx)");
            //TODO: Fix math


            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel("x = xi + (xv*tx)");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)");

finish.addActionListener(new ActionListener(){
            @Override
            //TODO: Check Math
            public void actionPerformed(ActionEvent e){
                String xi = field1.getText();
                String xv = field2.getText();
                String tx = field3.getText();

            try{ double num1 = Double.parseDouble(xi);
                double num2 = Double.parseDouble(xv);
                double num3 = Double.parseDouble(tx);
          
                double num5 = num1 + (num2*num3);
            equal.setText("Equals: "+ num5);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}
            }
        });
        calcFrame.add(box);
        box.add(field1);
        box.add(field2);
        box.add(field3);

        
        box.add(Label1);
        box.add(Label2);


        box.add(equal);
        box.add(finish);
    }
});


AMButt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            JFrame calcFrame = new JFrame("Fluid Pressure Calc");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText("initial Angle");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText("Initial Angular Speed");

            JTextField field3 = new JTextField(4);
            field3.setToolTipText("Change in time");
            //TODO: Fix math

            JTextField field4 = new JTextField(4);
            field4.setToolTipText("Angular Accelaration");


            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel("(θ = θ0 + ⍵0t + (½)at^2)");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)");
            
finish.addActionListener(new ActionListener(){
            @Override
            //TODO: Check Math
            public void actionPerformed(ActionEvent e){
                String θ0 = field1.getText();
                String w0 = field3.getText();
                String t = field4.getText();
                String a = field4.getText();

            try{ double num1 = Double.parseDouble(θ0);
                double num2 = Double.parseDouble(w0);
                double num3 = Double.parseDouble(t);
                double num4 = Double.parseDouble(a);
          
                double num5 = (num1 + (num2 * num3) + ((1/2) *num4 * (num3 *num3)));
            equal.setText("Equals: "+ num5);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}
            }
        });
        calcFrame.add(box);
        box.add(field1);
        box.add(field2);
        box.add(field3);
        box.add(field4);

        
        box.add(Label1);
        box.add(Label2);


        box.add(equal);
        box.add(finish);

    }

});

FPButt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            JFrame calcFrame = new JFrame("Fluid Pressure Calc");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText("initial preussre");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText("Density");

            JTextField field3 = new JTextField(4);
            field3.setToolTipText("Height");

            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel(" Pressure = p0 + density * g * h");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)");
            JLabel Label3 = new JLabel("(g = gravity)");
            
finish.addActionListener(new ActionListener(){
            @Override
            //TODO: Check Math
            public void actionPerformed(ActionEvent e){
                String p0 = field1.getText();
                String d = field2.getText();
                String h = field3.getText();
        

            try{ double num1 = Double.parseDouble(p0);
                double num2 = Double.parseDouble(d);
                double num3 = Double.parseDouble(h);
            //double pressure = p0 + density * g * h;
                double num5 = (num1 + num2 * 9.81 * num3);
            equal.setText("Equals: "+ num5);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}

            }
        });

            box.add(field1);
            box.add(field2);
            box.add(field3);

            box.add(finish);

            box.add(Label1);
            box.add(Label3);
            box.add(Label2);
            

            box.add(equal);
            calcFrame.add(box);

    }
});

velButt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            JFrame calcFrame = new JFrame("Accleration Calc");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText("Final Position");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText("initial Position");

            JTextField field3 = new JTextField(4);
            field3.setToolTipText("Final Time");

            JTextField field4 = new JTextField(4);
            field4.setToolTipText("Initial time");

            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel(" = (vf - v0a) / (tFa - t0a)");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)");
            
finish.addActionListener(new ActionListener(){
            @Override
            //TODO: Check math
            public void actionPerformed(ActionEvent e){
                String vf = field1.getText();
                String v0 = field2.getText();
                String tF = field3.getText();
                String t0 = field4.getText();

            try{ double num1 = Double.parseDouble(vf);
                double num2 = Double.parseDouble(v0);
                double num3 = Double.parseDouble(tF);
                double num4 = Double.parseDouble(t0);
            // double acceleration = (vf - v0a) / (tFa - t0a);
                double num5 = (num2 - num1) / (num4 - num3);
            equal.setText("Equals: "+ num5);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}

            }
        });

            box.add(field1);
            box.add(field2);
            box.add(field3);
            box.add(field4);

            box.add(finish);

            box.add(Label1);
            box.add(Label2);

            box.add(equal);
            calcFrame.add(box);

    }
});

PosButt.addActionListener(new ActionListener(){
        @Override
            
            public void actionPerformed(ActionEvent e){
            
            JFrame calcFrame = new JFrame("Position Calculator");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText("initial position");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText("initial volocity");

            JTextField field3 = new JTextField(4);
            field3.setToolTipText("time");

            JTextField field4 = new JTextField(4);
            field4.setToolTipText("Accelaration");

            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel("Position = ");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)");

            box.add(field1);
            box.add(field2);
            box.add(field3);
            box.add(field4);

            box.add(finish);

            box.add(Label1);
            box.add(Label2);

            box.add(equal);

            calcFrame.add(box);

finish.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String IP = field1.getText();
                String IV = field2.getText();
                String t = field3.getText();
                String a = field4.getText();

               try{ double num1 = Double.parseDouble(IP);
                double num2 = Double.parseDouble(IV);
                double num3 = Double.parseDouble(t);
                double num4 = Double.parseDouble(a);
                double num5 = num1 + num2 * num3 + 0.5 * num4 * (num3 * num3);
            equal.setText("Equals: "+ num5);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}




            }
    
            });

            }
                
            
        });
AccButt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            JFrame calcFrame = new JFrame("Accleration Calc");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);
            
            JPanel box = new JPanel();
            JTextField field1 = new JTextField(4);
            field1.setToolTipText("Final Volocity");

            JTextField field2 = new JTextField(4);
            field2.setToolTipText("initial volocity");

            JTextField field3 = new JTextField(4);
            field3.setToolTipText("Final Time");

            JTextField field4 = new JTextField(4);
            field4.setToolTipText("Initial time");

            JLabel equal = new JLabel("Eqauls :");

            JButton finish = new JButton("Calculate");
            
            JLabel Label1 = new JLabel("acceleration = (vf - v0a) / (tFa - t0a)");
            JLabel Label2 = new JLabel("\n (Hover over text fields to see each varible)");

finish.addActionListener(new ActionListener(){
            @Override
            //TODO:Check math
            public void actionPerformed(ActionEvent e){
                String vf = field1.getText();
                String v0 = field2.getText();
                String tF = field3.getText();
                String t0 = field4.getText();

            try{ double num1 = Double.parseDouble(vf);
                double num2 = Double.parseDouble(v0);
                double num3 = Double.parseDouble(tF);
                double num4 = Double.parseDouble(t0);
            // double acceleration = (vf - v0a) / (tFa - t0a);
                double num5 = (num2 - num1) / (num4 - num3);
            equal.setText("Equals: "+ num5);
               }
               catch(NumberFormatException ex)
               {equal.setText("invalid input");}

            }
        });

            box.add(field1);
            box.add(field2);
            box.add(field3);
            box.add(field4);

            box.add(finish);

            box.add(Label1);
            box.add(Label2);

            box.add(equal);
            calcFrame.add(box);


    }



});
        
        buttonPanel.add(PosButt);
        buttonPanel.add(velButt);
        buttonPanel.add(AccButt);
        buttonPanel.add(FPButt);
        buttonPanel.add(AMButt);
        buttonPanel.add(SButt);
        buttonPanel.add(DButt);
        buttonPanel.add(TButt);
        buttonPanel.add(BernoullisButt);
        buttonPanel.add(projXButt);
        buttonPanel.add(projYButt);
        
        CalcFrame.add(buttonPanel);
    }
});
    }


public static JPanel probGui(){
    JPanel probPanel = new JPanel(new FlowLayout());
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
                
           
        probPanel.add(PositionButton);
        probPanel.add(VelocityButton);
        probPanel.add(AccelerationButton);
        probPanel.add(LabelPanel);
        return probPanel;
    }

    
public static void main(String[] args){
new PhysicsMain();
}
}

//     public static void main(String[] args){
//         //new PhysicsMain();
//         Scanner in = new Scanner(System.in);
//         char choice = 'y';
//         while(choice == 'y'){
//             System.out.println("Choose a function: \n\t[C]alculators\n\t[T]able Generator \n\t[P]Projectile Motion Tabler");
//             System.out.println("Choose a function: \n\t[C]alculators\n\t[T]able Generator \n\t[W]Practice Problems");
//             choice = in.next().toLowerCase().charAt(0);
//             System.out.println();
//             switch(choice) { 
//                 case 'c': calculators(in); break;
//                 case 't': tabler(in); break;
//                 case 'p': ProjectilemotionTabler(in);break;
//                 //case "p": ProjectilemotionTabler(in); break;
//                 case 'w': PracticeProblems(in); break;
//                 //TODO: Add cases for other functionalities
//                 default: System.out.println("Function not recognized."); choice = 'y'; continue;
//             }
//             System.out.println("Would you like to continue? [Y/n]");
//             choice = in.next().toLowerCase().charAt(0);
//             System.out.println();
//         }
//         in.close();
//     }

//     public static void calculators(Scanner in){
//         System.out.println("Enter which type of calculation to perform:\n1) Position\n2) Velocity\n3) Acceleration\n4) Fluid pressure \n5) Angular motion \n6) Projectile motion");
//         int choice = in.nextInt();
//         System.out.println();
//         switch(choice) {
//             case 1: Position(in); break;
//             case 2: Velocity(in); break;
//             case 3: Acceleration(in); break;
//             case 4: FluidPressure(in); break;
//             case 5: AngularMotion(in); break;
//             case 6: //ProjectileMotion(in); break;
//             case 's': //speed(in); break;
//             case 'd': //distance(in); break;
//             case 't': //time(in); break;
//             case 'p': projectilemotion(in); break;
//             //case 't': angularChoice(in); break;
//             //TODO: Add cases for existing calculators
//             default: System.out.println("Function not recognized.  Returning to menu."); break;
//         }
//     }

//     public static void Position(Scanner in){
//         System.out.println("You chose: Position");
//             System.out.println("Enter initial position (x0): ");
//             double x0 = in.nextDouble();
//             System.out.println("Enter initial velocity (v0): ");
//             double v0 = in.nextDouble();
//             System.out.println("Enter time (t): ");
//             double t = in.nextDouble();
//             System.out.println("Enter acceleration (a): ");
//             double a = in.nextDouble();
//             double position = x0 + v0 * t + 0.5 * a * t * t;
//             System.out.println("The calculated position is: " + position + ".");
//     }

//     public static void Velocity(Scanner in){
//         System.out.println("You chose: Velocity");
//         System.out.println("Enter final velocity (xf): ");
//         double xf = in.nextDouble();
//         System.out.println("Enter initial velocity (v0): ");
//         double v0v = in.nextDouble();
//         System.out.println("Enter final time (t): ");
//         double tF = in.nextDouble();
//         System.out.println("Enter initial time (t0): ");
//         double t0 = in.nextDouble();
//         double velocity = (xf - v0v) / (tF - t0);
//         System.out.println("The calculated velocity is: " + velocity + ".");
//     }

//     public static void Acceleration(Scanner in){
//         System.out.println("You chose: Acceleration");
//         System.out.println("Enter final velocity (vf): ");
//         double vf = in.nextDouble();
//         System.out.println("Enter initial velocity (v0): ");
//         double v0a = in.nextDouble();
//         System.out.println("Enter final time (tF): ");
//         double tFa = in.nextDouble();
//         System.out.println("Enter initial time (t0): ");
//         double t0a = in.nextDouble();
//         double acceleration = (vf - v0a) / (tFa - t0a);
//         System.out.println("The calculated acceleration is: " + acceleration + ".");
//     }

//     public static void AngularMotion(Scanner in){
//        System.out.println("Which would you like \n1) Angular Speed \n2) Angular Movement");
//                     int angularChoice = in.nextInt();
//                     switch (angularChoice) {
//                         case 1:
//                             System.out.println("You chose Angular Speed (Ã¢ Âµ = Ã¢ Âµ0 + ÃŽÂ±t) ");
//                     System.out.print("Enter initial Angular Speed (Ã¢ Âµ0): ");
//                     double aS = in.nextDouble();

//                     System.out.println("Enter inital Angular Accerleration (ÃŽÂ±):");
//                     double AA = in.nextDouble();

//                     System.out.println("Enter inital Time: ");
//                     double T = in.nextDouble();

//                     double AS = aS + (AA * T);
//                     System.out.println("Your angular Motion is " +AS);

//                     break;
//                         case 2:
//                             System.out.println("You chose Angule of Movement (θ = θ0 + ⍵0t + (½)αt^2) ");
//                         System.out.println("Enter inital Angle (θ0): ");
//                         double Iangle = in.nextDouble();

//                         System.out.println("Enter inital Angular Speed (⍵0)");
//                         double Aspeed = in.nextDouble();

//                         System.out.println("Enter change in time (t): ");
//                         double time = in.nextDouble();
    
//                         System.out.println("Enter inital Angular Accerleration (α):");
//                         double  aA = in.nextDouble();

//                         double Amovement = Iangle + (Aspeed*time) + (.5*aA*time*time) ;
//                         System.out.println("Your Angle of Movement is " +Amovement);}}
                    

//     public static void FluidPressure(Scanner in){
//         System.out.println("Enter which type of Fluid Pressure calculation to perform:\n1) Absolute fluid pressure \n2) Bernoulli’s equation");
//         int FluidChoice = in.nextInt();
//          final double g = -9.81;
//         switch (FluidChoice) {
//             case 1:
//                 System.out.println("You chose: Fluid Pressure");
//         System.out.println("Enter initial pressure (P0): ");
//         double p0 = in.nextDouble();
//         System.out.println("Enter fluid density (p): ");
//         double density = in.nextDouble();
//         System.out.println("Enter depth (h): ");
//         double h = in.nextDouble();
//         double pressure = p0 + density * g * h;
//         System.out.println("The calculated fluid pressure is: " + pressure + ".");
//                 break;
//             case 2:
//                 System.out.println("You chose: Bernoulli's equation");
//         System.out.println("Enter fluid density (p): ");
//         double densityB = in.nextDouble();
//         System.out.println("Enter initial height (y1): ");
//         double y1 = in.nextDouble();
//         System.out.println("Enter initial velocity (v1): ");
//         double v1 = in.nextDouble();
//         System.out.println("Enter final height (y2): ");
//         double y2 = in.nextDouble();
//         System.out.println("Enter final velocity (v2): ");
//         double v2 = in.nextDouble();
//         System.out.println("Enter Final pressure (P2): ");
//         double p2 = in.nextDouble();
//         double bernoulli = p2 + (densityB * g * y1 - densityB * g * y2) + (0.5 * densityB * v2 * v2 - 0.5 * densityB * v1 * v1);
//         System.out.println("The calculated Bernoulli's equation result is: " + bernoulli + ".");
//                 break;
//             default: System.out.println("Function not recognized. Returning to menu."); break;
            
//         }}
    
//     public static void projectilemotion(Scanner in) {
//     System.out.println("Would you like to  calculate projectile motion for the x or y?(x/y)"); 
//     char choice = in.next().toLowerCase().charAt(0);
//     if (choice == 'x') {
//     System.out.println("Enter initial x position: ");
//      int xi = in.nextInt();
//      System.out.println("Enter initial x velocity: ");
//      int xv = in.nextInt();
//      System.out.println("Enter current x time:");
//      int tx = in.nextInt();
//      int x = xi+ (xv*tx);
//     System.out.println("The motion in the x-direction is: "+x+".");}
//     else if (choice == 'y') {
//      System.out.println("Enter initial y position: ");
//      int yi = in.nextInt();
//      System.out.println("Enter initial y velocity: ");
//      int yv = in.nextInt();
//      System.out.println("Enter current y time: ");
//      int yt = in.nextInt();
//      System.out.println("Enter the force of gravity applied: ");
//      int g = in.nextInt();
//      double y = yi+ (yv*yt)-.5*(g*(yt*yt));
//      System.out.println("Motion in the y-direction: "+y+".");}}
    
//     public static void tabler(Scanner in) {
//         //System.out.println("Choose your table: \n1) Velocity and Position \n2) x and y \n3) Angle of Movement \n4)Air Pressure");
//         //TODO: Complete tabler
//         System.out.print("Enter a number of seconds to simulate: ");
//         int seconds = in.nextInt();

//         System.out.print("Enter initial acceleration in m/s^2: ");
//         int IA = in.nextInt();

//         System.out.print("Enter initial velocity in m/s: ");
//         int IV = in.nextInt();

//         System.out.print("Enter Initial Position in m: ");
//         int IP = in.nextInt();

//         int CurV = IV;
//     //for loop, for every speed 0 - given speed
//     System.out.println("t(s)|\tv(m/s)|\tx(m)\n" +
//                 "----+-------+----\n");
    
//     for(int i = 0; i <= seconds; i++)
//      { CurV = (CurV + (IA * i));
//         System.out.println(i+ "|\t" +(CurV) +"|\t" + (IP + CurV));}//(.5  * IA * (i*i) )) );
//         //CurV = v0 + a * t
//         //x = x0 + CurV * t

//         //x₀ + v₀t + (½)at²
//      }


//     public static void ProjectilemotionTabler(Scanner in){
// //Motion in the x-direction: x = x0 + v0xt
// //Motion in the y-direction: y = y0 + v0yt − (½)gt2
//     System.out.print("Enter a time: ");
//  int t = in.nextInt();
//         System.out.print("Enter an initial Position");
//     int IP = in.nextInt();
//         System.out.print("Enter initial Velocity for x: ");
//     int IVX = in.nextInt();
//         System.out.print("Enter initial y velocity: ");
//     int y0 = in.nextInt();
//         System.out.print("Enter initial Velocity for y: ");
//     int IVY = in.nextInt();
//     System.out.println("time|   x distance  | y distance\n" +
//                 "----+-----------+----");
//          for (int i = 0; i <= t; i++){

//             double xD = IP + IVX * i;
//             double yD = y0 + IVY* i - (.5) * (-9.8/*How to know what gravity is, input gravity  */) * (i * i);
//             System.out.println(i +"   " + "|\t" +xD+  "\t|" + yD);
//     }}
    
    
    
//     public static void Movementtabeler(Scanner in){
// System.out.println("You chose Angule of Movement (θ = θ0 + ⍵0t + (½)αt^2) ");
//                         System.out.println("Enter inital Angle (θ0): ");
//                         double Iangle = in.nextDouble();

//                         System.out.println("Enter inital Angular Speed (⍵0)");
//                         double Aspeed = in.nextDouble();

//                         System.out.println("Enter change in time (t): ");
//                         double time = in.nextDouble();
    
//                         System.out.println("Enter inital Angular Accerleration (α):");
//                         double  aA = in.nextDouble();

//                         double Amovement = Iangle + (Aspeed*time) + (.5*aA*time*time) ;
//                     System.out.println("Your Angle of Movement is " +Amovement);

//                     for(int i = 0;i <= time; i++ ){
//                     System.out.println("\"time| Speed  | angle of movement \\n\" +\n"+
//                                                 "----+-----------+----");
//                     System.out.println(i + "\t" + Aspeed + "\t" + Amovement);

//                     }

    
//  }


    
//     // random practice problems generator
//     public static void PracticeProblems(Scanner in) {
//         System.out.println("What type of practice problem would you like? \n1)Position \n2)Velocity \n3)Acceleration");
//         int choice = in.nextInt();
//         Random rand = new Random();
//         switch(choice) {
//             case 1:
//                 System.out.println("You chose: Position");
//                 ArrayList<Double> positionProblems = new ArrayList<>();
//                 double x0 = Math.round(rand.nextDouble() * 100.0) / 10.0;
//                 double v0 = Math.round(rand.nextDouble() * 100.0) / 10.0;
//                 double t = Math.round(rand.nextDouble() * 100.0) / 10.0;
//                 double a = Math.round(rand.nextDouble() * 100.0) / 10.0;

//                 ArrayList<String> variables = new ArrayList<>();
//                 variables.add("x0");
//                 variables.add("v0");
//                 variables.add("t");
//                 variables.add("a");

//                 positionProblems.add(x0);
//                 positionProblems.add(v0);
//                 positionProblems.add(t);
//                 positionProblems.add(a);

//                 int randIndex = rand.nextInt(positionProblems.size()); // randomly select which variable will be the answer

//                 double Answer = positionProblems.get(randIndex);        // get the value of the answer variable
//                 System.out.println("Find the value of " + variables.get(randIndex) + " given the following: ");
//                 for (int i = 0; i < positionProblems.size(); i++) {     // loop through the variables and print out the ones that are not the answer
//                     if (i != randIndex) {                               // skip the variable that is the answer
//                         System.out.println(variables.get(i) + " = " + positionProblems.get(i));

//                     }
//                 }  System.out.println("Enter your answer: ");
//                 double userAnswer = in.nextDouble();
//                 if (userAnswer == Answer) {
//                     System.out.println("Correct!");
//                 } else {
//                     System.out.println("Incorrect. The correct answer is: " + Answer);
//                 }
//                 break;

        
//         case 2:
//             System.out.println("You chose: Velocity");
//             ArrayList<Double> velocityProblems = new ArrayList<>();
//             double xf = Math.round(rand.nextDouble() * 100.0) / 10.0;
//             double v0v = Math.round(rand.nextDouble() * 100.0) / 10.0;
//             double tF = Math.round(rand.nextDouble() * 100.0) / 10.0;
//             double t0 = Math.round(rand.nextDouble() * 100.0) / 10.0;

//             ArrayList<String> variablesV = new ArrayList<>();
//             variablesV.add("xf");
//             variablesV.add("v0");
//             variablesV.add("tF");
//             variablesV.add("t0");

//             velocityProblems.add(xf);
//             velocityProblems.add(v0v);
//             velocityProblems.add(tF);
//             velocityProblems.add(t0);
//             int randIndexV = rand.nextInt(velocityProblems.size()); // randomly select which variable will be the answer
//             double AnswerV = velocityProblems.get(randIndexV);        // get the value of the answer variable
//             System.out.println("Find the value of " + variablesV.get(randIndexV) + " given the following: ");
//             for (int i = 0; i < velocityProblems.size(); i++) {     // loop through the variables and print out the ones that are not the answer
//                 if (i != randIndexV) {                               // skip the variable that is the answer
//                     System.out.println(variablesV.get(i) + " = " + velocityProblems.get(i));
//                 }
//             }  System.out.println("Enter your answer: ");
//             double userAnswerV = in.nextDouble();
//             if (userAnswerV == AnswerV) {
//                 System.out.println("Correct!");
//             } else {
//                 System.out.println("Incorrect. The correct answer is: " + AnswerV);
//             }
//             break;
//         case 3:
//             System.out.println("You chose: Acceleration");
//             ArrayList<Double> accelerationProblems = new ArrayList<>();
//             double vf = Math.round(rand.nextDouble() * 100.0) / 10.0;
//             double v0a = Math.round(rand.nextDouble() * 100.0) / 10.0;
//             double tFa = Math.round(rand.nextDouble() * 100.0) / 10.0;
//             double t0a = Math.round(rand.nextDouble() * 100.0) / 10.0;

//             ArrayList<String> variablesA = new ArrayList<>();
//             variablesA.add("vf");
//             variablesA.add("v0");
//             variablesA.add("tF");
//             variablesA.add("t0");

//             accelerationProblems.add(vf);
//             accelerationProblems.add(v0a);
//             accelerationProblems.add(tFa);
//             accelerationProblems.add(t0a);
//             int randIndexA = rand.nextInt(accelerationProblems.size()); // randomly select which variable will be the answer
//             double AnswerA = accelerationProblems.get(randIndexA);        // get the value of the answer variable
//             System.out.println("Find the value of " + variablesA.get(randIndexA) + " given the following: ");
//             for (int i = 0; i < accelerationProblems.size(); i++) {     // loop through the variables and print out the ones that are not the answer
//                 if (i != randIndexA) {                               // skip the variable that is the answer
//                     System.out.println(variablesA.get(i) + " = " + accelerationProblems.get(i));
//                 }
//             }  System.out.println("Enter your answer: ");
//             double userAnswerA = in.nextDouble();
//             if (userAnswerA == AnswerA) {
//                 System.out.println("Correct!");
//             } else {
//                 System.out.println("Incorrect. The correct answer is: " + AnswerA);
//             }
//             break;
//         default: System.out.println("Function not recognized. Returning to menu."); break;
//         }



// }}