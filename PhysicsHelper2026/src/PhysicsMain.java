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
        System.out.println("Enter a number to select the equation to solve:\n" + 
                    "1. Speed \n" +
                    "2. Distance \n" + 
                    "3. Time \n" + 
                    "4. Position \n" +
                    "5. Velocity \n" + 
                    "6. Acceleration \n" + 
                    "7. Projectile Motion in the x-direction \n" +
                    "8. Projectile Motion in the y-direction \n");

         int num = in.nextInt();
        System.out.println();
        switch(num) {
            case 1:speed(in); break;
            case 2:distance(in); break;
            case 3:time(in); break;
            case 4:position(in); break;
            case 5:velocity (in); break;
            case 6:acceleration (in); break;
            case 7:projx(in); break;
            case 8:projy(in); break;
            case 9:bernoulli(in); break;
            case 10:absolutefluid(in); break;
            case 11:AngularMotion(in); break;
            default: System.out.println("Function not recognized.  Returning to menu."); break; }}

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

        public static void position(Scanner in){
        System.out.print("Enter initial posiiton: ");
            double x0 = in.nextDouble();
        System.out.print("Enter initial velocity: ");
            double v0 = in.nextDouble();
        System.out.print("Enter time: ");
            double t = in.nextDouble();
        System.out.print("Enter acceleration: ");
            double a = in.nextDouble();
        
        double position = x0 + (v0 * t) + (0.5)*(a)*(t*t);
        System.out.println("The current position is " + position + " meters \n");
    }

        public static void velocity(Scanner in){
                System.out.print("Enter starting position: ");
            double sx = in.nextDouble();
        System.out.print("Enter final position: ");
            double fx = in.nextDouble();
        System.out.print("Enter starting time: ");
            double st = in.nextDouble();
        System.out.print("Enter final time: ");
            double ft = in.nextDouble(); 
        
        double velocity = (fx-sx)/(ft-st);
        System.out.println("The current velocity is " + velocity + " m/s \n");
    }

        public static void acceleration(Scanner in){
            System.out.print("Enter starting velocity: ");
            double sv = in.nextDouble();
        System.out.print("Enter final velocity: ");
            double fv = in.nextDouble();
        System.out.print("Enter starting time: ");
            double st = in.nextDouble();
        System.out.print("Enter final time: ");
            double ft = in.nextDouble(); 
        
        double acceleration = (fv-sv)/(ft-st);
        System.out.println("The current acceleration is " + acceleration + " m/s\u00B2 \n");
    }

        public static void projx(Scanner in){
            System.out.print("Enter initial x position: ");
            double spx = in.nextDouble();
        System.out.print("Enter initial velocity in the x direction: ");
            double svx = in.nextDouble();
        System.out.print("Enter time: ");
            double t = in.nextDouble();
      
        
        double projx = (spx +(svx*t));
        System.out.println("The distance traveled in the x direction is " + projx + " meters \n");
    }

        public static void projy(Scanner in){
            System.out.print("Enter initial y position: ");
            double spy = in.nextDouble();
        System.out.print("Enter initial velocity in the y direction: ");
            double svy = in.nextDouble();
        System.out.print("Enter time: ");
            double t = in.nextDouble();
      
        
        double projy = (spy + (svy*t)-((0.5)*(-9.8)*(t*t)));
        System.out.println("The distance traveled in the y direction is " + projy + " meters \n");
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
        //Angular Motion
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
            System.out.println("The angle of movement is " + AofM + " degrees.");}}
    

    
    
public static void tabler(Scanner in) {
System.out.print("What table would you like to create?: \n" +
    "1. Velocity Table \n" + 
    "2. X and Y Projectile Table \n" +
    "3. Angle of Movement Table \n" +
    "4. Air Pressure Table \n");
int table = in.nextInt();

switch(table){
case 1: VeloTable(in); break;
case 2: ProjMotionTable(in); break;
case 3: 
case 4: AirPressTable(in); break;
}//switch
    }

    public static void VeloTable(Scanner in){
System.out.print("Enter how many seconds you'd like to simulate: ");
int seconds = in.nextInt();
System.out.print("Enter initial acceleration in m/s^2: ");
int InitAccel = in.nextInt();
System.out.print("Enter initial velocity in m/s: ");
int InitVelo = in.nextInt();
System.out.print("Enter initial position in m: ");
int InitPos = in.nextInt();

int CurVelo = InitVelo;

System.out.print("t(s)\t|v(m/s) | x(m) \n" + 
                 "--------+-------+------\n");
for (int i = 0; i <= seconds; i++){
    //for (int j = 0; j <= seconds; j++){
    CurVelo = (CurVelo + (InitAccel * i));
        System.out.print(i + "\t|" + (InitVelo + (InitAccel * i)) + "\t|" + 
        (InitPos + CurVelo)); 
        
    //}//inner
    System.out.println();
}//outer
}

    public static void AirPressTable(Scanner in){

    double GravAccel = 9.80665;//gravitational acceleration
    double PressAtSL = 101.325;//pressure at sea level
    double MMDA = 0;//mean molar mass of dry air at sea level
    double UHeight = 0;//user desired height
    double SeaLevel = 0;//height of reference level?
    double R = 8.31446;//gas constant
    double RefTemp = 0;//user entered temperature?

}

    public static void ProjMotionTable(Scanner in){
    System.out.print("Enter initial x position: ");
     double spx = in.nextDouble();
    System.out.print("Enter initial velocity in the x direction: ");
     double svx = in.nextDouble();

    System.out.print("Enter initial y position: ");
            double spy = in.nextDouble();
    System.out.print("Enter initial velocity in the y direction: ");
            double svy = in.nextDouble();

    System.out.print("Enter time: ");
            double t = in.nextDouble();
      
        
System.out.println();

System.out.print("  t(s)\t|posit x|posit y \n" + 
                 "--------+-------+------\n");
for (int i = 0; i <= t; i++){
        
        double projx = (spx +(svx*i));
        double projy = (spy + (svy*i)-((0.5)*(-9.8)*(i*i)));

    System.out.print(i + "\t|" + projx + "\t|" + 
        projy); 
    System.out.println();
}
System.out.println();
}}//main
