package mapExample;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        // Creating LinkedHashMap of even numbers
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        evenNumbers.put("Six", 6);
        System.out.println("Original LinkedHashMap: " + evenNumbers);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Eight", 8);
        System.out.println("Updated LinkedHashMap(): " + evenNumbers);

        // Using get()
        int value1 = evenNumbers.get("Two");
        System.out.println("Returned Number: " + value1);

        // Using getOrDefault()
        int value2 = evenNumbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + evenNumbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + evenNumbers.keySet());

        // Using values()
        System.out.println("Values: " + evenNumbers.values());

        // remove method with single parameter
        int value = evenNumbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = evenNumbers.remove("Four", 4);
        System.out.println("Is the entry Three removed? " + result);

        System.out.println("Updated LinkedHashMap: " + evenNumbers);

    }

}
