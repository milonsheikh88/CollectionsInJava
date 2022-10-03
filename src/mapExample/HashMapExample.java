package mapExample;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> languages = new HashMap<>();

        /** Using add data/element using put method*/
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("HashMap: " + languages);

        /** get() method to get value */
        String value = languages.get(1);
        System.out.println("Value at with key 1: " + value);

        /**  return set view of keys using keySet() */
        System.out.println("Keys: " + languages.keySet());


        /**  return set view of values  using values() */
        System.out.println("Values: " + languages.values());

        /** return set view of key/value pairs using entrySet() */
        System.out.println("Key/Value mappings: " + languages.entrySet());

        /** change element with key 2 */
        languages.replace(2, "C++");
        System.out.println("HashMap using replace(): " + languages);

        /** remove element associated with key 2 */
        String value1 = languages.remove(2);
        System.out.println("Removed value: " + value1);
        System.out.println("Updated HashMap: " + languages);
        languages.clear();
        System.out.println("Updated HashMap: " + languages);

    }
}
