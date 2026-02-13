import java.util.Scanner;

public class PhysicsMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char choice = 'y';
        while(choice == 'y'){
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
        System.out.println("Enter which type of calculation to perform:\n1) Position\n2) Velocity\n3) Acceleration\n4) Fluid pressure \n5) Angular motion \n6) Projectile motion");
        int choice = in.nextInt();
        System.out.println();
        switch(choice) {
            case 1: Position(in); break;
            case 2: Velocity(in); break;
            case 3: Acceleration(in); break;
            case 4: FluidPressure(in); break;
            case 5: AngularMotion(in); break;
            case 6: ProjectileMotion(in); break;
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
    public static void tabler(Scanner in) {
        //TODO: Complete tabler
    }
}
