import java.util.Scanner;

public class PhysicsMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean choice = true;
        while(choice == true){
            System.out.println("Choose a function: \n\t[C]alculators\n\t[T]able Generator");
            choice = in.next().toLowerCase().charAt(0);
            System.out.println();
            switch(choice) {
                case 'c': calculators(in); break;
                case 't': tabler(in); break;
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
        System.out.println("Choose a calculator: \n\t[S]peed\n\t[D]istance\n\t[T]ime");
        char choice = in.next().toLowerCase().charAt(0);
        System.out.println();
        switch(choice) {
            case 1: speed(in); break;
            case 2: distance(in); break;
            case 3: time(in); break;
            case 4: posCalc(in);
            case 5: velCalc(in);
            case 6:
            case 7:
            case 8:
            case 9:
            //TODO: Add cases for existing calculators
            default: System.out.println("Function not recognized.  Returning to menu."); break;
        }
    }

    public static void speed(Scanner in){
        System.out.print("Enter a value for distance in meters (m): ");
        double dist = in.nextDouble();
        System.out.print("Enter a value for time in seconds (s): ");
        double time = in.nextDouble();
        double speed = dist / time;
        System.out.println("The speed of the object is " + speed + " m/s.\n");
    }

    public static void distance(Scanner in){
        System.out.print("Enter a value for speed in meters per second (m/s): ");
        double speed = in.nextDouble();
        System.out.print("Enter a value for time in seconds (s): ");
        double time = in.nextDouble();
        double dist = speed * time;
        System.out.println("The distance that the object has traveled is " + dist + " m.\n");
    }

    public static void time(Scanner in){
        System.out.print("Enter a value for distance in meters (m): ");
        double dist = in.nextDouble();
        System.out.print("Enter a value for speed in meters per second (m/s): ");
        double speed = in.nextDouble();
        double time = dist / speed;
        System.out.println("The time during which the object has traveled is " + time + " s.\n");
    }

    public static void posCalc(Scanner in) {
        System.out.println("Enter the initial velocity for your problem: ");
        int inPos = in.nextInt();

        System.out.println("Enter the initial position for your problem: ");
        int inVel = in.nextInt();
        
        System.out.println("Enter the time for your problem: ");
        int time = in.nextInt();

        System.out.println("Enter the acceleration for your problem: "); 
        int acceleration = in.nextInt();

        double finalPos = (inPos + (inVel * time) + ((Math.pow(time, 2) * acceleration) / 2));
        System.out.println("the final position of your object is: " + finalPos + "m");

        System.out.println("Do you want to continue? Y(yes) or N(no)");
        String YoN = in.next();
        if(YoN.equals("Y") == true) {
            cont = true;
        }
        else {
            cont = false;
        }
    }
    public static void velCalc(Scanner in) {
        System.out.println("Enter the change in position for your problem: ");
        int chanPos = in.nextInt();

        System.out.println("Enter the change in time for your problem: ");
        int chanTime = in.nextInt();

        double finalChangeVelocity = (chanPos * chanTime);
        System.out.println("The change in velocity of your object is: " + finalChangeVelocity + "m/s");

        System.out.println("Do you want to continue? Y(yes) or N(no)");
        String YoN = in.next();
        if(YoN.equals("Y") == true) {
            cont = true;
        }
        else {
            cont = false;
        }
    }
    public static void accelCalc(Scanner in) {
        System.out.println("Enter the change in velocity for your problem: ");
        int chanVel = in.nextInt();

        System.out.println("Enter the change in time for your problem: ");
        int chanTime = in.nextInt();

        double finalAcceleration = (chanVel * chanTime);
        System.out.println("The acceleration of your object is: " + finalAcceleration + "m/s^2");

        System.out.println("Do you want to continue? Y(yes) or N(no)");
        String YoN = in.next();
        if(YoN.equals("Y") == true) {
            cont = true;
        }
        else {
            cont = false;
        }
    }
    public static void projCalc(Scanner in) {
        //CRIS'S CODE - slightly edited to fit in this code smoothly.
        System.out.println("Do you want to solve for motion in the x-direction or y-direction?" + "\n" + "1. Motion in x-direction" + "\n" + "2. Motion in y-direction");
        int shape = in.nextInt();

        if (shape == 1){
            System.out.println("Enter your initial position");
            double initialposition = in.nextDouble();
            System.out.println("Enter your initial horizontal velocity");
            double initialhorizontalvelocity = in.nextDouble();
            System.out.println("Enter your initial time");
            double time = in.nextDouble();
        
            double motionxdirection = initialposition + initialhorizontalvelocity * time;
            System.out.println("Your Motion in the x-direction is " + motionxdirection + "m");
    }

        if (shape == 2){
            System.out.println("Enter your initial vertical position");
            double initialverticalposition = in.nextDouble();
            System.out.println("Enter your initial vertical velocity");
            double initialverticalvelocity = in.nextDouble();
            System.out.println("Enter your initial time");
            double time = in.nextDouble();
            System.out.println("Enter gravity acceleration");
            double accelerationgravity = in.nextDouble();

            double motionydirection = initialverticalposition + initialverticalvelocity * time - 0.5 * (accelerationgravity * (time * time));
            System.out.println("Your Motion in the y-direction is " + motionydirection + "m");
        }
        System.out.println("Do you want to continue? Y(yes) or N(no)");
        String YoN = in.next();
        if(YoN.equals("Y") == true) {
            cont = true;
        }
        else {
            cont = false;
        }
    }
     public static void angCalc(Scanner in) {
        //CASSIE'S CODE - slightly edited to fit in this code smoothly.
        System.out.println("Which problem do you want to solve: " + "\n" + "1. Angular speed" + "\n" + "2. Angle of movement");
        int equation = in.nextInt();
        if(equation == 1){
            System.out.println("What is the initial angular velocity: ");
            Double avi = in.nextDouble();
            System.out.println("What is the angular acceleration: ");
            Double a = in.nextDouble();
            System.out.println("What is the time(in sec): ");
            Double t = in.nextDouble();
            Double w = avi + (a*t);
            System.out.println("The angular speed is: " + w + " rad/s");
        }
        if(equation == 2){
            System.out.println("What is the angular displacement: ");
            Double Oo = in.nextDouble();
            System.out.println("What is the angular velocity: ");
            Double wo = in.nextDouble();
            System.out.println("What is the angular acceleration: ");
            Double a = in.nextDouble();
            System.out.println("What is the time: ");
            Double t = in.nextDouble();
            Double O = Oo + (wo*t) + (.5*a*(Math.pow(t,2)));
            System.out.println("The angle of displacement is " + O + " rad");
        }    
        System.out.println("Do you want to continue? Y(yes) or N(no)");
        String YoN = in.next();
        if(YoN.equals("Y") == true) {
            cont = true;
        }
        else {
            cont = false;
        }
    }
    public static void fluidCalc (Scanner in) {
        //DYLAN'S CODE
        System.out.println("Which problem do you want to solve: " + "\n" + "1. Absolute fluid pressure" + "\n" + "2. Bernoulii's equation");
        int inDecide = in.nextInt();

        if(inDecide == 1) {
            System.out.print("Enter the atmospheric pressure: ");
            int atmospherePressure = in.nextInt();

            System.out.print("Enter the density of the fluid: ");
            int density = in.nextInt();

            System.out.print("Enter the depth: ");
            int depth = in.nextInt();

            double absolutePressure = (atmospherePressure + (density * 9.8 * depth));
            System.out.println("The absolute fluid pressure of your equasion is: " + absolutePressure + "KPA");
        }
        if(inDecide == 2) {
            System.out.print("Enter the pressure at point 2: ");
            int P2 = in.nextInt();

            System.out.print("Enter the density: ");
            int density = in.nextInt();

            System.out.print("Enter the velocity at point 1: ");
            int v1 = in.nextInt();

            System.out.print("Enter the velocity at point 2: ");
            int v2 = in.nextInt();

            System.out.print("Enter the height at point 1: ");
            int h1 = in.nextInt();

            System.out.print("Enter the height at point 2: ");
            int h2 = in.nextInt();

            double P1 = (P2 + (density * ( 9.8 *(h2 - h1))) + density * (((Math.pow(v2, 2) - Math.pow(v1, 2))) / 2 ));
            System.out.println("The value of P1 is: " + P1 + "PA");
        }
        System.out.println("Do you want to continue? Y(yes) or N(no)");
        String YoN = in.next();
        if(YoN.equals("Y") == true) {
            cont = true;
        }
        else {
            cont = false;
        }
    }

    public static void tabler(Scanner in) {
        //TODO: Complete tabler
    }
}