package setExample.treeSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        /** Insertion Unordered, Sorted, Not allowed duplicate values */
        TreeSet<Integer> numbers = new TreeSet <>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(8);
        numbers.add(3);
        numbers.add(2);
        System.out.println("numbers: " + numbers);

        TreeSet<Integer> evenNumber = new TreeSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("TreeSet: " + evenNumber);

        TreeSet<Integer> oddNumbers = new TreeSet<>();
        /** Using addAll() method*/
        oddNumbers.addAll(evenNumber);
        oddNumbers.add(1);
        oddNumbers.add(3);
        System.out.println("New TreeSet: " + oddNumbers);

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

        TreeSet<Integer> primeNumbers = new TreeSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("primeNumbers: " + primeNumbers);

        // Intersection of two sets
        evenNumber.retainAll(primeNumbers);
        System.out.println("Intersection is: " + evenNumber);

        /** Methods for Navigation */

        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);

        // Using pollFirst()
        System.out.println("Removed First Element: " + numbers.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + numbers.pollLast());
        System.out.println("New TreeSet: ====>>> " + numbers);

    }
}
