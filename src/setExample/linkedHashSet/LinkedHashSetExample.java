package setExample.linkedHashSet;

import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        /** Insertion Unordered, Sorted, Not allowed duplicate values */
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(8);
        numbers.add(3);
        numbers.add(2);
        System.out.println("numbers: " + numbers);

        LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        LinkedHashSet<Integer> oddNumbers = new LinkedHashSet<>();
        /** Using addAll() method*/
        oddNumbers.addAll(evenNumber);
        oddNumbers.add(1);
        oddNumbers.add(3);
        System.out.println("New HashSet: " + oddNumbers);

        // Calling iterator() method
        Iterator<Integer> iterate = oddNumbers.iterator();

        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        List<Integer> list = new ArrayList<Integer>(oddNumbers);
        System.out.println("Element at index 3 is: " + list.get(3));

        // Union of two set
        oddNumbers.addAll(evenNumber);
        System.out.println("Union is: " + oddNumbers);

        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("primeNumbers: " + primeNumbers);

        // Intersection of two sets
        evenNumber.retainAll(primeNumbers);
        System.out.println("Intersection is: " + evenNumber);

    }
}
