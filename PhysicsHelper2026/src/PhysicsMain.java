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
        System.out.println("Choose a calculator: \n\t[S]peed\n\t[D]istance\n\t[T]ime");
        char choice = in.next().toLowerCase().charAt(0);
        System.out.println();
        switch(choice) {
            case 's': speed(in); break;
            case 'd': distance(in); break;
            case 't': time(in); break;
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

        public static void bernoulli(Scanner in){
         System.out.print("Enter the pressure at point 2: ");
        double p2 = in.nextDouble();
        System.out.print("Enter the density of the fluid: ");
        double density = in.nextDouble();
        System.out.print("Enter the velocity of the fluid at point 1: ");
        double v1 = in.nextDouble();
        System.out.print("Enter the velocity of the fluid at point 2: ");
        double v2 = in.nextDouble();
        System.out.print("Enter the height of the fluid at point 1: ");
        double h1 = in.nextDouble();
        System.out.print("Enter the height of the fluid at point 2: ");
        double h2 = in.nextDouble();

        double Bernoulli = p2 + (density * 9.8 * h2) + (.5 * (density * (v2 * v2))) - (density * 9.8 * h1) - (0.5 * (density * (v1 * v1)));
        System.out.println("The value for the pressure at point 1 is " + Bernoulli + " pa");

    }

    public static void absolutefluid(Scanner in){
        System.out.print("Enter the initial pressure: ");
        double ip = in.nextDouble();
        System.out.print("Enter the density of the fluid: ");
        double df = in.nextDouble();
        System.out.print("Enter the height of the fluid collumn: ");
        double fh = in.nextDouble();

        double AbsoluteFluid = ip + (df * 9.8 * fh);
        System.out.println("The absolute fluid pressure is " + AbsoluteFluid + " pa");
    }
    
    
    public static void AngularMotion(Scanner in){ 
        else if (num == 4) {//Angular Motion
        System.out.print("Enter a letter for what you want to solve: \n" +
            "a. Angular Speed \n" + "b. Angle of Movement \n");
        char angle = in.next().charAt(0);
        //Angular Speed
        if (angle == 'a'){
            System.out.print("Enter initial angular velocity: ");
            double InitAVelo = in.nextDouble();
            System.out.print("Enter angular acceleration: ");
            double AngVelo = in.nextDouble();
            System.out.print("Enter the time elapsed: ");
            double Time = in.nextDouble(); 

            //calculation
            double AngularSpeed = (InitAVelo + (AngVelo * Time));
            System.out.println("The angular speed is " + AngularSpeed + " radians per second.");
        }

        //Angle of Movement 
        if (angle == 'b'){
            System.out.print("Enter initial angular position: ");
            double IAP = in.nextDouble();
            System.out.print("Enter initial angular velocity: ");
            double IAV = in.nextDouble();
            System.out.print("Enter the constant rate of angular acceleration: ");
            double CRAA = in.nextDouble(); 
            System.out.print("Enter the time elapsed: ");
            double Time = in.nextDouble();

            //calculation
            double AofM = (IAP + (IAV*Time) + (1/2 * CRAA * (Time * Time)));
            System.out.println("The angle of movement is " + AofM + " degrees.");}

else {System.out.println("Not an option");}

}
    }

    public static void tabler(Scanner in) {
        //TODO: Complete tabler
    }
}
