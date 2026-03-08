import javax.swing.*;
import javax.swing.text.Position;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Template extends JFrame {
    private static final int WIDTH = 550;
    private static final int HEIGHT = 300;

    public Template() {
        setTitle("");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        home();

        setVisible(true);
    }

    public void Calculators() {
        

    }

    public void home() {
        JPanel homePanel = new JPanel(new GridLayout(3, 1));
        JButton Calc = new JButton("Calculators");
        Calc.setPreferredSize(new Dimension(500,75));
        JButton Tabler = new JButton("Tablers");
        Tabler.setPreferredSize(new Dimension(500,75));
        JButton Practice = new JButton("Practice Problems");
        Practice.setPreferredSize(new Dimension(500,75));


        homePanel.add(Calc);
        homePanel.add(Tabler);
        homePanel.add(Practice);
        add(homePanel);




        Calc.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            JFrame calcFrame = new JFrame("Calculators");
            calcFrame.setSize(WIDTH, HEIGHT);
            calcFrame.setVisible(true);

        JPanel calcPanel = new JPanel(new GridLayout(12, 1));

        JButton speed = new JButton("Speed");
        JButton distance = new JButton("Distance");
        JButton time = new JButton("Time");
        JButton position = new JButton("Position");
        JButton velocity = new JButton("Velocity");
        JButton acceleration = new JButton("Acceleration");
        JButton projx = new JButton("Projectile X");
        JButton projy = new JButton("Projectile Y");
        JButton bernoulli = new JButton("Bernoulli's Equation");
        JButton absflu = new JButton("Absolute Fluid");
        JButton angmov = new JButton("Angle of movement");
        JButton angspeed = new JButton("Angular Speed");

        calcPanel.add(speed);
        calcPanel.add(distance);
        calcPanel.add(time);
        calcPanel.add(position);
        calcPanel.add(velocity);
        calcPanel.add(acceleration);
        calcPanel.add(projx);
        calcPanel.add(projy);
        calcPanel.add(bernoulli);
        calcPanel.add(absflu);
        calcPanel.add(angmov);
        calcPanel.add(angspeed);
        add(calcPanel);
        calcFrame.add(calcPanel);

        angspeed.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame angspeedFrame = new JFrame("Angular Speed Calculator");
                angspeedFrame.setSize(WIDTH, HEIGHT);
                angspeedFrame.setVisible(true);

                JPanel angspeedPanel = new JPanel(new GridLayout(6, 1));

                JLabel title = new JLabel("Angular Speed Calculator");
                JTextField angle = new JTextField("Initial angular velocity: ");
                JTextField angacc = new JTextField("Angular acceleration: ");
                JTextField time = new JTextField("Time: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                angspeedPanel.add(title);
                angspeedPanel.add(angle);
                angspeedPanel.add(angacc);
                angspeedPanel.add(time);
                angspeedPanel.add(calculate);
                angspeedPanel.add(result);
                angspeedFrame.add(angspeedPanel);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double a = Double.parseDouble(angle.getText());
                        double aa = Double.parseDouble(angacc.getText());
                        double t = Double.parseDouble(time.getText());
                        double aspeed = a + (aa * t);
                        result.setText("Equals:  " + aspeed);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
            }
        });

        angmov.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame angmotFrame = new JFrame("Angular of movement Calculator");
                angmotFrame.setSize(WIDTH, HEIGHT);
                angmotFrame.setVisible(true);

                JPanel angmotPanel = new JPanel(new GridLayout(7, 1));

                JLabel title = new JLabel("Angle of movement Calculator");
                JTextField IAP = new JTextField("Initial angular position: ");
                JTextField IAV = new JTextField("Initial angular velocity: ");
                JTextField CRAA = new JTextField("Constant rate of angular acceleration: ");
                JTextField Time = new JTextField("Time elapsed: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                angmotPanel.add(title);
                angmotPanel.add(IAP);
                angmotPanel.add(IAV);
                angmotPanel.add(CRAA);
                angmotPanel.add(Time);
                angmotPanel.add(calculate);
                angmotPanel.add(result);
                angmotFrame.add(angmotPanel);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double iap = Double.parseDouble(IAP.getText());
                        double iav = Double.parseDouble(IAV.getText());
                        double craa = Double.parseDouble(CRAA.getText());
                        double t = Double.parseDouble(Time.getText());
                        double a = (iap + (iav * t) + (1/2 * craa * (t * t)));
                        result.setText("Equals:  " + a);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
            }
        });

        absflu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame absfluFrame = new JFrame("Absolute Fluid Pressure Calculator");
                absfluFrame.setSize(WIDTH, HEIGHT);
                absfluFrame.setVisible(true);

                JPanel absfluPanel = new JPanel(new GridLayout(6, 1));

                JLabel title = new JLabel("Absolute Fluid Pressure Calculator");
                JTextField p = new JTextField("Initial Pressure: ");
                JTextField density = new JTextField("Density of the fluid: ");
                JTextField height = new JTextField("Height of the fluid collumn: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                absfluPanel.add(title);
                absfluPanel.add(p);
                absfluPanel.add(density);
                absfluPanel.add(height);
                absfluPanel.add(calculate);
                absfluPanel.add(result);
                absfluFrame.add(absfluPanel);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double p1 = Double.parseDouble(p.getText());
                        double den = Double.parseDouble(density.getText());
                        double h = Double.parseDouble(height.getText());
                        double g = 9.8;
                        double pressure = p1 + (den * g * h);
                        result.setText("Equals:  " + pressure);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
            }
        });

        bernoulli.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame bernoulliFrame = new JFrame("Bernoulli's Equation Calculator");
                bernoulliFrame.setSize(WIDTH, HEIGHT);
                bernoulliFrame.setVisible(true);

                JPanel bernoulliPanel = new JPanel(new GridLayout(9, 1));

                JLabel title = new JLabel("Bernoulli's Equation Calculator");
                JTextField p2 = new JTextField("Pressure at point 2: ");
                JTextField d1 = new JTextField("Density of the fluid: ");
                JTextField v1 = new JTextField("Velocity at point 1: ");
                JTextField v2 = new JTextField("Velocity at point 2: ");
                JTextField h1 = new JTextField("Height at point 1: ");
                JTextField h2 = new JTextField("Height at point 2: ");
                JButton calculate = new JButton("Calculate Pressure 2");
                JLabel result = new JLabel("The pressure at point 1 is: ");
                bernoulliPanel.add(title);
                bernoulliPanel.add(p2);
                bernoulliPanel.add(d1);
                bernoulliPanel.add(v1);
                bernoulliPanel.add(v2);
                bernoulliPanel.add(h1);
                bernoulliPanel.add(h2);
                bernoulliPanel.add(calculate);
                bernoulliPanel.add(result);
                bernoulliFrame.add(bernoulliPanel);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double p2x = Double.parseDouble(p2.getText());
                        double d1x = Double.parseDouble(d1.getText());
                        double v1x = Double.parseDouble(v1.getText());
                        double v2x = Double.parseDouble(v2.getText());
                        double h1x = Double.parseDouble(h1.getText());
                        double h2x = Double.parseDouble(h2.getText());
                        double g = 9.8;
                        double pressure2 = p2x + (d1x * g * h2x) + (0.5 * d1x * v2x * v2x) - (d1x * g * h1x) - (0.5 * d1x * v1x * v1x);
                        result.setText("Pressure 2 equals: " + pressure2);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
            }
        });

        projy.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame projyFrame = new JFrame("Projectile Y Calculator");
                projyFrame.setSize(WIDTH, HEIGHT);
                projyFrame.setVisible(true);

                JPanel projyPanel = new JPanel(new GridLayout(6, 1));

                JLabel title = new JLabel("Projectile Y Calculator");
                JTextField ypos = new JTextField("Initial Y Position: ");
                JTextField velocity = new JTextField("Initial Velocity in y direction: ");
                JTextField time = new JTextField("Time: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                projyPanel.add(title);
                projyPanel.add(ypos);
                projyPanel.add(velocity);
                projyPanel.add(time);
                projyPanel.add(calculate);
                projyPanel.add(result);
                projyFrame.add(projyPanel);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double y1 = Double.parseDouble(ypos.getText());
                        double v = Double.parseDouble(velocity.getText());
                        double t = Double.parseDouble(time.getText());
                        double g = -9.8;
                        double y = (y1 + (v * t) - ((0.5) * (g) * (t * t)));
                        result.setText("Equals:  " + y);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
            }
        });

        projx.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame projxFrame = new JFrame("Projectile X Calculator");
                projxFrame.setSize(WIDTH, HEIGHT);
                projxFrame.setVisible(true);

                JPanel projxPanel = new JPanel(new GridLayout(6, 1));

                JLabel title = new JLabel("Projectile X Calculator");
                JTextField xpos = new JTextField("Initial X Position: ");
                JTextField velocity = new JTextField("Initial Velocity in x direction: ");
                JTextField time = new JTextField("Time: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                projxPanel.add(title);
                projxPanel.add(xpos);
                projxPanel.add(velocity);
                projxPanel.add(time);
                projxPanel.add(calculate);
                projxPanel.add(result);
                projxFrame.add(projxPanel);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double x1 = Double.parseDouble(xpos.getText());
                        double v = Double.parseDouble(velocity.getText());
                        double t = Double.parseDouble(time.getText());
                        double x = x1 + (v * t);
                        result.setText("Equals:  " + x);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
            }
        });

        acceleration.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame accelerationFrame = new JFrame("Acceleration Calculator");
                accelerationFrame.setSize(WIDTH, HEIGHT);
                accelerationFrame.setVisible(true);

                JPanel accelerationPanel = new JPanel(new GridLayout(7, 1));

                JLabel title = new JLabel("Acceleration Calculator");
                JTextField velocity1 = new JTextField("Initial Velocity: ");
                JTextField velocity2 = new JTextField("Final Velocity: ");
                JTextField time1 = new JTextField("Initial Time: ");
                JTextField time2 = new JTextField("Final Time: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                accelerationPanel.add(title);
                accelerationPanel.add(velocity1);
                accelerationPanel.add(velocity2);
                accelerationPanel.add(time1);
                accelerationPanel.add(time2);
                accelerationPanel.add(calculate);
                accelerationPanel.add(result);
                accelerationFrame.add(accelerationPanel);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double v1 = Double.parseDouble(velocity1.getText());
                        double v2 = Double.parseDouble(velocity2.getText());
                        double t1 = Double.parseDouble(time1.getText());
                        double t2 = Double.parseDouble(time2.getText());
                        double accel = (v2 - v1) / (t2 - t1);
                        result.setText("Equals:  " + accel);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
            }
        });


        velocity.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame velocityFrame = new JFrame("Velocity Calculator");
                velocityFrame.setSize(WIDTH, HEIGHT);
                velocityFrame.setVisible(true);

                JPanel velocityPanel = new JPanel(new GridLayout(7, 1));

                JLabel title = new JLabel("Velocity Calculator");
                JTextField distance1 = new JTextField("Initial Position: ");
                JTextField distance2 = new JTextField("Final Position: ");
                JTextField time1 = new JTextField("Initial Time: ");
                JTextField time2 = new JTextField("Final Time: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                velocityPanel.add(title);
                velocityPanel.add(distance1);
                velocityPanel.add(distance2);
                velocityPanel.add(time1);
                velocityPanel.add(time2);
                velocityPanel.add(calculate);
                velocityPanel.add(result);
                velocityFrame.add(velocityPanel);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double dist = Double.parseDouble(distance1.getText());
                        double dist2 = Double.parseDouble(distance2.getText());
                        double t1 = Double.parseDouble(time1.getText());
                        double t2 = Double.parseDouble(time2.getText());
                        double velocity = (dist2 - dist) / (t2 - t1);
                        result.setText("Equals:  " + velocity);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
            }
        });

        position.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame positionFrame = new JFrame("Position Calculator");
                positionFrame.setSize(WIDTH, HEIGHT);
                positionFrame.setVisible(true);

                JPanel positionPanel = new JPanel(new GridLayout(7, 1));

                JLabel title = new JLabel("Position Calculator");
                JTextField initial = new JTextField("Initial Position: ");
                JTextField velocity = new JTextField("Velocity: ");
                JTextField time = new JTextField("Time: ");
                JTextField acceleration = new JTextField("Acceleration: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                positionPanel.add(title);
                positionPanel.add(initial);
                positionPanel.add(velocity);
                positionPanel.add(time);
                positionPanel.add(acceleration);
                positionPanel.add(calculate);
                positionFrame.add(positionPanel);
                positionPanel.add(result);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double init = Double.parseDouble(initial.getText());
                        double v = Double.parseDouble(velocity.getText());
                        double t = Double.parseDouble(time.getText());
                        double a = Double.parseDouble(acceleration.getText());
                        double pos = init + v*t + 0.5*a*t*t;
                        result.setText("Equals:  " + pos);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
            }
        });

        speed.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame speedFrame = new JFrame("Speed Calculator");
                speedFrame.setSize(WIDTH, HEIGHT);
                speedFrame.setVisible(true);

                JPanel speedPanel = new JPanel(new GridLayout(5, 1));

                JLabel title = new JLabel("Speed Calculator");
                JTextField distance = new JTextField("Distance: ");
                JTextField time = new JTextField("Time: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                speedPanel.add(title);
                speedPanel.add(distance);
                speedPanel.add(time);
                speedPanel.add(calculate);
                speedPanel.add(result);
                speedFrame.add(speedPanel);

                calculate.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    try{
                    double dist = Double.parseDouble(distance.getText());
                    double t = Double.parseDouble(time.getText());
                    double speed = dist/t;
                    result.setText("Equals:  " + speed);
                    } catch(NumberFormatException ex){
                        result.setText("Invalid input");
                    }
                }
                });
            }
        });

        distance.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame distanceFrame = new JFrame("Distance Calculator");
                distanceFrame.setSize(WIDTH, HEIGHT);
                distanceFrame.setVisible(true);

                JPanel distancePanel = new JPanel(new GridLayout(5, 1));

                JLabel title = new JLabel("Distance Calculator");
                JTextField speed = new JTextField("Speed: ");
                JTextField time = new JTextField("Time: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                distancePanel.add(title);
                distancePanel.add(speed);
                distancePanel.add(time);
                distancePanel.add(calculate);
                distancePanel.add(result);
                distanceFrame.add(distancePanel);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double s = Double.parseDouble(speed.getText());
                        double t = Double.parseDouble(time.getText());
                        double dist = s*t;
                        result.setText("Equals:  " + dist);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
            }
        
        });
        time.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame timeFrame = new JFrame("Time Calculator");
                timeFrame.setSize(WIDTH, HEIGHT);
                timeFrame.setVisible(true);

                JPanel timePanel = new JPanel(new GridLayout(5, 1));

                JLabel title = new JLabel("Time Calculator");
                JTextField distance = new JTextField("Distance: ");
                JTextField speed = new JTextField("Speed: ");
                JButton calculate = new JButton("Calculate");
                JLabel result = new JLabel("Equals: ");
                timePanel.add(title);
                timePanel.add(distance);
                timePanel.add(speed);
                timePanel.add(calculate);
                timePanel.add(result);
                timeFrame.add(timePanel);

                calculate.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        double dist = Double.parseDouble(distance.getText());
                        double s = Double.parseDouble(speed.getText());
                        double t = dist/s;
                        result.setText("Equals:  " + t);
                        } catch(NumberFormatException ex){
                            result.setText("Invalid input");
                        }
                    }
                    });
                
            }



        });
        
        
        }   
    });

    Tabler.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            JFrame tablerFrame = new JFrame("Tablers");
            tablerFrame.setSize(WIDTH, HEIGHT);
            tablerFrame.setVisible(true);

            JPanel tablerPanel = new JPanel(new GridLayout(4, 1));
            JButton velocity = new JButton("Velocity");
            JButton xandy = new JButton("X and Y Projectile");
            JButton angmov = new JButton("Angular Movement");
            JButton airp = new JButton("Air Pressure");
            tablerPanel.add(velocity);
            tablerPanel.add(xandy);
            tablerPanel.add(angmov);
            tablerPanel.add(airp);
            tablerFrame.add(tablerPanel);

                        airp.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame airpFrame = new JFrame("Air Pressure Tabler");
                    airpFrame.setSize(WIDTH, HEIGHT);
                    airpFrame.setVisible(true);

                    JPanel airpPanel = new JPanel(new GridLayout(5, 1));
                    JLabel title = new JLabel("Air Pressure Tabler");
                    JTextField height = new JTextField("What height do you want to calculate the pressure for?: ");
                    JTextField refheight = new JTextField("Enter desired pressure at reference height: ");
                    JTextField temp = new JTextField("Enter desired temperature in Kelvin (K): ");
   
                    JButton calculate = new JButton("Create Table");
                    airpPanel.add(title);
                    airpPanel.add(height);
                    airpPanel.add(refheight);
                    airpPanel.add(temp);
                    airpPanel.add(calculate);
                    airpFrame.add(airpPanel);

                    calculate.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            JFrame tableFrame = new JFrame("X and Y Projectile Table");
                            tableFrame.setSize(WIDTH, HEIGHT);
                            tableFrame.setVisible(true);

                            double dHeight = 0, dPress = 0, K = 0;
                            double Gacell = 9.80665;
                            double MmDa = 0.02896;
                            double GasConstant = 8.314462;
                            try {
                                 dHeight = Double.parseDouble(height.getText());
                                 dPress = Double.parseDouble(refheight.getText());
                                 K = Double.parseDouble(temp.getText());
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(tableFrame, "Invalid input. Please enter valid numbers.");
                                return;
                            }

                            String fileName = "table1";
