package collections.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO:
 * 1. Create a List<String> shoppingList.
 * 2. Add 5 items.
 * 3. Remove one item.
 * 4. Print the final list.
 */

public class Exercise1 {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Apple");
        shoppingList.add("Eggs");
        shoppingList.add("Newspaper");
        shoppingList.add("Yogurt");
        shoppingList.add("Water");
        shoppingList.remove(3);
//        shoppingList.forEach(element -> {
//            System.out.print(element + " ");
//        });
        System.out.println(shoppingList);
    }
}
