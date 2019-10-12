import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Fruits> fruitList = new ArrayList<>();
        System.out.println("how many fruits do you want to add?");
        int numberOfFruits = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfFruits; i++) {
            fruitList.add(fruitInput(scanner, i+1));
        }
        printResults(fruitList);
    }

    private static void printResults(ArrayList<Fruits> fruitList) {
        Collections.sort(fruitList);
        System.out.println(fruitList);
        System.out.println("The cheapest item is " + fruitList.get(0).getName() + " which costs " + fruitList.get(0).getPrice());
        System.out.println("The most expensive item is " + fruitList.get(fruitList.size() - 1).getName() + " which costs " + fruitList.get(fruitList.size() - 1).getPrice());
    }

    private static Fruits fruitInput(Scanner scanner, int i) {
        System.out.println("Enter fruit no. " + i + " name: ");
        String name = scanner.nextLine();
        System.out.println("Enter fruit no. " + i + " price: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        return new Fruits(name, price);
    }
}
