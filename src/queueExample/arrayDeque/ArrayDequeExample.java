package queueExample.arrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();

       /**  Using add() */
        animals.add("Dog");


        /**  Using addFirst() */
        animals.addFirst("Cat");

        /**  Using addLast() */
        animals.addLast("Horse");
        System.out.println("ArrayDeque: " + animals);

        /**  Using offer() */
        animals.offer("Dog");

        /**  Using offerFirst() */
        animals.offerFirst("Cat");

        /**  Using offerLast() */
        animals.offerLast("Horse");
        System.out.println("New ArrayDeque: " + animals);

        /**  Get the first element */
        String firstElement = animals.getFirst();
        System.out.println("First Element: " + firstElement);

        /**  Get the last element */
        String lastElement = animals.getLast();
        System.out.println("Last Element: " + lastElement);

        /**  Using peek() */
        String element = animals.peek();
        System.out.println("Head Element: " + element);

        /**  Using peekFirst() */
        String firstElement1 = animals.peekFirst();
        System.out.println("First Element1: " + firstElement1);

        /**  Using peekLast */
        String lastElement1 = animals.peekLast();
        System.out.println("Last Element1: " + lastElement1);

        /**   Using remove() */
        String rElement = animals.remove();
        System.out.println("Removed Element: " + rElement);

        /**   Using removeFirst() */
        String rFirstElement = animals.removeFirst();
        System.out.println("Removed First Element: " + rFirstElement);

        /** Using removeLast() */
        String rLastElement = animals.removeLast();
        System.out.println("Removed Last Element: " + rLastElement);
        System.out.println("New ArrayDeque: " + animals);

        /** Using poll() */
        String pElement = animals.poll();
        System.out.println("Removed Element: " + pElement);

        /** Using pollFirst() */
        String pFirstElement = animals.pollFirst();
        System.out.println("Removed First Element: " + pFirstElement);

        /** Using pollLast() */
        String pLastElement = animals.pollLast();
        System.out.println("Removed Last Element: " + pLastElement);
        System.out.println("New ArrayDeque: " + animals);

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("New ArrayDeque: " + animals);

        /** Using clear() */
        animals.clear();
        System.out.println("New ArrayDeque: " + animals);

    }
}
