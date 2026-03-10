import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;


public class ReeceGUITabler extends JFrame {

private static final int WIDTH = 500;
private static final int HEIGHT = 281;
public static boolean Calculator = false;
    


    //making the window and executing the stuff
    public ReeceGUITabler() {
    setTitle("QUI Quiz Calculator");
    setSize(WIDTH,HEIGHT);
    setLayout(new GridLayout(2,5));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    buildcalc();


    setVisible(true);
}


    public void buildcalc(){
    JPanel buttonPanel= new JPanel(new FlowLayout());
    buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
    JLabel Alt = new JLabel("Enter Altitude In Thousands");
    JLabel space = new JLabel("\n\n\n");
    JTextField Altitude = new JTextField("altitude");
    JLabel name = new JLabel("Air Resistance Calculator");
    JButton Calculate = new JButton("Calculate");
    JLabel ARTop = new JLabel("Meters | Air Pressure");


    Calculate.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        Calculator = true;
        int a = Integer.parseInt(Altitude.getText());

        buttonPanel.add(ARTop);
        System.out.println(ARTop);
        for (int i=0;i<=a;){
                        double p = 101.325 * ((1-((0.0065*i)/288.15))*5.255);
                        double pr = Math.round(p*100.00)/100.00; 
                        if (i>0){
                            JLabel others = new JLabel(""+i+"     | "+pr);
                        System.out.println(""+i+"   | "+pr);
                        buttonPanel.add(others);
                        }else if (i==0) {
                        JLabel format = new JLabel("-----------+-------------------");
                            JLabel start = new JLabel (i+"            | "+pr);
                            System.out.println("---------+---------");
                            System.out.println(i+"           | "+pr);
                            buttonPanel.add(format);
                            buttonPanel.add(start);
                        }
                    i+=1000;}
    }

    });
    buttonPanel.add(name);
    buttonPanel.add(space);
    buttonPanel.add(Alt);
    buttonPanel.add(Altitude);
    buttonPanel.add(Calculate);
    add(buttonPanel);

}

public static void main(String[] args) {
    new ReeceGUITabler();
}}