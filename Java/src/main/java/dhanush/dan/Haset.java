package dhanush.dan;



        import java.util.*;

/**
 *
 * @author Tanner
 */
public class Haset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable Declarations
        String place;
        String[] roommates = new String[20];
        String[] bills = new String[20];
        int amount[] = new int[20];
        float numRoom = 0;
        int numBills = 0;
        int i = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Roommate Bill Splitter!\n");

      /*  //Get Residence Name from User
        System.out.print("Please Enter Name of Place or Address:  ");
        place = input.nextLine();*/

        //Get # of Roommates at Residence
        System.out.print("How Many Total People Reside at  :  ");
        numRoom = input.nextFloat();

        //Get Names of Roommates
        for (i = 0; i <= numRoom; i++) {
            roommates[i] = input.nextLine();
            System.out.print("What is Person Number " + (i) + "'s Name:  ");
            System.out.print("Enter the expenses");
            int a = input.nextInt();
            float d = (a/numRoom);
            System.out.println();
            System.out.println("The division of a and b is:" +d);

        }

    }

}