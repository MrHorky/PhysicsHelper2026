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
            case 'p': projectilemotion(in); break;
            //case 't': angularChoice(in); break;
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

    public static void angularChoice(Scanner in){
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
                            System.out.println("You chose Angule of Movement (ÃŽÂ¸ = ÃŽÂ¸0 + Ã¢ Âµ0t + (Ã‚Â½)ÃŽÂ±t^2) ");
                        System.out.println("Enter inital Angle (ÃŽÂ¸0): ");
                        double Iangle = in.nextDouble();

                        System.out.println("Enter inital Angular Speed (Ã¢ Âµ0)");
                        double Aspeed = in.nextDouble();

                        System.out.println("Enter change in time (t): ");
                        double time = in.nextDouble();
    
                        System.out.println("Enter inital Angular Accerleration (ÃŽÂ±):");
                        double  aA = in.nextDouble();

                        double Amovement = Iangle + (Aspeed*time) + (.5*aA*time*time) ;
                    System.out.println("Your Angle of Movement is " +Amovement);}
                    
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
    }
}
