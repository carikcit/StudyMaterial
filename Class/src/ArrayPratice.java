import java.util.Random;

public class ArrayPratice {
    public static void main(String[] args) {
        Random rand = new Random();
        // part1.
        // create array with size 10 <= size <= 100
        // use loop to get access for every element i n array
        // use rand.nextInt(1000) to assign random number to every element in array
        int[] arr = new int[10];
        // type variable name, press dot, select fori form popup,
        // to create for with shortcut
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            arr[i] =  (int) (Math.random() * 100);
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;
        System.out.println("\nAvg: " + avg);
    }
}

