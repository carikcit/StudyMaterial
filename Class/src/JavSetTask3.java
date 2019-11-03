import java.util.HashSet;

public class JavSetTask3 {
    //3. Write a Java program to get the number of elements in a hash set.

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);

        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
       // System.out.println(numbers);

        System.out.println(numbers.size());
       // System.out.println("Clear all element in");
        //numbers.clear();
        System.out.println(numbers + " ..");
        numbers.remove(1);
        numbers.remove(2);
       // System.out.println(numbers);
        //part 2, remove only 1 and 2 using .removeAll method
        // Hint: create second HashSet with 1 and 2
        HashSet<Integer> h2 = new HashSet<>();
        h2.add(1);
        h2.add(2);
        numbers.removeAll(h2);
        System.out.println(numbers);
        // Removes from this set all of its elements
        // that are contained in the specified collection

    }


}


