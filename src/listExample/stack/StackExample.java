package listExample.stack;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> languages = new Stack<>();

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

        Stack<String> languages2 = new Stack<>();
        languages2.add("C#");
        languages2.add("JavaScript");

        /** Remove element from index 1 */
        String strRe = languages2.remove(1);
        System.out.println("Removed Element: " + strRe);
        System.out.println("Updated ArrayList: " + languages2);

        /**Removes all the elements from the arraylist that are also present in the specified collection.*/
        languages.removeAll(languages2);
        System.out.println("After removeAll  ArrayList: " + languages);

        /** removes all the elements from an arraylist.*/
        languages2.clear();
        System.out.println("After removeAll  ArrayList: " + languages2);

        /** Vector contains many legacy methods that are not the part of a collection framework. */
        Stack<String> vec = new Stack<String>();
        vec.add("Tiger");
        vec.add("Lion");

        /** Adding elements using addElement() method of Vector  */
        vec.addElement("Rat");
        vec.insertElementAt("Deer",1);
        System.out.println("Vec: " + vec);
        //Get the first element
        System.out.println("The first animal of the vector is = "+vec.firstElement());
        //Get the last element
        System.out.println("The last animal of the vector is = "+vec.lastElement());

        /** the Stack class includes 5 more methods that distinguish it from Vector. */
        Stack<String> sta= new Stack<>();

        /** Add elements to Stack */
        sta.push("Dog");
        sta.push("Horse");
        sta.push("Cat");
        System.out.println("Stack: " + sta);

        // Access element from the top
        String element1 = sta.peek();
        System.out.println("Element at top: " + element1);

        /** Remove element stacks */
        String element2 = sta.pop();
        System.out.println("Removed Element: " + element2);
        System.out.println("Stack After Removed: " + sta);

    }
}
