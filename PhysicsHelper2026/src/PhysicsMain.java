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
            case 't': angularChoice(in); break;
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
                    System.out.println("Your Angle of Movement is " +Amovement);}
                    
    }

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
}
