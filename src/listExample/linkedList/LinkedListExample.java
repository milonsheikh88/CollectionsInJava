package listExample.linkedList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        /** add() method without the index parameter */
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");

        /** add() method with specific index parameter */
        languages.add(2, "PHP");

        System.out.println("ArrayList: " + languages);

        /** Access/ get the element from the arraylist */
        String str = languages.get(2);
        System.out.print("Element at index 2: " + str);

        /** Change/ Modify elements */
        languages.set(1, "Swift");
        System.out.println("After set  ArrayList: " + languages);

        LinkedList<String> languages2 = new LinkedList<>();
        languages2.add("C#");
        languages2.add("JavaScript");

        /** Remove element from index 1 */
        String strRe = languages2.remove(1);
        System.out.println("Removed Element: " + strRe);
        System.out.println("Updated ArrayList: " + languages2);

        /** Removes all the elements from the arraylist that are also present in the specified collection.*/
        languages.removeAll(languages2);
        System.out.println("After removeAll  ArrayList: " + languages);

        /** Removes all the elements from an arraylist. */
        languages2.clear();
        System.out.println("After removeAll  ArrayList: " + languages2);

        /** LinkedList as Queue */

        Queue<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        // access the first element
        String str1 = animals.peek();
        System.out.println("Accessed Element by peek: " + str1);

        // access and remove the first element
        String str2 = animals.poll();
        System.out.println("Removed Element by poll: " + str2);
        System.out.println("LinkedList after poll(): " + animals);

        // add element at the end
        animals.offer("Horse");
        System.out.println("LinkedList after offer(): " + animals);

        /** LinkedList as Deque */
        Deque<String> animals2 = new LinkedList<>();

        // add element at the beginning
        animals2.add("Cow");
        System.out.println("LinkedList: " + animals2);

        animals2.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animals2);

        // add elements at the end
        animals2.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals2);

        // remove the first element
        animals2.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals2);

        // remove the last element
        animals2.removeLast();
        System.out.println("LinkedList after removeLast(): " + animals2);

    }
}
