package setExample.hashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> oddNumbers = new HashSet<>();
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

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("primeNumbers: " + primeNumbers);

        // Intersection of two sets
        evenNumber.retainAll(primeNumbers);
        System.out.println("Intersection is: " + evenNumber);

    }
}
