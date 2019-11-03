import java.util.HashSet;

public class JavaSetTask5 {
    public static void main(String[] args) {
        //5. Write a Java program to test a hash set is empty or not.
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
        System.out.println(numbers.isEmpty());// check if its empty

        if (numbers.isEmpty()) {
            System.out.println("Print Empty");

        } else {
            System.out.println("numbers in set");
        }


    }


}

