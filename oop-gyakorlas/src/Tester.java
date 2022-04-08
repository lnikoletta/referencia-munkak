import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Tester {
    Shelf<Box> shelves = new Shelf<>();
    private Scanner scanner = new Scanner(System.in);

    public void registerBasicItems() {
        shelves.addBox(new Ceruzak(generateId(), "red", 123, 30, generateDate()));
        shelves.addBox(new Ceruzak(generateId(), "blue", 230, 18, generateDate()));
        shelves.addBox(new Ceruzak(generateId(), "red", 123, 10, generateDate()));

        shelves.addBox(new Jegyzetfuzetek(generateId(), 30, 200, 23, generateDate()));
        shelves.addBox(new Jegyzetfuzetek(generateId(), 40, 200, 80, generateDate()));
        shelves.addBox(new Jegyzetfuzetek(generateId(), 30, 500, 30, generateDate()));

        shelves.addBox(new Kesztyuk(generateId(), 5, 5, 100, generateDate()));
        shelves.addBox(new Kesztyuk(generateId(), 4, 5, 40, generateDate()));
        shelves.addBox(new Kesztyuk(generateId(), 2, 10, 200, generateDate()));

        shelves.addBox(new Maszkok(generateId(), "on your ears", 2, 1000, generateDate()));
        shelves.addBox(new Maszkok(generateId(), "face", 5, 200, generateDate()));
        shelves.addBox(new Maszkok(generateId(), "whole uniform", 10, 10, generateDate()));

    }

    public boolean manuallyRegisterItems(int opt) {
        int price, securityLevel, amount;
        String date;
        switch (opt) {
            case 1:
                System.out.print("Please enter the color of the Pencils: ");
                String color = scanner.nextLine().toLowerCase();

                System.out.print("Please enter the price of the Pencils: ");
                price = Integer.parseInt(scanner.nextLine());

                System.out.print("Please enter the stored amount: ");
                do {
                    amount = Integer.parseInt(scanner.nextLine());
                    if (amount <= 0) {
                        System.out.println("Wrong number. It has to be greater than 0.");
                    }
                } while (amount <= 0);

                System.out.print("Please enter the production date (format: yyyyMMdd): ");

                do {
                    date = scanner.nextLine();
                    if (Integer.parseInt(date) < 19000101) {
                        System.out.println("Wrong format. It has to be made at least in the last centuries .");
                    }
                } while (Integer.parseInt(date) < 19000101);

                shelves.addBox(new Ceruzak(generateId(), color, price, amount, date));
                return false;
            case 2:
                System.out.print("Please enter the pages of the Notebooks: ");
                int pages = Integer.parseInt(scanner.nextLine());

                System.out.print("Please enter the price of the Notebooks: ");
                price = Integer.parseInt(scanner.nextLine());

                System.out.print("Please enter the stored amount: ");
                do {
                    amount = Integer.parseInt(scanner.nextLine());
                    if (amount <= 0) {
                        System.out.println("Wrong number. It has to be greater than 0.");
                    }
                } while (amount <= 0);

                System.out.print("Please enter the production date (format: yyyyMMdd): ");

                do {
                    date = scanner.nextLine();
                    if (Integer.parseInt(date) < 19000101) {
                        System.out.println("Wrong format. It has to be made at least in the last centuries .");
                    }
                } while (Integer.parseInt(date) < 19000101);

                shelves.addBox(new Jegyzetfuzetek(generateId(), pages, price, amount, date));
                return false;
            case 3:
                System.out.print("Please enter the size of the Gloves: ");
                int size = Integer.parseInt(scanner.nextLine());

                System.out.print("Please enter the security level of the Gloves: ");
                securityLevel = Integer.parseInt(scanner.nextLine());

                System.out.print("Please enter the stored amount: ");
                do {
                    amount = Integer.parseInt(scanner.nextLine());
                    if (amount <= 0) {
                        System.out.println("Wrong number. It has to be greater than 0.");
                    }
                } while (amount <= 0);

                System.out.print("Please enter the production date (format: yyyyMMdd): ");

                do {
                    date = scanner.nextLine();
                    if (Integer.parseInt(date) < 19000101) {
                        System.out.println("Wrong format. It has to be made at least in the last centuries .");
                    }
                } while (Integer.parseInt(date) < 19000101);

                shelves.addBox(new Kesztyuk(generateId(), size, securityLevel, amount, date));
                return false;
            case 4:
                System.out.print("Please enter the way of wearing the Masks: ");
                String wear = scanner.nextLine().toLowerCase();

                System.out.print("Please enter the security level of the Masks: ");
                securityLevel = Integer.parseInt(scanner.nextLine());

                System.out.print("Please enter the stored amount: ");
                do {
                    amount = Integer.parseInt(scanner.nextLine());
                    if (amount <= 0) {
                        System.out.println("Wrong number. It has to be greater than 0.");
                    }
                } while (amount <= 0);

                System.out.print("Please enter the production date (format: yyyyMMdd): ");

                do {
                    date = scanner.nextLine();
                    if (Integer.parseInt(date) < 19000101) {
                        System.out.println("Wrong format. It has to be made at least in the last centuries .");
                    }
                } while (Integer.parseInt(date) < 19000101);

                shelves.addBox(new Maszkok(generateId(), wear, securityLevel, amount, date));
                return false;
            default:
                System.out.println("There's no such option. Choose another one");
                return true;

        }
    }

    public void listAllItems() {
        shelves.listItems();
    }

    public boolean sortItemsByField(int opt) {
        switch (opt) {
            case 1:
                ArrayList<Ceruzak> pencils = new ArrayList<>();
                Comparator<Ceruzak> pencilComparator = Comparator.comparing(p -> p.getPrice());
                for (int i = 0; i < shelves.getBoxCount(); i++) {
                    if (shelves.getBox(i) instanceof Ceruzak) {
                        pencils.add((Ceruzak) shelves.getBox(i));
                    }
                }
                pencils.sort(pencilComparator);

                for (int i = 0; i < pencils.size(); i++) {
                    System.out.println(pencils.get(i));
                }
                return false;
            case 2:
                ArrayList<Jegyzetfuzetek> notepads = new ArrayList<>();
                Comparator<Jegyzetfuzetek> notepadComparator = Comparator.comparing(p -> p.getPrice());
                for (int i = 0; i < shelves.getBoxCount(); i++) {
                    if (shelves.getBox(i) instanceof Jegyzetfuzetek) {
                        notepads.add((Jegyzetfuzetek) shelves.getBox(i));
                    }
                }
                notepads.sort(notepadComparator);

                for (int i = 0; i < notepads.size(); i++) {
                    System.out.println(notepads.get(i));
                }
                return false;
            case 3:
                ArrayList<Kesztyuk> gloves = new ArrayList<>();
                Comparator<Kesztyuk> glovesComparator = Comparator.comparing(p -> p.getSecurityLevel());
                for (int i = 0; i < shelves.getBoxCount(); i++) {
                    if (shelves.getBox(i) instanceof Kesztyuk) {
                        gloves.add((Kesztyuk) shelves.getBox(i));
                    }
                }
                gloves.sort(glovesComparator);

                for (int i = 0; i < gloves.size(); i++) {
                    System.out.println(gloves.get(i));
                }
                return false;
            case 4:
                ArrayList<Maszkok> masks = new ArrayList<>();
                Comparator<Maszkok> masksComparator = Comparator.comparing(p -> p.getSecurityLevel());
                for (int i = 0; i < shelves.getBoxCount(); i++) {
                    if (shelves.getBox(i) instanceof Maszkok) {
                        masks.add((Maszkok) shelves.getBox(i));
                    }
                }
                masks.sort(masksComparator);

                for (int i = 0; i < masks.size(); i++) {
                    System.out.println(masks.get(i));
                }
                return false;
            default:
                System.out.println("There's no such option. Choose another one");
                return true;
        }
    }

    private String generateDate(){
        Random rand = new Random();
        int maxYear = 2021, maxMonth = 12, maxDay = 31;
        int minYear = 1900, minMonth = 1, minDay = 1;
        Integer Date = (((rand.nextInt(maxYear - minYear + 1) + minYear)*10000) + ((rand.nextInt(maxMonth - minMonth + 1) + minMonth)*100) + (rand.nextInt(maxDay - minDay + 1) + minDay));
        return Date.toString();
    }

    private int generateId() {
        int Id = 1; //Mert lehet lett ido kozben egy ures doboz, amibe beletehetunk uj targyakat

        if (shelves.getBoxCount() >= 1) {
            for (int i = 0; i < shelves.getBoxCount(); i++) {
                if (isTaken(Id)) {
                    return Id;
                } else {
                    Id++;
                }
            }
        }
        return Id;
    }

    private boolean isTaken(int id) {
        for (int i = 0; i < shelves.getBoxCount(); i++) {
            if (((shelves.getBox(i)).getBoxID()) == id) {return false;}
        }
        return true;
    }

    public void sortBoxesByID() {
        Comparator<Box> boxesComparator = Comparator.comparing(p -> p.getBoxID());
        shelves.Sort(boxesComparator);
    }

    public boolean searchForItems(int opt) {
        System.out.println("How much would you like to take?");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("How much should they cost? / How safe are they should be?");
        Integer costORsecurity = Integer.parseInt(scanner.nextLine());
        Integer count = 0;
        ArrayList<Integer> boxIds = new ArrayList<>();
        sortByDate(); //igy a legregebbi targyat fogjuk felhasznalni
        switch (opt) {
            case 1:
                System.out.println("What is the color of the pencils you would like to take out?");
                String color = scanner.nextLine().toLowerCase();
                for (int i = 0; i < shelves.getBoxCount(); i++) {
                    if (shelves.getBox(i) instanceof Ceruzak && (((Ceruzak) shelves.getBox(i)).getColor()).equals(color) && (((Ceruzak) shelves.getBox(i)).getPrice()) == costORsecurity) {
                        boxIds.add(i);
                    }
                }
                break;
            case 2:
                System.out.println("How many pages should the notebooks have that you would like to take out?");
                Integer pages = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < shelves.getBoxCount(); i++) {
                    if (shelves.getBox(i) instanceof Jegyzetfuzetek && (((Jegyzetfuzetek) shelves.getBox(i)).getPages()) == pages && (((Jegyzetfuzetek) shelves.getBox(i)).getPrice()) == costORsecurity) {
                        boxIds.add(i);
                    }
                }
                break;
            case 3:
                System.out.println("How big should the gloves be that you would like to take out?");
                Integer size = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < shelves.getBoxCount(); i++) {
                    if (shelves.getBox(i) instanceof Kesztyuk && (((Kesztyuk) shelves.getBox(i)).getGSize()) == size && (((Kesztyuk) shelves.getBox(i)).getSecurityLevel()) == costORsecurity) {
                        boxIds.add(i);
                    }
                }
                break;
            case 4:
                System.out.println("How should be the masks worn that you would like to take out?");
                String wear = scanner.nextLine().toLowerCase();
                for (int i = 0; i < shelves.getBoxCount(); i++) {
                    if (shelves.getBox(i) instanceof Maszkok && (((Maszkok) shelves.getBox(i)).getAttachment()).equals(wear) && (((Maszkok) shelves.getBox(i)).getSecurityLevel()) == costORsecurity) {
                        boxIds.add(i);
                    }
                }
                break;
            default:
                System.out.println("There's no such option. Choose another one");
                return true;
        }
        searchForBoxes(boxIds,amount,count);
        searchForEmptyBoxes();
        sortBoxesByID(); //visszarendezem id szerinti sorrendbe
        return false;
    }

    private void searchForBoxes(ArrayList<Integer> boxIds, int amount, Integer count) {
        ArrayList<Integer> boxIds2 = new ArrayList<>();
        for (int i = 0; i < boxIds.size(); i++) {
            if ((shelves.getBox((boxIds.get(i)))).getQuantity() >= amount) {
                System.out.println("You can take these items out of this box: " + shelves.getBox((boxIds.get(i))));
                System.out.println("Would you like to? (y/n)");
                String yOrn = scanner.nextLine();
                if (yOrn.equals("y")) {
                    (shelves.getBox((boxIds.get(i)))).setQuantity(((shelves.getBox((boxIds.get(i)))).getQuantity()) - amount);
                    return;
                }
            } else {
                count += (shelves.getBox((boxIds.get(i)))).getQuantity();
                boxIds2.add(boxIds.get(i));
                if (count >= amount) {
                    System.out.println("You can take these items out of these boxes: ");
                    for (int j = 0; j < boxIds.size(); j++) {
                        System.out.println(shelves.getBox((boxIds2.get(j))));
                    }
                    System.out.println("Would you like to?  (y/n)");
                    String yOrn = scanner.nextLine();
                    if (yOrn.equals("y")) {
                        for (int j = 0; j < boxIds2.size(); j++) {
                            if (j == (boxIds2.size()) - 1) {
                                shelves.getBox((boxIds2.get(j))).setQuantity(((shelves.getBox((boxIds2.get(j)))).getQuantity()) - amount);
                                return;
                            }
                            amount -= ((shelves.getBox((boxIds2.get(j)))).getQuantity());
                            shelves.getBox((boxIds2.get(j))).setQuantity(0);
                        }
                    }
                }
            }

        }
        System.out.println("The warehouse doesn't have this many items.");
    }

    private void searchForEmptyBoxes () {
        for (int i = 0; i < shelves.getBoxCount(); i++) {
            if ((shelves.getBox(i).getQuantity()) == 0) {
                shelves.removeBox(shelves.getBox(i));
            }
        }
    }
    private void sortByDate () {
        Comparator<Box> boxesComparator = Comparator.comparing(p -> p.getProdDate());
        shelves.Sort(boxesComparator);
    }
}