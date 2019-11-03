import java.util.Scanner;

public class OfficeHours5 {
    public static void main(String[] args) {
        //print even and odd numbers
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("even number are  " + i);
            }
        }
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println("odd numbers are " + i);
            }

        }
        System.out.println(".......................");
        //find the bigger number given
        int i1 = 10;
        int i2 = 12;
        int i3 = 14;
        if (i1 > i2 && i1 > i3) {
            System.out.println("This is the bigger number i1 " + i1);

        } else if (i2 > i1 && i2 > i3) {
            System.out.println("This is the bigger number i2 " + i2);
        } else {
            System.out.println("This is the bigger number i3 " + i3);
        }
        System.out.println(".......................");
//Print prime numbers 7-11-13-17-19-23
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println("prime numbers" + i);
            }

        }
        Scanner scan = new Scanner(System.in);
        int tax = 0;
        System.out.println("Please enter your salary ");
        int salary = scan.nextInt();
        if (salary < 20000) {
            tax = salary * 10/ 1000;

        }else if ( salary< 30000 ){
            tax = salary * 15/ 100;

        }else if (salary < 80000){
            tax = salary * 15/ 100;
        }else{
            tax = salary * 30/ 100;
        }
        int netIncome = salary - tax;
        System.out.println("net income is $"   +netIncome);
    }
}
