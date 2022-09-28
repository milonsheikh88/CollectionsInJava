package queueExample.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        /** Using the add() method */
        numbers.add(4);
        numbers.add(2);
        numbers.add(7);
        numbers.add(8);
        numbers.add(5);
        System.out.println("PriorityQueue: " + numbers);

        /** Using the offer() method */
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);

        /** Using the peek() method */
        int number1 = numbers.peek();
        System.out.println("Accessed Element: " + number1);

        /** Using the remove() method */
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        /** Using the poll() method */
        int number2 = numbers.poll();
        System.out.println("Removed Element Using poll(): " + number2);

        /** Using the iterator() method */
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

    }
}
