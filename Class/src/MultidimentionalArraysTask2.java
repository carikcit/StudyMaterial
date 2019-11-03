import java.util.Random;

public class MultidimentionalArraysTask2 {
    //TODO Using 2D Array fill the table of exam(examResult array)
// exam is provided with percentages 0-100%
//              JAVA	Math	English  C++   SoftSkills
//    Max	    ???	    ???	     ???
//    Bayram	???	    ???	     ???     ???    ???
    //part1. give number
    //part2, print all results, USING NESTED LOOP
    //part2.1, assign random numbers to results
    public static void main(String[] args) {
        int[][] examResult = {
                //part1
                {60, 70, 80},
                {55, 65, 75, 85, 95,},

        };
//part2
        //1stway
        System.out.println(" 1st Row length  = " + examResult[0].length + "  and 2nd Row = " + examResult[1].length);
        System.out.println("..................");
        //2ndway
        for (int i = 0; i <examResult.length ; i++) {
            for (int j = 0; j < examResult.length; j++) {
                System.out.println(examResult[i][j]);
            }
            System.out.println(".....................");

        }

//3rdway
        System.out.println("Length: " + examResult[0].length);
        Random random = new Random();
        for (int row = 0; row < examResult.length; row++) {
            for (int col = 0; col < examResult[row].length; col++) {
                System.out.println("RowCOL" + row + col);

                //part2.1

                examResult[row][col] = random.nextInt(100);
                System.out.print(examResult[row][col] + "  rowcolrandom ");
            }
            }
        }
    }
