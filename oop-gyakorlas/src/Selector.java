import java.util.Scanner;

public class Selector {
    Tester test = new Tester();
    Scanner scanner = new Scanner(System.in);

    public void MainMenu (){
        test.registerBasicItems();
        Integer option;
        do{
            System.out.println("What would you like to do? \n");
            System.out.println("1.: List all boxes");
            System.out.println("2.: List specific items sorted");
            System.out.println("3.: Sort box list in order by box's ID");
            System.out.println("4.: Register new boxes");
            System.out.println("5.: Search");
            System.out.println("6.: Quit");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    test.listAllItems();
                    break;
                case 2:
                    sortingItemsByField();
                    break;
                case 3:
                    test.sortBoxesByID();
                    test.listAllItems();
                    break;
                case 4:
                    manualRegister();
                    break;
                case 5:
                    searchItems();
                    break;
                case 6:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("There's no such option. Choose another one");
            }
        }while(option != 6);
    }

    public void sortingItemsByField(){
        int option;
        System.out.println("What type of items would you like to sort?");
        System.out.println("1: Pencils\n2: Notepads\n3: Gloves\n4: Masks\n5: Back to main menu");
        do {
            option = Integer.parseInt(scanner.nextLine());
            if(option == 5) return;
        }while(test.sortItemsByField(option));
    }

    public void manualRegister(){
        int option;
        String again;
        do {
            System.out.println("What type of items would you like to put in a box?");
            System.out.println("1: Pencils\n2: Notepads\n3: Gloves\n4: Masks\n5: Back to main menu");
            do {
                option = Integer.parseInt(scanner.nextLine());
                if (option == 5) return;
            } while (test.manuallyRegisterItems(option)); //!!!!!!!
            System.out.println("Would you like to register another one?(y/n)");
            again = scanner.nextLine();
        }while(again.equals("y"));
    }

    public void searchItems(){
        int option;
        System.out.println("What type of items would you like to search for?");
        System.out.println("1: Pencils\n2: Notepads\n3: Gloves\n4: Masks\n5: Back to main menu");
        do {
            option = Integer.parseInt(scanner.nextLine());
            if(option == 5) return;
        }while(test.searchForItems(option));
    }

}
