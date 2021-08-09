import java.io.ObjectInput;
import java.util.*;

public class Main {


    public static void main(String[] args) {

//      Create some people with data
        Buyer person1 = new Buyer("Adam Brown", "June", "2021", "097 111 22 33", 100, 100,"Active buyers");
        Buyer person2 = new Buyer("Robert C. Martin", "August", "2021", "097 111 33 22", 100, 350,"Active buyers");
        Buyer person3 = new Buyer("Adam Brown", "August", "2021", "097 111 22 33", 100, 300,"Active buyers");
        Buyer person4 = new Buyer("Alex Fox", "August", "2021", "050 111 22 33", 500, 0,"Active buyers");
        Buyer person5 = new Buyer("Bill Gates", "July", "2021", "097 777 77 77", 0, 1000,"Inactive buyers");

        //  add all data to Map
        TreeMap<String, Buyer> state = new TreeMap<String, Buyer>();

        state.put("1", person1);
        state.put("2", person2);
        state.put("3", person3);
        state.put("4", person4);
        state.put("5", person5);

        //  add Scaner to reading input
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("exit")) {
                break;
            }
            // Parsing input data

            String[] parts = s.split(" ");

            if (parts.length != 2) {
                System.out.println("Для коректної роботи, надайте, будь ласка, період у форматі - June 2021 (July 2021, August 2021");
                return ;
            }
            String month = parts[0];
            String year = parts[1];

            Set keys = state.keySet();

            System.out.println("Active buyers:");
            for (Buyer t : state.values()) {
                if (t.getMonth().equals(month) && t.getActiveFlg() == "Active buyers") {
                    System.out.println(t.getMonth());
                    System.out.println(t.getFullName() + "(" + t.getPhone() + "):$ " + (t.getCardCosts() + t.getCashCosts()) + "(cash: $" + t.getCashCosts() + " card: $" + t.getCardCosts() + " )");
                }
            }
                System.out.println("Inactive buyers:");
                for (Buyer t : state.values()) {
                    if (t.getMonth().equals(month) && t.getActiveFlg() == "Inactive buyers") {
                        System.out.println(t.getMonth());
                        System.out.println(t.getFullName() + "(" + t.getPhone() + "):$ " + (t.getCardCosts() + t.getCashCosts()) + "(cash: $" + t.getCashCosts() + " card: $" + t.getCardCosts() + " )");
                    }

                }
            }

        }
    }
