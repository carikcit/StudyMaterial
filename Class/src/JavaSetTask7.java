import java.util.HashSet;

public class JavaSetTask7 {
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
        // int array [] = numbers.toArray(HashSet);
        //  Integer[] array = new Integer[numbers.size()];
        //numbers.toArray(array);

        int size = numbers.size();
        Integer[] array = new Integer[size];
        numbers.toArray(array);
        System.out.println("New ARRAYS ELEMENTS ");

        for (Integer elements : array) {
            System.out.println(elements);


        }
    }
}