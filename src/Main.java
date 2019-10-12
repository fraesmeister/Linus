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

        Fruits max = new Fruits(); // here we will store the fruit with the highest price
        Fruits min = new Fruits();
        fruitPrices.forEach((name, price) -> {
            if (max.frtPrice == null || price > max.frtPrice) {
                max.frtName = name;
                max.frtPrice = price;
            }
            if (min.frtPrice == null || price < min.frtPrice) {
                min.frtName = name;
                min.frtPrice = price;
            }
        });

        System.out.println(fruitPrices);
        System.out.println("The cheapest item is " + min.frtName +  " which costs " + min.frtPrice);
        System.out.println("The most expensive item is " + max.frtName +  " which costs " + max.frtPrice);

    }
}
