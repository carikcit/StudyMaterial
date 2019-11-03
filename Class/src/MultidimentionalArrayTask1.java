public class MultidimentionalArrayTask1 {



        public static void main(String[] args) {
            //Using ONE and TWO loops to print names
            String [][] arr = {
                    // 0           1        2        3          4
                    {"Bayram", "Zeynep", "Sezai", "Michael","Barak"},// 0 row
                    {"Guney", "Ucar", "Kalayci", "Jackson", "Obama"},// 1 row
            };
            System.out.println(arr [0][0] + " "+ arr[1][0]);
            System.out.println(arr [0][3] + " " + arr [1][3]);

       //part3
            System.out.println("....................");
            System.out.println(arr.length);
            //using only one loop to print names
            for (int i = 0; i< arr[0].length ; i++) {
                System.out.println(arr [0][i] + " " + arr[1][i]);

            }
        }

    }




