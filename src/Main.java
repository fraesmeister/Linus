import java.util.*;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Fruits> fruits = new ArrayList<Fruits>();


        int i = 1;
        while (true) {
            Fruits fruit = new Fruits();
            System.out.println("Enter fruit no. " + i + " name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            fruit.setName(name);
            System.out.println("Enter fruit no. " + i + " price: ");
            Integer price = scanner.nextInt();
            fruit.setPrice(price);
            fruits.add(fruit);
            scanner.nextLine();
            i++;
        }

//        fruits.sort(new Comparator<Fruits>() {
//            @Override
//            public int compare(Fruits f1, Fruits f2) {
//                return f1.getPrice() - f2.getPrice();
//            }
//        });
        fruits.sort(Comparator.comparingInt(Fruits::getPrice)); // same as commented lines above (tips from IntelliJm)

        Fruits cheap = fruits.get(0);
        Fruits expensive = fruits.get(fruits.size() - 1);
        System.out.println("Cheapest fruit:\t" + cheap.getName() + " (" + cheap.getPrice() + ")");
        System.out.println("Most expensive fruit:\t" + expensive.getName() + " (" + expensive.getPrice() + ")");
    }
}
