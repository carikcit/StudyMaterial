import java.util.HashSet;

public class JavaSetTask2 {
    //2. Write a Java program to iterate through all elements in a hash list.
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
        System.out.println("NUMBERS IS HERE " + numbers);
        System.out.println(".....................");
       // for (int i = 0; i < numbers.size(); i++) {
         //   System.out.println(numbers);
        for (Integer setNumber : numbers){
            System.out.print(" " +setNumber);

        }

    }
}


