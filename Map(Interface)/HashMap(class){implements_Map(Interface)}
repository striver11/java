import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // put(): Put key-value pairs into the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put(null, 4); // null key
        map.put("Dragonfruit", null); // null value
        map.put("Elderberry", 2); // duplicate value
        map.put(null, 5);// another null key
        // map.put(null,44);
        // map.put("orange",null);
        
        // Output: {null=5, Apple=1, Banana=2, Cherry=3, Dragonfruit=null, Elderberry=2}

        // putAll(): Put all entries from another map
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Fig", 6);
        anotherMap.put("Grape", 7);
        map.putAll(anotherMap);
        // Output: {null=5, Apple=1, Banana=2, Cherry=3, Dragonfruit=null, Elderberry=2, Fig=6, Grape=7}

        // putIfAbsent(): Put a key-value pair if key is absent
        map.putIfAbsent("Honeydew", 8);
        // Output: {null=5, Apple=1, Banana=2, Cherry=3, Dragonfruit=null, Elderberry=2, Fig=6, Grape=7, Honeydew=8}

        // get(): Get the value of "Apple"
        Integer appleValue = map.get("Apple");
        // Output: 1

        // getOrDefault(): Get the value of "Jackfruit", or default if not found
        Integer jackfruitValue = map.getOrDefault("Jackfruit", 0);
        // Output: 0

        // containsKey(): Check if "Banana" is a key in the map
        boolean hasBanana = map.containsKey("Banana");
        // Output: true

        // containsValue(): Check if 3 is a value in the map
        boolean hasThree = map.containsValue(3);
        // Output: true

        // replace(): Replace the entry for "Apple"
        map.replace("Apple", 10);
        // Output: {null=5, Apple=10, Banana=2, Cherry=3, Dragonfruit=null, Elderberry=2, Fig=6, Grape=7, Honeydew=8}

        // replace(): Replace the entry for "Banana" only if it's currently 2
        map.replace("Banana", 2, 20);
        // Output: {null=5, Apple=10, Banana=20, Cherry=3, Dragonfruit=null, Elderberry=2, Fig=6, Grape=7, Honeydew=8}

        // compute(): Compute a new value for "Cherry"
        map.compute("Cherry", (k, v) -> v == null ? 30 : v * 3);
        // Output: {null=5, Apple=10, Banana=20, Cherry=9, Dragonfruit=null, Elderberry=2, Fig=6, Grape=7, Honeydew=8}

        // computeIfAbsent(): Compute a new value for "Jackfruit" if it's absent
        map.computeIfAbsent("Jackfruit", k -> 40);
        // Output: {null=5, Apple=10, Banana=20, Cherry=9, Dragonfruit=null, Elderberry=2, Fig=6, Grape=7, Honeydew=8, Jackfruit=40}

        // computeIfPresent(): Compute a new value for "Apple" if it's present
        map.computeIfPresent("Apple", (k, v) -> v + 100);
        // Output: {null=5, Apple=110, Banana=20, Cherry=9, Dragonfruit=null, Elderberry=2, Fig=6, Grape=7, Honeydew=8, Jackfruit=40}

        // merge(): Merge the given value with existing value for "Banana"
        map.merge("Banana", 200, (v1, v2) -> v1 + v2);
        // Output: {null=5, Apple=110, Banana=220, Cherry=9, Dragonfruit=null, Elderberry=2, Fig=6, Grape=7, Honeydew=8, Jackfruit=40}

        // remove(): Remove the entry for a key
        map.remove("Fig");
        // Output: {null=5, Apple=110, Banana=220, Cherry=9, Dragonfruit=null, Elderberry=2, Grape=7, Honeydew=8, Jackfruit=40}

        // remove(): Remove the entry for "Grape" only if it's currently 40
        map.remove("Grape", 40);
        // Output: {null=5, Apple=110, Banana=220, Cherry=9, Dragonfruit=null, Elderberry=2, Honeydew=8, Jackfruit=40}

        // keySet(): Get a set of all keys
        Set<String> keys = map.keySet();
        // Output: [null, Apple, Banana, Cherry, Dragonfruit, Elderberry, Honeydew, Jackfruit]

        // values(): Get a collection of all values
        Collection<Integer> values = map.values();
        // Output: [5, 110, 220, 9, null, 2, 8, 40]

        // entrySet(): Get a set of all entries
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        // Output: [null=5, Apple=110, Banana=220, Cherry=9, Dragonfruit=null, Elderberry=2, Honeydew=8, Jackfruit=40]

        // forEach(): Perform an action for each entry
        map.forEach((k, v) -> System.out.println(k + " = " + v));
        // Output: null = 5, Apple = 110, Banana = 220, Cherry = 9, Dragonfruit = null, Elderberry = 2, Honeydew = 8, Jackfruit = 40

        // size(): Get the number of entries in the map
        int size = map.size();
        // Output: 8

        // isEmpty(): Check if the map is empty
        boolean isEmpty = map.isEmpty();
        // Output: false

        // clear(): Remove all entries
        map.clear();
        // Output: {}
    }
}
