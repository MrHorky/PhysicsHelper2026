import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Om extends JFrame{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 281;

    public Om(){
        setTitle("Physics GUI");//name of file 
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //TODO: set up commands
        PGUI();

        setVisible(true);
    }

    public void CalcButt(){
        // JPanel buttonPanel = new JPanel(new GridLayout(2,2)); 
        // JTextField fileField = new JTextField(5);

        // JLabel Label1 = new JLabel();
        // Label1.setText("Choose a Selection");

        // JButton button1 = new JButton("Calculators");
        // JButton button2 = new JButton("subtract");
        //JTabbedPane tabs = new JTabbedPane();
        // tabs.setText("calculator");

    }

    public void PGUI(){
        
        JPanel buttonPanel = new JPanel(new GridLayout(2,2)); 
        //JTextField fileField = new JTextField(5);

        JLabel Label1 = new JLabel();
        Label1.setText("Choose a Selection");

        JButton CalcButt = new JButton("Calculators");
        JButton button2 = new JButton("Tabler");
        JButton button3 = new JButton("Practice Problems");


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

            JPanel buttonPanel = new JPanel(new GridLayout(2,2));

            JButton speed = new JButton("Speed");
            JLabel Label1 = new JLabel();
            Label1.setText("Choose a Selection");


        JButton CalcButt = new JButton("Calculators");
        JButton button2 = new JButton("subtract");

        buttonPanel.add(speed);
        CalcFrame.add(buttonPanel);
        //JTable 
    }
});

}

public static void main(String[] args){
new PhysicsMain();
}

}