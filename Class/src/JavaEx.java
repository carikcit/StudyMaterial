public class JavaEx {
    public static void main(String[] args) {

        int num[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0}
        };
//        System.out.print(num[0][0]);
//        System.out.print(num[0][1]);
//        System.out.println(num[0][2]);
//        System.out.print(num[1][0]);
//        System.out.print(num[1][1]);
//        System.out.println(num[1][2]);
//        System.out.print(num[2][0]);
//        System.out.print(num[2][1]);
//        System.out.println(num[2][2]);
//        System.out.print(num[3][0]);

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();

        }
        // by Mike Dane
    }
}
