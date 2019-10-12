import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> fruitPrices = new HashMap<String, Integer>();


        int i = 1;
        boolean cont = true;
        while (cont == true) {
            Fruits fruit = new Fruits();
            System.out.println("Enter fruit no. " + i + " name: ");
            fruit.frtName = scanner.nextLine();
            if (fruit.frtName.equals("")) {
                break;
            }
            System.out.println("Enter fruit no. " + i + " price: ");
            fruit.frtPrice = scanner.nextInt();
            fruitPrices.put(fruit.frtName, fruit.frtPrice);
            scanner.nextLine();
            i++;
        }

        Map<String, Integer> sorted = fruitPrices
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));


        HashMap.Entry<String, Integer> entry = fruitPrices.entrySet().iterator().next();
        System.out.println(fruitPrices);
        System.out.println(sorted);
        String cheapestFruit = entry.getKey();
        int cheapestFruit1 = entry.getValue();
        System.out.println("The cheapest item is " + cheapestFruit);







    }
}
