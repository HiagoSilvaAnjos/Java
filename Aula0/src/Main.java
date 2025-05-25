package Aula0.src;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        byte myByte = 1;

        System.out.println(myByte);

        int[] collection = {1, 2, 3, 4, 5};

        for (int j : collection) {
            System.out.println(j);
        }

        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("John");
        namesList.add("Jane");
        namesList.add("Doe");
        namesList.add("Smith");
        namesList.add("Alice");

        System.out.println("Names List:");
        System.out.println(namesList);

        for (String name : namesList) {
            System.out.println(name);
        }

        // Casting

        String str = "10";
        int number = Integer.parseInt(str);
        System.out.println("String to int: " + number);

        String srt2 = String.valueOf(number);
        System.out.println("int to String: " + srt2);

    }
}