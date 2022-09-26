package listExample.arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

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

        ArrayList<String> languages2 = new ArrayList<>();
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
    }
}
