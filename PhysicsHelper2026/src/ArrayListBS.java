import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBS {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> printList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        in.useDelimiter(",");
        System.out.print("Please enter a list  of numbers: ");
        while(in.hasNextInt()) {
            numList.add(in.nextInt());
        }

        for(int i = 0; i <= numList.size() - 1;i++) {
            if(numList.get(i) % 2 == 0) {
                printList.add(numList.get(i));
            }
            else {
                continue;
            }
        }
        System.out.println("These numbers are even: " + printList);
    }
}