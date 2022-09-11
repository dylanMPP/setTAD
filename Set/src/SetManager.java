import java.util.ArrayList;
import java.util.Scanner;

public class SetManager {

        private static Scanner reader;
        private static SetController controller;

        public static void main(String[] args) {
            init();
            showMainMenu();
        } // main ///////////////////////////////

        public static void init() {
            controller = new SetController();
            reader = new Scanner(System.in);
        } // init ////////////////////////////////////////////////////


        public static void showMainMenu(){

            System.out.println("\n\nWELCOME TO THE SET SOFTWARE");

            boolean runFlag = true;

            while (runFlag) {

                System.out.println("\n\n——————————————————————————————\n                MENU\n\nWhat do you want to do? \n\n1) Create set. \n2) Add an element on a set. \n3) Search if an element belongs to a set. \n4) Delete an element from a set. \n5) Count the elements of a set. \n6) Join two sets. \n0) Exit.\n\n——————————————————————————————");
                int decision = reader.nextInt(); // I ask the user what he/she wants to do.

                switch (decision) {

                    case 1:
                        System.out.println("\nWhich type do you want for the set? \n1) String. \n2) Integer. \n3) Double.");
                        int decision2 = reader.nextInt();

                        if(controller.createSet(decision2)){
                            System.out.println("\nThe set has been created successfully :)");
                        } else {
                            System.out.println("\nThe set hasn't been created :(");
                        }
                        break;

                    case 2:

                        System.out.println("The available sets are: \n"+controller.toString());
                        System.out.println("\n CHOOSE ONE: ");
                        int chosenSet = reader.nextInt();

                        Set set = controller.whichSet(chosenSet-1);

                        System.out.println("\nWhich element do you want to add?");
                        String element = reader.next();

                        if(controller.addElement(set, element)!=null){
                            System.out.println("\nThe element has been added successfully :)");
                        } else {
                            System.out.println("\nThe element is already in the set, it can't be added :(");
                        }

                        break;

                    case 3:

                        System.out.println("The available sets are: \n"+controller.toString());
                        System.out.println("\n CHOOSE ONE: ");
                        int chosenSet2 = reader.nextInt();

                        Set set2 = controller.whichSet(chosenSet2-1);

                        System.out.println("\nWhich element do you want to verify in a set?");
                        String element2 = reader.next();

                        if(controller.elementBelongsSet(set2, element2)){
                            System.out.println("\nThe element BELONGS to the set :)");
                        } else {
                            System.out.println("\nThe element DOES NOT BELONGS to the set :(");
                        }

                        break;

                    case 4:

                        System.out.println("The available sets are: \n"+controller.toString());
                        System.out.println("\n CHOOSE ONE: ");
                        int chosenSet3 = reader.nextInt();

                        Set set3 = controller.whichSet(chosenSet3-1);

                        System.out.println("\nWhich element do you want to delete?");
                        String element3 = reader.next();

                        if(controller.deleteElement(set3, element3)!=null){
                            System.out.println("\nThe element has been deleted successfully :)");
                        } else {
                            System.out.println("\nThe element hasn't been deleted :(");
                        }

                        break;

                    case 5:

                        System.out.println("The available sets are: \n"+controller.toString());
                        System.out.println("\n CHOOSE ONE: ");
                        int chosenSet4 = reader.nextInt();

                        Set set4 = controller.whichSet(chosenSet4-1);

                        if(controller.countElements(set4)>-1){
                            System.out.println("\nThe amount of elements of the set are: "+controller.countElements(set4));
                        } else {
                            System.out.println("\nThe set couldn't be counted");
                        }

                        break;

                    case 6:

                        System.out.println("The available sets are: \n"+controller.toString());
                        System.out.println("\n CHOOSE ONE SET: ");
                        int chosenSet5 = reader.nextInt();

                        System.out.println("\n CHOOSE ANOTHER SET: ");
                        int chosenSet6 = reader.nextInt();

                        Set set5 = controller.whichSet(chosenSet5-1);
                        Set set6 = controller.whichSet(chosenSet6-1);

                        if(controller.joinSets(set5, set6)!=null){
                            System.out.println("\nThe sets has been joined successfully :)");
                        } else {
                            System.out.println("\nThe sets couldn't be joined");
                        }

                        break;

                    case 0:
                        System.out.println("\nThank you for using our system! Have a good one.");
                        runFlag = false;
                        break;

                    default:
                        System.out.println("\nPlease, type a valid option.\n");
                        break;
                } // switch
            } // while
        } // main menu ////////////////////////////////////////////////

} // set manager
