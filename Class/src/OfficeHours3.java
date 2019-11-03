
import java.util.Random;
import java.util.Scanner;

public class OfficeHours3 {
    public static void main(String[] args) {
//        System.out.println("Whats your name");
//
//        Scanner scan = new Scanner(System.in);
//
//        String s1 = scan.next();
//        System.out.println("Your name is " + s1);
//
//        System.out.println("How many car do you have?");
//        System.out.println("Scan is in the the System out " +scan.nextInt());
//        int i1 = scan.nextInt();
//        System.out.println("printing your integer" + i1);


//Random Class
        Random rnd = new Random();

        int i1 = rnd.nextInt();
        System.out.println("Random number I want  " + i1);
        int i2 = rnd.nextInt(20);
        System.out.println(" Random Out of Twenty is  " + i2);
        double i4 = Math.random();
        System.out.println(i4);
        double d1 = rnd.nextDouble();
        System.out.println("Random d1 is " + d1);
//Switch Statement
        System.out.println("Type any month");
        Scanner scn2 = new Scanner(System.in);
        String month = scn2.nextLine();
        //Type this Month
        switch (month) {
            case ("January"):
                System.out.println(month + "is the first month of the year");
                break;
            case ("February"):
                System.out.println(month + " is the second month of the year");
                break;
            //so on so forth...then
            default:
                System.out.println(month + "not an option here");
        }
        Random rnd3 = new Random();
        int i3 = rnd3.nextInt(4);
        switch (i3) {
            case (1):
                System.out.println(i3 + "is the first month of the year");
                break;
            case (2):
                System.out.println(i3 + " is the second month of the year");
                break;
            case (3):
                System.out.println(i3 + "is the 3rd month of the year");
                break;
            case (4):
                System.out.println(i3 + " is 4th month of the year");
                break;
            //so on so forth...then
            default:
                System.out.println("not an option here " + i3);
        }


    }
}