double x = (-((MmDa * Gacell) * dHeight)) / (GasConstant * K);
double Pressure = (dPress * (Math.exp(x)));

try{
File file = new File(fileName);
file.createNewFile();
FileWriter writer = new FileWriter(fileName);
writer.write(

"\n"+
"t(s)\t|v(m/s)\t \n" + 
"----------------------+--------------------\n");
for (int i = 0; i <= dHeight; i++){
        
        x = (-((MmDa * Gacell) * i)) / (GasConstant * K);
        double Pressure2 = (dPress * (Math.exp(x)));

writer.write(i + "\t|" + Pressure2 + "\t"  + "\n"); }
    

writer.close();
Scanner reader = new Scanner(file);
JTextArea ta = new JTextArea();
ta.setEditable(false);
while (reader.hasNextLine()) {
    ta.append(reader.nextLine() + "\n");
}
reader.close();
tableFrame.setLayout(new BorderLayout());
tableFrame.add(new JScrollPane(ta), BorderLayout.CENTER);
tableFrame.pack();
tableFrame.setVisible(true);
} catch(FileNotFoundException ex){JLabel label = new JLabel("No file name " + fileName);
tableFrame.add(label);}
catch(IOException ex){
   JOptionPane.showMessageDialog(tableFrame, "Exception occured");}
                        }
                    });

                }
                });

            angmov.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame angmovFrame = new JFrame("Angular Movement Tabler");
                    angmovFrame.setSize(WIDTH, HEIGHT);
                    angmovFrame.setVisible(true);

                    JPanel angmovPanel = new JPanel(new GridLayout(6, 1));
                    JLabel title = new JLabel("Angular Movement Tabler");
                    JTextField iap = new JTextField("Initial angular position: ");
                    JTextField iav = new JTextField("Initial angular velocity: ");
                    JTextField craa = new JTextField("Constant rate of angular acceleration: ");
                    JTextField time = new JTextField("Time elapsed: ");
                    JButton calculate = new JButton("Create Table");
                    angmovPanel.add(title);
                    angmovPanel.add(iap);
                    angmovPanel.add(iav);
                    angmovPanel.add(craa);
                    angmovPanel.add(time);
                    angmovPanel.add(calculate);
                    angmovFrame.add(angmovPanel);
                    angmovFrame.add(angmovPanel);

                    calculate.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            JFrame tableFrame = new JFrame("X and Y Projectile Table");
                            tableFrame.setSize(WIDTH, HEIGHT);
                            tableFrame.setVisible(true);

                            double IAP = 0, IAV = 0, CRAA = 0, t = 0;

                            try {
                                 IAP = Double.parseDouble(iap.getText());
                                 IAV = Double.parseDouble(iav.getText());
                                 CRAA = Double.parseDouble(craa.getText());
                                 t = Double.parseDouble(time.getText());
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(tableFrame, "Invalid input. Please enter valid numbers.");
                                return;
                            }

                            String fileName = "table1";

