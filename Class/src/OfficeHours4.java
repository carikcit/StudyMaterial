import java.util.Random;

public class OfficeHours4 {
    public static void main(String[] args) {
        //Simple,While,infinite loops
        for (int i = 1; i <= 5; i++) {
            System.out.println("i is here " + i);
        }

        //sum the numbers from 1 to 5 >>> 1+2+3+4+5= 15
        int total = 0;
        for (int i = 0; i <= 5; i++) {
            total = total + i;
            System.out.println("Total is here  " + total);

        }
        System.out.println(".........................");
        //create 3 numbers and between 0-30 sum them
        Random rnd = new Random();
//        int num1 = rnd.nextInt(30);
//        int num2 = rnd.nextInt(30);
//        int num3 = rnd.nextInt(30);
//        int total2 = num1 + num2 + num3;
//        System.out.println("Total2 is here " + total2);
        int total2 = 0;
        for (int i = 0; i < 3; i++) {
            int num = rnd.nextInt(30);
            total2 = total2 + num;
            System.out.println("num loop is here " + num);
            System.out.println("Total is " + total2);

        }
        System.out.println(".....................");

        //infinite loop
//        for (int i =1; i > 0; i++){
//            System.out.println(i);
//        }
//while loop
        int j = 1;
        while(j < 10){
            int num = j*5;

            System.out.println(num);
            j++;
        }

    }

}
