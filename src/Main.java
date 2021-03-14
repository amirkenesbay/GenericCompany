import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> managerGoodList = new ArrayList<>();
        HashMap<Integer, String> consultantCustomerList = new HashMap<>();
        DirAction<String, Director> directorDirAction = new DirAction<>("Alizhan", new Director());
        System.out.println("Current name of director: " + directorDirAction.getKey());
        System.out.println("If you want to change the name of director please type below your own name: ");
        directorDirAction.setKey(scanner.nextLine());
        System.out.println("Renamed director name: " + directorDirAction.getKey());
        System.out.println("And now you can choose one of the worker \nType 1 to choose Manager \nType 2 to choose Consultant");
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    directorDirAction.setObj(new Manager());
                    System.out.println("Please type the name of Manager:");
                    directorDirAction.setKey(scanner.next());
                    System.out.println("Manager: " + directorDirAction.getKey());
                    System.out.println("As manager you can add or remove goods from data. \nPlease add data: ");
                    String input = scanner.next();
                    managerGoodList.add(input);
                    System.out.println(managerGoodList);

                    while (true) {
                        System.out.println("Type 1 to add one more good or type 2 to remove existing good or type 0 to exit");
                        int choiceList = scanner.nextInt();
                        if (choiceList == 1) {
                            System.out.println("Please type the good below: ");
                            managerGoodList.add(scanner.next());
                            System.out.println(managerGoodList);
                        } else if (choiceList == 2) {
                            System.out.println("Please select the index of good:");
                            managerGoodList.remove(scanner.nextInt());
                            System.out.println(managerGoodList);
                        } else if (choiceList == 0) {
                            break;
                        } else {
                            System.out.println("Type the correct number");
                        }
                    }

                case 2:
                    directorDirAction.setObj(new Consultant());
                    System.out.println("Please type the name of Consultant:");
                    directorDirAction.setKey(scanner.next());
                    System.out.println("Consultant: " + directorDirAction.getKey());
                    System.out.println("As consultant you can add number and name of the customer. " +
                            "\nPlease add telephone number and name of the customer: ");
                    Integer key = scanner.nextInt();
                    String value = scanner.next();
                    consultantCustomerList.put(key, value);
                    System.out.println(consultantCustomerList);

                    while (true) {
                        System.out.println("Type 1 to add one more information or type 2 to remove existing information or type 0 to exit");
                        int choiceList = scanner.nextInt();
                        if (choiceList == 1) {
                            System.out.println("Please type the information below: ");
                            consultantCustomerList.put(scanner.nextInt(), scanner.next());
                            System.out.println(consultantCustomerList);
                        } else if (choiceList == 2) {
                            System.out.println("Please select the number:");
                            consultantCustomerList.remove(scanner.nextInt());
                            System.out.println(consultantCustomerList);
                        } else if (choiceList == 0) {
                            break;
                        } else {
                            System.out.println("Type the correct number");
                        }
                    }
                case 0:
                    break;
                default:
                    System.out.println("Please type only 1 or 2");
            }
            break;
        }
    }
}
