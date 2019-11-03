import java.util.ArrayList;
import java.util.Set;

public class JavaSetTask1 {
    public static void main(String[] args) {
        System.out.println("ArrayList------------------------");
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        System.out.println(listNumbers);

        System.out.println("HashSet------------------------");
        Set<Integer> setNumbers = new java.util.HashSet<>();
        setNumbers.add(1);
        setNumbers.add(2);
        setNumbers.add(3);
        setNumbers.add(10);
        setNumbers.add(5);
        System.out.println(setNumbers);

    }
}
