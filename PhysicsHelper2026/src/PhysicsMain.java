import java.util.Scanner;

public class PhysicsMain {
    public static boolean cont = true;

    public static void speed(Scanner in){
        System.out.print("Enter a value for distance in meters (m): ");
        double dist = in.nextDouble();
        System.out.print("Enter a value for time in seconds (s): ");
        double time = in.nextDouble();
        double speed = dist / time;
        System.out.println("The speed of the object is " + speed + " m/s.\n");
        System.out.println("Do you want to continue? Y(yes) or N(no)");
        String YoN = in.next();
        if(YoN.equals("Y") == true) {
            cont = true;
        }
        else {
            cont = false;
            in.close();
        }
    }
    public static void distance(Scanner in) {
        System.out.print("Enter a value for speed in meters per second (m/s): ");
        double speed = in.nextDouble();
        System.out.print("Enter a value for time in seconds (s): ");
        double time = in.nextDouble();
        double dist = speed * time;
        System.out.println("The distance that the object has traveled is " + dist + " m.\n");
        System.out.println("Do you want to continue? Y(yes) or N(no)");
        String YoN = in.next();
        if(YoN.equals("Y") == true) {
            cont = true;
        }
        else {
            cont = false;
            in.close();
        }
    }
    public static void time(Scanner in){
        System.out.print("Enter a value for distance in meters (m): ");
        double dist = in.nextDouble();
        System.out.print("Enter a value for speed in meters per second (m/s): ");
        double speed = in.nextDouble();
        double time = dist / speed;
        System.out.println("The time during which the object has traveled is " + time + " s.\n");
        System.out.println("Do you want to continue? Y(yes) or N(no)");
        String YoN = in.next();
        if(YoN.equals("Y") == true) {
            cont = true;
        }
        else {
            cont = false;
            in.close();
        
        }
    }
    public static void posCalc(Scanner in) {
        in = new Scanner(System.in);
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
            in.close();
        }
    }
    public static void velCalc(Scanner in) {
        in = new Scanner(System.in);
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
            in.close();
        }
    }
    public static void accelCalc(Scanner in) {
        in = new Scanner(System.in);
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
            in.close();
        }
    }
    public static void projCalc(Scanner in) {
        //CRIS'S CODE - slightly edited to fit in this code smoothly.
        in = new Scanner(System.in);
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
            in.close();
        }
    }
    public static void angCalc(Scanner in) {
        //CASSIE'S CODE - slightly edited to fit in this code smoothly.
        in = new Scanner(System.in);
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
            in.close();
        }
    }
    public static void fluidCalc(Scanner in) {
        //DYLAN'S CODE
        in = new Scanner(System.in);
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

            System.out.println("Do you want to continue? Y(yes) or N(no)");
            String YoN = in.next();
            if(YoN.equals("Y") == true) {
                cont = true;
            }
            else {
                cont = false;
                in.close();
            }
        }
    }
    public static void calc(Scanner in) {
        in = new Scanner(System.in);
        while(cont == true) {
        
            System.out.println("What calculator do you want to use? - Input number, not name." + "\n" + "1. Speed Calculator" + "\n" + "2. Distance Calculator" + "\n" + "3. Time Calculator" + "\n" + "4. Position Calculator" + "\n" + "5. Velocity Calculator" + "\n" + "6. Acceleration Calculator" + "\n" + "7. Projectile Calculator" + "\n" + "8. Angular Calculator" + "\n" + "9. Fluid Calculator");
            int numInputInt = in.nextInt();

            switch(numInputInt) {
                case 1: speed(in); break;
                case 2: distance(in); break;
                case 3: time(in); break;
                case 4: posCalc(in); break;
                case 5: velCalc(in); break;
                case 6: accelCalc(in); break;
                case 7: projCalc(in); break;
                case 8: angCalc(in); break;
                case 9: fluidCalc(in); break;
                default: System.out.println("Your entered value is not recongized, please try again"); continue;
            }
        }
    }
    public static void tabler(Scanner in) {
        in = new Scanner(System.in);

        boolean errorLoop = true;
        while(errorLoop == true) {

        System.out.println("\nWhich table do you want to generate?");
        System.out.println("1. Velocity & Position Table");
        System.out.println("2. Projectile X & Y Position Table");
        System.out.println("3. Angle of Movement Table");
        System.out.println("4. Air Pressure vs Elevation Table");

        int choice = in.nextInt();
        switch(choice) {
            case 1:velAndPosTable(in); break; 
            case 2:projAndPosTable(in); break;
            case 3:angleTable(in); break;
            case 4:airPressureTable(in); break;
            default: System.out.println("This value is not valid, enter another value"); continue;
        }
    }
}

    public static void velAndPosTable(Scanner in) {
        System.out.print("Enter a number of seconds to simulate: ");
        int time = in.nextInt();

        System.out.print("Enter initial acceleration in m/s^2: ");
        double a = in.nextDouble();

        System.out.print("Enter initial velocity in m/s: ");
        double v0 = in.nextDouble();

        System.out.print("Enter initial position in m: ");
        double x0 = in.nextDouble();

        System.out.println();
        System.out.println("t(s)|v(m/s) |x(m)");
        System.out.println("----+-------+----");

        double currentV = v0;
        double currentX = x0;

        for (int t = 0; t <= time; t++) {

            System.out.println(
              t + "   |" +
            (int)currentV + "      |" +
            (int)currentX
        );
    // update for next second
            currentV = currentV + a;
            currentX = currentX + currentV;
        }   
    }
    public static void projAndPosTable(Scanner in) {
        System.out.print("Enter total time (seconds): ");
        int time = in.nextInt();

        System.out.print("Enter initial X position: ");
        double x0 = in.nextDouble();

        System.out.print("Enter initial Y position: ");
        double y0 = in.nextDouble();

        System.out.print("Enter initial X velocity: ");
        double vx = in.nextDouble();

        System.out.print("Enter initial Y velocity: ");
        double vy = in.nextDouble();

        System.out.print("Enter gravity acceleration (usually 9.8): ");
        double g = in.nextDouble();

        System.out.println("\nt(s) | x(m) | y(m)");
        System.out.println("-----+------+------");

        for (int t = 0; t <= time; t++) {
            double x = x0 + vx * t;
            double y = y0 + vy * t - 0.5 * g * t * t;

            System.out.printf("%4d | %6.2f | %6.2f\n", t, x, y);
        }
    }
    public static void angleTable(Scanner in) {
        System.out.println("Enter a number of seconds to simulate: ");
        double time = in.nextDouble();
        System.out.println("What is the angular displacement: ");
        Double Oo = in.nextDouble();
        System.out.println("What is the angular velocity: ");
        Double wo = in.nextDouble();
        System.out.println("What is the angular acceleration: ");
        Double a = in.nextDouble();
        System.out.println("T(s)|A(rad/s^2)|W(rad/s)|O(rad)");
        for (int j = 0; j <= time; j++) {
            double newVelocity = wo + (a * j);
            double newPosition = Oo + (wo*j) + (.5*a*(Math.pow(j,2)));
            System.out.println(j + "   | " + a + "     | " + newVelocity + "    | " + newPosition);
        }  
        System.out.println("Do you want to continue? Y(yes) or N(no)");
            String YoN = in.next();
            if(YoN.equals("Y") == true) {
                cont = true;
            }
            else {
                cont = false;
                in.close();
            }
    }
    public static void airPressureTable(Scanner in) {
        System.out.println("Enter the altitude(in meters): ");
        int height = in.nextInt();

        System.out.println("Enter absolute temp(in Kelvins): ");
        int temp = in.nextInt();

        System.out.println("Enter the refernce air pressure(if you want sea level, enter 0): ");
        int P0 = in.nextInt();

        if(P0 == 0){
            P0 = 101325;
        }

        int iterations = height/1000;

        System.out.println("   altitude   |   Air Pressure    ");
        System.out.println("-------------------------------");
        System.out.println("   0m    |   101235Pa      ");

        for(int i = 1; i <= iterations; i++) {
            double x = (- ((0.02896 * 9.81) * (i*1000)) / (8.314 * temp));
            double total = P0 * Math.exp(x);
            System.out.println("   " + (i*1000) + "m    |   " + total + "Pa         ");
        }

        double x = (- ((0.02896 * 9.81) * height) / (8.314 * temp));
        double total = P0 * Math.exp(x);
        System.out.println("   " + height + "m    |   " + total + "Pa         ");
    
    
    System.out.println("Do you want to continue? Y(yes) or N(no)");
        String YoN = in.next();
        if(YoN.equals("Y") == true) {
            cont = true;
        }
        else {
            cont = false;
            in.close();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(cont == true){
            System.out.println("Choose a function: \n\t[C]alculators\n\t[T]able Generator");
            char choice = in.next().toLowerCase().charAt(0);
            System.out.println();
            switch(choice) {
                case 'c': calc(in); break;
                case 't': tabler(in); break;
                //TODO: Add cases for other functionalities
                default: System.out.println("Function not recognized."); continue;
            }
        }
        in.close();
}
}