try{
File file = new File(fileName);
file.createNewFile();
FileWriter writer = new FileWriter(fileName);
writer.write(

"\n"+
"t(s)\t|v(m/s)\t \n" + 
"----------------------+--------------------\n");
for (int i = 0; i <= t; i++){
        
        double AofM = (IAP + (IAV * i) + (1/2 * CRAA * (t * t)));

writer.write(i + "\t|" + AofM + "\t"  + "\n"); }
    

writer.close();
Scanner reader = new Scanner(file);
JTextArea ta = new JTextArea();
ta.setEditable(false);
while (reader.hasNextLine()) {
    ta.append(reader.nextLine() + "\n");
}
reader.close();
tableFrame.setLayout(new BorderLayout());
tableFrame.add(new JScrollPane(ta), BorderLayout.CENTER);
tableFrame.pack();
tableFrame.setVisible(true);
} catch(FileNotFoundException ex){JLabel label = new JLabel("No file name " + fileName);
tableFrame.add(label);}
catch(IOException ex){
   JOptionPane.showMessageDialog(tableFrame, "Exception occured");}
                        }
                    });

                }
                });

            airp.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame airpFrame = new JFrame("Air Pressure Tabler");
                    airpFrame.setSize(WIDTH, HEIGHT);
                    airpFrame.setVisible(true);

                    JPanel airpPanel = new JPanel(new GridLayout(5, 1));
                    JLabel title = new JLabel("Air Pressure Tabler");
                    JTextField height = new JTextField("What height do you want to calculate the pressure for?: ");
                    JTextField refheight = new JTextField("Enter desired pressure at reference height: ");
                    JTextField temp = new JTextField("Enter desired temperature in Kelvin (K): ");
   
                    JButton calculate = new JButton("Create Table");
                    airpPanel.add(title);
                    airpPanel.add(height);
                    airpPanel.add(refheight);
                    airpPanel.add(temp);
                    airpPanel.add(calculate);
                    airpFrame.add(airpPanel);

                    
                }
            });


            xandy.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame xandyFrame = new JFrame("X and Y Projectile Tabler");
                    xandyFrame.setSize(WIDTH, HEIGHT);
                    xandyFrame.setVisible(true);

                    JPanel xandyPanel = new JPanel(new GridLayout(7, 1));
                    JLabel title = new JLabel("X and Y Projectile Tabler");
                    JTextField initx = new JTextField("Initial x position: ");
                    JTextField initvx = new JTextField("Initial Velocity in x-direction: ");
                    JTextField inity = new JTextField("Initial y position: ");
                    JTextField initvy = new JTextField("Initial Velocity in y-direction: ");
                    JTextField time = new JTextField("Time: ");
                    JButton calculate = new JButton("Create Table");
                    xandyPanel.add(title);
                    xandyPanel.add(initx);
                    xandyPanel.add(initvx);
                    xandyPanel.add(inity);
                    xandyPanel.add(initvy);
                    xandyPanel.add(time);
                    xandyPanel.add(calculate);
                    xandyFrame.add(xandyPanel);

                    calculate.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            JFrame tableFrame = new JFrame("X and Y Projectile Table");
                            tableFrame.setSize(WIDTH, HEIGHT);
                            tableFrame.setVisible(true);

                            double spx = 0, svx = 0, spy = 0, svy = 0, t = 0;

                            try {
                                 spx = Double.parseDouble(initx.getText());
                                 svx = Double.parseDouble(initvx.getText());
                                 spy = Double.parseDouble(inity.getText());
                                 svy = Double.parseDouble(initvy.getText());
                                 t = Double.parseDouble(time.getText());
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(tableFrame, "Invalid input. Please enter valid numbers.");
                                return;
                            }

                            String fileName = "table1";
