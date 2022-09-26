package listExample.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> languages = new Vector<>();

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

        Vector<String> languages2 = new Vector<>();
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
        Vector<String> vec = new Vector<String>();
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

    }
}
