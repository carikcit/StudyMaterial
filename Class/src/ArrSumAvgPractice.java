public class ArrSumAvgPractice {
    public static void main(String[] args) {
        String[][] array = {
                {"apple", "lemon", "peach"},
                {"red", "green", "blue"}
        };

        //part1. print
        // apple lemon peach
        // red green blue

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
            for (int i2 = 0; i2 < array.length - 1; i2--) {
                for (int j2 = 0; j2 < array[i2].length; j2++) {
                    System.out.print(array[i2][j2] + " ");


                }
                System.out.println();
            }
        }
    }
}