try{
File file = new File(fileName);
file.createNewFile();
FileWriter writer = new FileWriter(fileName);
writer.write(

"\n"+
"t(s)\t|posit x\t|posit y\t \n" + 
"----------------------+--------------------+----------------\n");
for (int i = 0; i <= t; i++){
        
        double projx = (spx +(svx*i));
        double projy = (spy + (svy*i)-((0.5)*(-9.8)*(i*i)));

writer.write(i + "\t|" + projx + "\t|" + 
        projy +"\n"); }
    

writer.close();
Scanner reader = new Scanner(file);
JTextArea ta = new JTextArea();
ta.setEditable(false);
while (reader.hasNextLine()) {
    ta.append(reader.nextLine() + "\n");
}
reader.close();
tableFrame.setLayout(new BorderLayout());
tableFrame.add(new JScrollPane(ta), BorderLayout.CENTER);
tableFrame.pack();
tableFrame.setVisible(true);
} catch(FileNotFoundException ex){JLabel label = new JLabel("No file name " + fileName);
tableFrame.add(label);}
catch(IOException ex){
   JOptionPane.showMessageDialog(tableFrame, "Exception occured");}
                        }
                    });
                }
            });

            velocity.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame velocityFrame = new JFrame("Velocity Tabler");
                    velocityFrame.setSize(WIDTH, HEIGHT);
                    velocityFrame.setVisible(true);

                    JPanel velocityPanel = new JPanel(new GridLayout(6, 1));
                    JLabel title = new JLabel("Velocity Tabler");
                    JTextField sec = new JTextField("How much time would you like to simulate?: ");
                    JTextField inita = new JTextField("Initial Acceleration: ");
                    JTextField initv = new JTextField("Initial Velocity: ");
                    JTextField initp = new JTextField("Initial Position: ");
                    JButton calculate = new JButton("Create Table");
                    velocityPanel.add(title);
                    velocityPanel.add(sec);
                    velocityPanel.add(inita);
                    velocityPanel.add(initv);
                    velocityPanel.add(initp);
                    velocityPanel.add(calculate);
                    velocityFrame.add(velocityPanel);

                    calculate.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            JFrame tableFrame = new JFrame("X and Y Projectile Table");
                            tableFrame.setSize(WIDTH, HEIGHT);
                            tableFrame.setVisible(true);
                             double seconds = 0, initac = 0, initve = 0, initpo = 0;

                            try {
                                 seconds = Double.parseDouble(sec.getText());
                                 initac = Double.parseDouble(inita.getText());
                                 initve = Double.parseDouble(initv.getText());
                                 initpo = Double.parseDouble(initp.getText());
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(tableFrame, "Invalid input. Please enter valid numbers.");
                                return;
                            }

                            String fileName = "table1";
