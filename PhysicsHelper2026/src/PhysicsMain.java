import java.util.Scanner;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhysicsMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char choice = 'y';
        while(choice == 'y'){
            System.out.println("Choose a function: \n\t[C]alculators\n\t[T]able Generator \n\t[P]Practice Problems");
            choice = in.next().toLowerCase().charAt(0);
            System.out.println();
            switch(choice) {
                case 'c': calculators(in); break;
                case 't': tabler(in); break;
                case 'p': PracticeProblems(in); break;
                //TODO: Add cases for other functionalities
                default: System.out.println("Function not recognized."); choice = 'y'; continue;
            }
            System.out.println("Would you like to continue? [Y/n]");
            choice = in.next().toLowerCase().charAt(0);
            System.out.println();
        }
        in.close();
    }

    public static void calculators(Scanner in){
        System.out.println("Enter which type of calculation to perform:\n1) Position\n2) Velocity\n3) Acceleration\n4) Fluid pressure \n5) Angular motion \n6) Projectile motion");
        int choice = in.nextInt();
        System.out.println();
        switch(choice) {
            case 1: Position(in); break;
            case 2: Velocity(in); break;
            case 3: Acceleration(in); break;
            case 4: FluidPressure(in); break;
            case 5: AngularMotion(in); break;
            // case 6: ProjectileMotion(in); break;
            case 's': speed(in); break;
            case 'd': distance(in); break;
            case 't': time(in); break;
            case 'p': projectilemotion(in); break;
            //case 't': angularChoice(in); break;
            //TODO: Add cases for existing calculators
            default: System.out.println("Function not recognized.  Returning to menu."); break;
        }
    }

    public static void Position(Scanner in){
        System.out.println("You chose: Position");
            System.out.println("Enter initial position (x0): ");
            double x0 = in.nextDouble();
            System.out.println("Enter initial velocity (v0): ");
            double v0 = in.nextDouble();
            System.out.println("Enter time (t): ");
            double t = in.nextDouble();
            System.out.println("Enter acceleration (a): ");
            double a = in.nextDouble();
            double position = x0 + v0 * t + 0.5 * a * t * t;
            System.out.println("The calculated position is: " + position + ".");
    }

    public static void Velocity(Scanner in){
        System.out.println("You chose: Velocity");
        System.out.println("Enter final velocity (xf): ");
        double xf = in.nextDouble();
        System.out.println("Enter initial velocity (v0): ");
        double v0v = in.nextDouble();
        System.out.println("Enter final time (t): ");
        double tF = in.nextDouble();
        System.out.println("Enter initial time (t0): ");
        double t0 = in.nextDouble();
        double velocity = (xf - v0v) / (tF - t0);
        System.out.println("The calculated velocity is: " + velocity + ".");
    }

    public static void Acceleration(Scanner in){
        System.out.println("You chose: Acceleration");
        System.out.println("Enter final velocity (vf): ");
        double vf = in.nextDouble();
        System.out.println("Enter initial velocity (v0): ");
        double v0a = in.nextDouble();
        System.out.println("Enter final time (tF): ");
        double tFa = in.nextDouble();
        System.out.println("Enter initial time (t0): ");
        double t0a = in.nextDouble();
        double acceleration = (vf - v0a) / (tFa - t0a);
        System.out.println("The calculated acceleration is: " + acceleration + ".");
    }

    public static void AngularMotion(Scanner in){
       System.out.println("Which would you like \n1) Angular Speed \n2) Angular Movement");
                    int angularChoice = in.nextInt();
                    switch (angularChoice) {
                        case 1:
                            System.out.println("You chose Angular Speed (Ã¢ Âµ = Ã¢ Âµ0 + ÃŽÂ±t) ");
                    System.out.print("Enter initial Angular Speed (Ã¢ Âµ0): ");
                    double aS = in.nextDouble();

                    System.out.println("Enter inital Angular Accerleration (ÃŽÂ±):");
                    double AA = in.nextDouble();

                    System.out.println("Enter inital Time: ");
                    double T = in.nextDouble();

                    double AS = aS + (AA * T);
                    System.out.println("Your angular Motion is " +AS);

                    break;
                        case 2:
                            System.out.println("You chose Angule of Movement (θ = θ0 + ⍵0t + (½)αt^2) ");
                        System.out.println("Enter inital Angle (θ0): ");
                        double Iangle = in.nextDouble();

                        System.out.println("Enter inital Angular Speed (⍵0)");
                        double Aspeed = in.nextDouble();

                        System.out.println("Enter change in time (t): ");
                        double time = in.nextDouble();
    
                        System.out.println("Enter inital Angular Accerleration (α):");
                        double  aA = in.nextDouble();

                        double Amovement = Iangle + (Aspeed*time) + (.5*aA*time*time) ;
                        System.out.println("Your Angle of Movement is " +Amovement);}}
                    

    public static void FluidPressure(Scanner in){
        System.out.println("Enter which type of Fluid Pressure calculation to perform:\n1) Absolute fluid pressure \n2) Bernoulli’s equation");
        int FluidChoice = in.nextInt();
         final double g = 9.81;
        switch (FluidChoice) {
            case 1:
                System.out.println("You chose: Fluid Pressure");
        System.out.println("Enter initial pressure (P0): ");
        double p0 = in.nextDouble();
        System.out.println("Enter fluid density (p): ");
        double density = in.nextDouble();
        System.out.println("Enter depth (h): ");
        double h = in.nextDouble();
        double pressure = p0 + density * g * h;
        System.out.println("The calculated fluid pressure is: " + pressure + ".");
                break;
            case 2:
                System.out.println("You chose: Bernoulli's equation");
        System.out.println("Enter fluid density (p): ");
        double densityB = in.nextDouble();
        System.out.println("Enter initial height (y1): ");
        double y1 = in.nextDouble();
        System.out.println("Enter initial velocity (v1): ");
        double v1 = in.nextDouble();
        System.out.println("Enter final height (y2): ");
        double y2 = in.nextDouble();
        System.out.println("Enter final velocity (v2): ");
        double v2 = in.nextDouble();
        System.out.println("Enter Final pressure (P2): ");
        double p2 = in.nextDouble();
        double bernoulli = p2 + (densityB * g * y1 - densityB * g * y2) + (0.5 * densityB * v2 * v2 - 0.5 * densityB * v1 * v1);
        System.out.println("The calculated Bernoulli's equation result is: " + bernoulli + ".");
                break;
            default: System.out.println("Function not recognized. Returning to menu."); break;
            
        }}
    }
    public static void projectilemotion(Scanner in) {
    System.out.println("Would you like to  calculate projectile motion for the x or y?(x/y)"); 
    char choice = in.nextln();
    if (choice == 'x') {
    System.out.println("Enter initial x position: ");
     int xi = in.nextInt();
     System.out.println("Enter initial x velocity: ");
     int xv = in.nextInt();
     System.out.println("Enter current x time:");
     int tx = in.nextInt();
     int x = xi+ (xv*tx);
    System.out.println("The motion in the x-direction is: "+x+".");}
    else if (choice == 'y') {
     System.out.println("Enter initial y position: ");
     int yi = in.nextInt();
     System.out.println("Enter initial y velocity: ");
     int yv = in.nextInt();
     System.out.println("Enter current y time: ");
     int yt = in.nextInt();
     System.out.println("Enter the force of gravity applied: ");
     int g = in.nextInt();
     double y = yi+ (yv*yt)-.5*(g*(yt*yt));
     System.out.println("Motion in the y-direction: "+y+".");}}
    
    public static void tabler(Scanner in) {
        //TODO: Complete tabler
        System.out.print("Enter a number of seconds to simulate: ");
        int seconds = in.nextInt();

        System.out.print("Enter initial acceleration in m/s^2: ");
        int IA = in.nextInt();

        System.out.print("Enter initial velocity in m/s: ");
        int IV = in.nextInt();

        System.out.print("Enter Initial Postition in m: ");
        int IP = in.nextInt();

    //for loop, for every speed 0 - given speed
    for(int i = 0; i <=0; i++);
    
    }
    // random practice problems generator
    public static void PracticeProblems(Scanner in) {
        System.out.println("What type of practice problem would you like? \n1)Position \n2)Velocity \n3)Acceleration");
        int choice = in.nextInt();
        Random rand = new Random();
        switch(choice) {
            case 1:
                System.out.println("You chose: Position");
                ArrayList<Double> positionProblems = new ArrayList<>();
                double x0 = Math.round(rand.nextDouble() * 100.0) / 10.0;
                double v0 = Math.round(rand.nextDouble() * 100.0) / 10.0;
                double t = Math.round(rand.nextDouble() * 100.0) / 10.0;
                double a = Math.round(rand.nextDouble() * 100.0) / 10.0;

                ArrayList<String> variables = new ArrayList<>();
                variables.add("x0");
                variables.add("v0");
                variables.add("t");
                variables.add("a");

                positionProblems.add(x0);
                positionProblems.add(v0);
                positionProblems.add(t);
                positionProblems.add(a);

                int randIndex = rand.nextInt(positionProblems.size()); // randomly select which variable will be the answer

                double Answer = positionProblems.get(randIndex);        // get the value of the answer variable
                System.out.println("Find the value of " + variables.get(randIndex) + " given the following: ");
                for (int i = 0; i < positionProblems.size(); i++) {     // loop through the variables and print out the ones that are not the answer
                    if (i != randIndex) {                               // skip the variable that is the answer
                        System.out.println(variables.get(i) + " = " + positionProblems.get(i));

                    }
                }  System.out.println("Enter your answer: ");
                double userAnswer = in.nextDouble();
                if (userAnswer == Answer) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is: " + Answer);
                }
                break;

        
        case 2:
            System.out.println("You chose: Velocity");
            ArrayList<Double> velocityProblems = new ArrayList<>();
            double xf = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double v0v = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double tF = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double t0 = Math.round(rand.nextDouble() * 100.0) / 10.0;

            ArrayList<String> variablesV = new ArrayList<>();
            variablesV.add("xf");
            variablesV.add("v0");
            variablesV.add("tF");
            variablesV.add("t0");

            velocityProblems.add(xf);
            velocityProblems.add(v0v);
            velocityProblems.add(tF);
            velocityProblems.add(t0);
            int randIndexV = rand.nextInt(velocityProblems.size()); // randomly select which variable will be the answer
            double AnswerV = velocityProblems.get(randIndexV);        // get the value of the answer variable
            System.out.println("Find the value of " + variablesV.get(randIndexV) + " given the following: ");
            for (int i = 0; i < velocityProblems.size(); i++) {     // loop through the variables and print out the ones that are not the answer
                if (i != randIndexV) {                               // skip the variable that is the answer
                    System.out.println(variablesV.get(i) + " = " + velocityProblems.get(i));
                }
            }  System.out.println("Enter your answer: ");
            double userAnswerV = in.nextDouble();
            if (userAnswerV == AnswerV) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is: " + AnswerV);
            }
            break;
        case 3:
            System.out.println("You chose: Acceleration");
            ArrayList<Double> accelerationProblems = new ArrayList<>();
            double vf = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double v0a = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double tFa = Math.round(rand.nextDouble() * 100.0) / 10.0;
            double t0a = Math.round(rand.nextDouble() * 100.0) / 10.0;

            ArrayList<String> variablesA = new ArrayList<>();
            variablesA.add("vf");
            variablesA.add("v0");
            variablesA.add("tF");
            variablesA.add("t0");

            accelerationProblems.add(vf);
            accelerationProblems.add(v0a);
            accelerationProblems.add(tFa);
            accelerationProblems.add(t0a);
            int randIndexA = rand.nextInt(accelerationProblems.size()); // randomly select which variable will be the answer
            double AnswerA = accelerationProblems.get(randIndexA);        // get the value of the answer variable
            System.out.println("Find the value of " + variablesA.get(randIndexA) + " given the following: ");
            for (int i = 0; i < accelerationProblems.size(); i++) {     // loop through the variables and print out the ones that are not the answer
                if (i != randIndexA) {                               // skip the variable that is the answer
                    System.out.println(variablesA.get(i) + " = " + accelerationProblems.get(i));
                }
            }  System.out.println("Enter your answer: ");
            double userAnswerA = in.nextDouble();
            if (userAnswerA == AnswerA) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is: " + AnswerA);
            }
            break;
        default: System.out.println("Function not recognized. Returning to menu."); break;
        }
    }
}