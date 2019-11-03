import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class JavaSetTask15 {
    public static void main(String[] args) {
        Random rand = new Random();

        HashSet<Integer> mySet = new HashSet<>();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int randomNumber = rand.nextInt(5); // 0 1 2 3 4

            mySet.add(randomNumber);
            myList.add(randomNumber);
        }

        System.out.println("myList: " + myList);
        System.out.println("mySet: " + mySet);
    }
}