try{
File file = new File(fileName);
file.createNewFile();
FileWriter writer = new FileWriter(fileName);
writer.write(

"\n"+
"  t(s)\t|v(m/s)\t| x(m) \n" + 
"----------------------+--------------------+--------------------\n");
for (int i = 0; i <= seconds; i++){
        
        double velocity = (initve + (initac * i));
        double position = (initpo + (initve * i) + (0.5 * initac * (i * i)));

writer.write(i + "\t|" + velocity + "\t|" + 
        position +"\n"); }
    

writer.close();
Scanner reader = new Scanner(file);
JTextArea ta = new JTextArea();
ta.setEditable(false);
while (reader.hasNextLine()) {
    ta.append(reader.nextLine() + "\n");
}
reader.close();
tableFrame.setLayout(new BorderLayout());
tableFrame.add(new JScrollPane(ta), BorderLayout.CENTER);
tableFrame.pack();
tableFrame.setVisible(true);
} catch(FileNotFoundException ex){JLabel label = new JLabel("No file name " + fileName);
tableFrame.add(label);}
catch(IOException ex){
   JOptionPane.showMessageDialog(tableFrame, "Exception occured");}
                            
                        }
                    });
                }
            });
        }
    });













    Practice.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            JFrame practiceFrame = new JFrame("Practice Problems");
            practiceFrame.setSize(WIDTH, HEIGHT);
            practiceFrame.setVisible(true);

            JPanel practicePanel = new JPanel(new GridLayout(3, 1));
            JButton position = new JButton("Position");
            JButton velocity = new JButton("Velocity");
            JButton acceleration = new JButton("Acceleration");
            practicePanel.add(position);
            practicePanel.add(velocity);
            practicePanel.add(acceleration);
            practiceFrame.add(practicePanel);

            velocity.addActionListener(new ActionListener() {//creates new window for position practice
 public void actionPerformed(ActionEvent e){
 dispose();
 JFrame VelocityFrame = new JFrame();
 VelocityFrame.setSize(WIDTH, HEIGHT);
 VelocityFrame.setVisible(true);

JPanel VelocityPrac = new JPanel();
 VelocityPrac.setLayout(new GridLayout(8,1));
//start of acceleration practice function 
Random random = new Random();

 double CPos = random.nextDouble(0,21);
 double CPosF = (Math.round(CPos*1000)/1000.000);
 double CTime = random.nextDouble(0,21);
 double CTimeF = (Math.round(CTime*1000)/1000.000);
 double Velo = (CPos/CTime);
 double VeloRounded = (Math.round(Velo*1000)) / 1000.000;//round


int solve = random.nextInt(0,3);


//Solve for Velocity
if(solve == 0){



 System.out.println(VeloRounded);//The answer for test purposes

 JLabel solveFor = new JLabel("Solve for Velocity given the following:");
 VelocityPrac.add(solveFor);

 JLabel ChangeInPosition = new JLabel("Change in position: " + CPosF);
 VelocityPrac.add(ChangeInPosition);
 JLabel ChangeInTime = new JLabel("Change in time: " + CTimeF);
 VelocityPrac.add(ChangeInTime);
 JLabel Solve = new JLabel("V = ?");
 VelocityPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 VelocityPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m/s)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(VeloRounded == xInt){ 
 if(unit.equals("m/s")||unit.equals("meters/second")||unit.equals("meters/sec")){

 

 Solve.setText("V = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 VelocityPrac.add(RIGHT);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 VelocityPrac.add(RIGHTwrongUNIT);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();}}
 
 else{ 
 Solve.setText("V = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 VelocityPrac.add(WRONG);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 VelocityPrac.add(INVALID);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement






//Solve for Î”x
if(solve == 1){



 System.out.println(CPosF);//The answer for test purposes

 JLabel solveFor = new JLabel("Solve for the change in position given the following:");
 VelocityPrac.add(solveFor);

 JLabel Velocity = new JLabel("Velocity: " + VeloRounded);
 VelocityPrac.add(Velocity);
 JLabel ChangeInTime = new JLabel("Change in time: " + CTimeF);
 VelocityPrac.add(ChangeInTime);
 JLabel Solve = new JLabel("Î”x = ?");
 VelocityPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 VelocityPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(CPosF == xInt){ 
 if(unit.equals("m")||unit.equals("meters")){

 

 Solve.setText("Î”x = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 VelocityPrac.add(RIGHT);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 VelocityPrac.add(RIGHTwrongUNIT);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();}}
 
 else{ 
 Solve.setText("Î”x = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 VelocityPrac.add(WRONG);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 VelocityPrac.add(INVALID);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement









//Solve for Î”t
if(solve == 2){



 System.out.println(CTimeF);//The answer for test purposes

 JLabel solveFor = new JLabel("Solve for the change in time given the following:");
 VelocityPrac.add(solveFor);

 JLabel Velocity = new JLabel("Velocity: " + VeloRounded);
 VelocityPrac.add(Velocity);
 JLabel ChangeInPosition = new JLabel("Change in time: " + CPosF);
 VelocityPrac.add(ChangeInPosition);
 JLabel Solve = new JLabel("Î”t = ?");
 VelocityPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 VelocityPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (s)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(CTimeF == xInt){ 
 if(unit.equals("s")||unit.equals("second") || unit.equals("sec")){

 

 Solve.setText("Î”t = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 VelocityPrac.add(RIGHT);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 VelocityPrac.add(RIGHTwrongUNIT);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();}}
 
 else{ 
 Solve.setText("Î”t = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 VelocityPrac.add(WRONG);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 VelocityPrac.add(INVALID);
 VelocityPrac.revalidate();
 VelocityPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement


//end of Velocity practice






VelocityFrame.add(VelocityPrac);
 }//closes action performed
 });//closes Acceleration button action listener



acceleration.addActionListener(new ActionListener() {//creates new window for position practice
 public void actionPerformed(ActionEvent e){
 dispose();
 JFrame AccelerationFrame = new JFrame();
 AccelerationFrame.setSize(WIDTH, HEIGHT);
 AccelerationFrame.setVisible(true);

JPanel AccelerationPrac = new JPanel();
 AccelerationPrac.setLayout(new GridLayout(8,1));
//start of acceleration practice function 
Random random = new Random();

double v1 = random.nextInt(20);
 double v2 = random.nextInt(20);
 double t1 = random.nextInt(20)+1;
 double t2 = random.nextInt(20)+1;


 int solve = random.nextInt(5);//random variable to solve for
 double a = (v2-v1) / (t2-t1);


//Solve for Acceleration
if(solve == 0){
 //System.out.println(a);//The answer for test purposes

 JLabel solveFor = new JLabel("Solve for acceleration given the following:");
 AccelerationPrac.add(solveFor);

 JLabel InitialVelocity = new JLabel("Initial velocity: " + v1);
 AccelerationPrac.add(InitialVelocity);
 JLabel FinalVelocity = new JLabel("Final velocity: " + v2);
 AccelerationPrac.add(FinalVelocity);
 JLabel InitialTime = new JLabel("Initial time: " + t1);
 AccelerationPrac.add(InitialTime);
 JLabel FinalTime = new JLabel("Final time: " + t2);
 AccelerationPrac.add(FinalTime);
 JLabel Solve = new JLabel("a = ?");
 AccelerationPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 AccelerationPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m/sÂ²)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(a == xInt){ 
 if(unit.equals("m/s^2")||unit.equals("m/sÂ²")||unit.equals("meters/secondsÂ²")){

 

 Solve.setText("a = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 AccelerationPrac.add(RIGHT);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 AccelerationPrac.add(RIGHTwrongUNIT);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}}
 
 else{ 
 Solve.setText("a = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 AccelerationPrac.add(WRONG);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 AccelerationPrac.add(INVALID);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement






//Solve for initial velocity
if(solve == 1){
 //System.out.println(v1);//The answer for test purposes

 JLabel solveFor = new JLabel("Solve for initial velocity given the following:");
 AccelerationPrac.add(solveFor);

 JLabel Acceleration = new JLabel("Acceleration: " + a);
 AccelerationPrac.add(Acceleration);
 JLabel InitialVelocity = new JLabel("Final velocity: " + v2);
 AccelerationPrac.add(InitialVelocity);
 JLabel InitialTime = new JLabel("Initial time: " + t1);
 AccelerationPrac.add(InitialTime);
 JLabel FinalTime = new JLabel("Final time: " + t2);
 AccelerationPrac.add(FinalTime);
 JLabel Solve = new JLabel("v1 = ?");
 AccelerationPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 AccelerationPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m/s)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(v1 == xInt){ 
 if(unit.equals("m/s")||unit.equals("meters/second")||unit.equals("meters/sec")){

 

 Solve.setText("v1 = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 AccelerationPrac.add(RIGHT);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 AccelerationPrac.add(RIGHTwrongUNIT);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}}
 
 else{ 
 Solve.setText("v1 = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 AccelerationPrac.add(WRONG);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 AccelerationPrac.add(INVALID);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement






//Solve for final velocity
if(solve == 2){
 //System.out.println(v1);//The answer for test purposes

 JLabel solveFor = new JLabel("Solve for final velocity given the following:");
 AccelerationPrac.add(solveFor);

 JLabel Acceleration = new JLabel("Acceleration: " + a);
 AccelerationPrac.add(Acceleration);
 JLabel InitialVelocity = new JLabel("Initial velocity: " + v1);
 AccelerationPrac.add(InitialVelocity);
 JLabel InitialTime = new JLabel("Initial time: " + t1);
 AccelerationPrac.add(InitialTime);
 JLabel FinalTime = new JLabel("Final time: " + t2);
 AccelerationPrac.add(FinalTime);
 JLabel Solve = new JLabel("v2 = ?");
 AccelerationPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 AccelerationPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m/s)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(v1 == xInt){ 
 if(unit.equals("m/s")||unit.equals("meters/second")||unit.equals("meters/sec")){

 

 Solve.setText("v2 = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 AccelerationPrac.add(RIGHT);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 AccelerationPrac.add(RIGHTwrongUNIT);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}}
 
 else{ 
 Solve.setText("v2 = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 AccelerationPrac.add(WRONG);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 AccelerationPrac.add(INVALID);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement






//Solve for initial time
if(solve == 3){
 //System.out.println(t1);//The answer for test purposes

 JLabel solveFor = new JLabel("Solve for initial time given the following:");
 AccelerationPrac.add(solveFor);

 JLabel Acceleration = new JLabel("Acceleration: " + a);
 AccelerationPrac.add(Acceleration);
 JLabel InitialVelocity = new JLabel("Final velocity: " + v1);
 AccelerationPrac.add(InitialVelocity);
 JLabel FinalVelocity = new JLabel("Initial time: " + v2);
 AccelerationPrac.add(FinalVelocity);
 JLabel FinalTime = new JLabel("Final time: " + t2);
 AccelerationPrac.add(FinalTime);
 JLabel Solve = new JLabel("t1 = ?");
 AccelerationPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 AccelerationPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (s)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(t1 == xInt){ 
 if(unit.equals("s")||unit.equals("seconds") ||unit.equals("sec")){

 

 Solve.setText("t1 = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 AccelerationPrac.add(RIGHT);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 AccelerationPrac.add(RIGHTwrongUNIT);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}}
 
 else{ 
 Solve.setText("t1 = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 AccelerationPrac.add(WRONG);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 AccelerationPrac.add(INVALID);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement





//Solve for final time
if(solve == 4){
 //System.out.println(t2);//The answer for test purposes

 JLabel solveFor = new JLabel("Solve for final time given the following:");
 AccelerationPrac.add(solveFor);

 JLabel InitialPosition = new JLabel("Acceleration: " + a);
 AccelerationPrac.add(InitialPosition);
 JLabel InitialVelocity = new JLabel("Final velocity: " + v1);
 AccelerationPrac.add(InitialVelocity);
 JLabel Time = new JLabel("Initial time: " + v2);
 AccelerationPrac.add(Time);
 JLabel Acceleration = new JLabel("Final time: " + t1);
 AccelerationPrac.add(Acceleration);
 JLabel Solve = new JLabel("t2 = ?");
 AccelerationPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 AccelerationPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (s)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(t2 == xInt){ 
 if(unit.equals("s")||unit.equals("seconds") ||unit.equals("sec")){

 

 Solve.setText("t2 = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 AccelerationPrac.add(RIGHT);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 AccelerationPrac.add(RIGHTwrongUNIT);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}}
 
 else{ 
 Solve.setText("t2 = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 AccelerationPrac.add(WRONG);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 AccelerationPrac.add(INVALID);
 AccelerationPrac.revalidate();
 AccelerationPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement



//end of Acceleration practice
AccelerationFrame.add(AccelerationPrac);
 }//closes action performed
 });//closes Acceleration button action listener

            position.addActionListener(new ActionListener() {//creates new window for position practice
 public void actionPerformed(ActionEvent e){
 JFrame PositionFrame = new JFrame();
 PositionFrame.setSize(WIDTH, HEIGHT);
 PositionFrame.setVisible(true);

 JPanel PositionPrac = new JPanel();
 PositionPrac.setLayout(new GridLayout(8,1));
//start of position practice function 
Random random = new Random();

double x0 = random.nextInt(20);
double v0 = random.nextInt(20);
double t = random.nextInt(20)+1;
double a = random.nextInt(20);

double x = x0 + (v0 * t) + (0.5)*(a)*(t*t);
int solve = random.nextInt(5);



//Solve for position
if(solve == 0){
 //System.out.println(x);//the answer for test purposed

 JLabel solveFor = new JLabel("Solve for final position given the following:");
 PositionPrac.add(solveFor);

 JLabel InitialPosition = new JLabel("Initial position: " + x0);
 PositionPrac.add(InitialPosition);
 JLabel InitialVelocity = new JLabel("Initial velocity: " + v0);
 PositionPrac.add(InitialVelocity);
 JLabel Time = new JLabel("Time elapsed: " + t);
 PositionPrac.add(Time);
 JLabel Acceleration = new JLabel("Acceleration: " + a);
 PositionPrac.add(Acceleration);
 JLabel Solve = new JLabel("x(t) = ?");
 PositionPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 PositionPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(x == xInt){ 
 if(unit.equals("m") || unit.equals("meters")){

 

 Solve.setText("x(t) = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 PositionPrac.add(RIGHT);
 PositionPrac.revalidate();
 PositionPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 PositionPrac.add(RIGHTwrongUNIT);
 PositionPrac.revalidate();
 PositionPrac.repaint();}}
 
 else{ 
 Solve.setText("x(t) = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 PositionPrac.add(WRONG);
 PositionPrac.revalidate();
 PositionPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 PositionPrac.add(INVALID);
 PositionPrac.revalidate();
 PositionPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement 





//Solve for Initial Position
if(solve == 1){
 //System.out.println(x0);//the answer for test purposes

 JLabel solveFor = new JLabel("Solve for initial position given the following:");
 PositionPrac.add(solveFor);

 JLabel FinalPosition = new JLabel("Final Position: " + x);
 PositionPrac.add(FinalPosition);
 JLabel InitialVelocity = new JLabel("Initial velocity: " + v0);
 PositionPrac.add(InitialVelocity);
 JLabel Time = new JLabel("Time elapsed: " + t);
 PositionPrac.add(Time);
 JLabel Acceleration = new JLabel("Acceleration: " + a);
 PositionPrac.add(Acceleration);
 JLabel Solve = new JLabel("x0 = ?");
 PositionPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 PositionPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(x0 == xInt){ 
 if(unit.equals("m") || unit.equals("meters")){

 

 Solve.setText("x0 = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 PositionPrac.add(RIGHT);
 PositionPrac.revalidate();
 PositionPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 PositionPrac.add(RIGHTwrongUNIT);
 PositionPrac.revalidate();
 PositionPrac.repaint();}}
 
 else{ 
 Solve.setText("x0 = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 PositionPrac.add(WRONG);
 PositionPrac.revalidate();
 PositionPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 PositionPrac.add(INVALID);
 PositionPrac.revalidate();
 PositionPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement



//Solve for initial velocity
if(solve == 2){
 //System.out.println(v0);//the answer for test purposes

 JLabel solveFor = new JLabel("Solve for initial velocity given the following:");
 PositionPrac.add(solveFor);

 JLabel InitialPosition = new JLabel("Initial position: " + x0);
 PositionPrac.add(InitialPosition);
 JLabel FinalPosition = new JLabel("Final position: " + x);
 PositionPrac.add(FinalPosition);
 JLabel Time = new JLabel("Time elapsed: " + t);
 PositionPrac.add(Time);
 JLabel Acceleration = new JLabel("Acceleration: " + a);
 PositionPrac.add(Acceleration);
 JLabel Solve = new JLabel("v0 = ?");
 PositionPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 PositionPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m/s)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(v0 == xInt){ 
 if(unit.equals("m/s") || unit.equals("meters/second") || unit.equals("meters/sec")){

 

 Solve.setText("v0 = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 PositionPrac.add(RIGHT);
 PositionPrac.revalidate();
 PositionPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 PositionPrac.add(RIGHTwrongUNIT);
 PositionPrac.revalidate();
 PositionPrac.repaint();}}
 
 else{ 
 Solve.setText("v0 = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 PositionPrac.add(WRONG);
 PositionPrac.revalidate();
 PositionPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 PositionPrac.add(INVALID);
 PositionPrac.revalidate();
 PositionPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement



//Solve time
if(solve == 3){
 //System.out.println(t);//the answer for test purposes

 JLabel solveFor = new JLabel("Solve for time given the following:");
 PositionPrac.add(solveFor);

 JLabel InitialPosition = new JLabel("Initial position: " + x0);
 PositionPrac.add(InitialPosition);
 JLabel InitialVelocity = new JLabel("Initial velocity: " + v0);
 PositionPrac.add(InitialVelocity);
 JLabel FinalPosition = new JLabel("Final Position: " + x);
 PositionPrac.add(FinalPosition);
 JLabel Acceleration = new JLabel("Acceleration: " + a);
 PositionPrac.add(Acceleration);
 JLabel Solve = new JLabel("t = ?");
 PositionPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 PositionPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (s)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(t == xInt){ 
 if(unit.equals("s") || unit.equals("seconds") || unit.equals("sec")){

 

 Solve.setText("t = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 PositionPrac.add(RIGHT);
 PositionPrac.revalidate();
 PositionPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 PositionPrac.add(RIGHTwrongUNIT);
 PositionPrac.revalidate();
 PositionPrac.repaint();}}
 
 else{ 
 Solve.setText("t = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 PositionPrac.add(WRONG);
 PositionPrac.revalidate();
 PositionPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 PositionPrac.add(INVALID);
 PositionPrac.revalidate();
 PositionPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement


//Solve for acceleration
if(solve == 4){
 //System.out.println(a);//the answer for test purposes

 JLabel solveFor = new JLabel("Solve for acceleration given the following:");
 PositionPrac.add(solveFor);

 JLabel InitialPosition = new JLabel("Initial position: " + x0);
 PositionPrac.add(InitialPosition);
 JLabel InitialVelocity = new JLabel("Initial velocity: " + v0);
 PositionPrac.add(InitialVelocity);
 JLabel Time = new JLabel("Time elapsed: " + t);
 PositionPrac.add(Time);
 JLabel FinalPosition = new JLabel("Final position: " + x);
 PositionPrac.add(FinalPosition);
 JLabel Solve = new JLabel("a = ?");
 PositionPrac.add(Solve);

 JTextField uAnswer = new JTextField("(insert answer with units here ex. 17 m)");
 PositionPrac.add(uAnswer);
 
 uAnswer .addKeyListener(new KeyListener(){//creates new window for position practice
 @Override
 public void keyPressed(KeyEvent e){ 
 if(e.getKeyCode() == KeyEvent.VK_ENTER){

 JLabel RIGHT = new JLabel("That's correct!");
 JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m/sÂ²)"); 
 JLabel WRONG = new JLabel("Incorrect... Try Again");
 String unit = "";

 try{
 String uInX = uAnswer.getText();

 String[] parts = uInX.split(" ");

 double xInt = Double.parseDouble(parts[0]);
 if(parts.length>1){unit = parts[1];}
 
 //System.out.println(unit); //check for unit 

 if(a == xInt){ 
 if(unit.equals("m/s^2")||unit.equals("m/sÂ²")||unit.equals("meters/secondsÂ²")){

 

 Solve.setText("a = " + xInt);
 //JLabel RIGHT = new JLabel("That's correct!");
 PositionPrac.add(RIGHT);
 PositionPrac.revalidate();
 PositionPrac.repaint();}
 else{
 //JLabel RIGHTwrongUNIT = new JLabel("Correct, missing unit (m)");
 PositionPrac.add(RIGHTwrongUNIT);
 PositionPrac.revalidate();
 PositionPrac.repaint();}}
 
 else{ 
 Solve.setText("a = " + xInt);
 //JLabel WRONG = new JLabel("Incorrect... Try Again"); 
 PositionPrac.add(WRONG);
 PositionPrac.revalidate();
 PositionPrac.repaint();
 }
 }//close try
 catch(NumberFormatException ex){
 JLabel INVALID = new JLabel("Invalid input");
 PositionPrac.add(INVALID);
 PositionPrac.revalidate();
 PositionPrac.repaint();}//close catch
}}
 
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}


 });//closes uAnswer action listener

}//closes if statement


PositionFrame.add(PositionPrac);

//end position practice

 }//closes action performed
 });//closes Position button action listener


            
}
    });

    }
    
 

    public static void main(String[] args) {
        new Template();
    }
    
}

