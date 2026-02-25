package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a Map<String, List<Integer>> grades.
    - Key = student name
    - Value = list of grades
 2. Add at least 3 students with multiple grades each.
 3. Print all students with their grades.
 4. Calculate and print the average grade for each student.
*/
public class Exercise4 {
    public static void main(String[] args) {
        Map<String, List<Integer>> myMap = new HashMap();
        myMap.put("Preeti", new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8)) );
        myMap.put("Jonathan", new ArrayList<>(Arrays.asList(4,5,6)) );
        myMap.put("Julie", new ArrayList<>(Arrays.asList(7,8,9)) );
        System.out.println(myMap);


        for (Map.Entry<String, List<Integer>> entry : myMap.entrySet()) {
            double total = 0;
            for (Integer points : entry.getValue()) {
                total += points;
            }
            System.out.println(entry.getKey() + "'s average is: " + total/entry.getValue().size());
        }



        myMap.forEach((name, grades) -> {
            double sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            System.out.println(name + "'s average is: " + (sum / grades.size()));
        });

        List<Integer> myListOf = List.of(7, 8, 9);
        myListOf.add(1);

        List<Integer> myArraysAsList = Arrays.asList(7, 8, 9);
        myArraysAsList.add(1);

    }
}
