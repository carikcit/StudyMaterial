import java.util.Arrays;

public class OfficeHours7ReverseArray {
    public static void main(String[] args) {
        //reverse the array Seattle to New York and New York to Seattle
        String[] strarr1 = {"Seattle", "California", "Florida", "Texas", "Georgia"};
        //OUTPUT IN REVERSE Georgia Texas Florida California Seattle
        //for (int i =3 -1; i >= 0; i--){
        //for (int i = strarr1.length - 1; i >= 0; i--) {
        //for (int i = strarr1.length; i >0; i++)  {  >>>>>>>//wrong code

        //for (int i = 4; i >=strarr1.length -1; i--) {
        //System.out.println(strarr1[i]);}


        // Reverse Multidimensional Arrays
        //  0 0, 0 1, 0 2
        //  1 0, 1 1, 1 2
        String[][] strarr2 = {{"USA", "Mexico"}, {"South Korea", "Russia", "China"}, {"India", "Pakistan"}


        };
        for (int i = strarr2.length - 1; i >= 0; i--) {
            //reversing
            for (int j = strarr2[i].length - 1; j >= 0; j--) {
                //last two India Pakistan
                //for (int j = 0; j <strarr2.length ; j++) {
                System.out.println(strarr2[i][j] + " ");
            }


        }//loop's body
        System.out.println("..................");

        // reverse each character in the Array Seattle to elttaes, New York to Kroy Wen ...
        String[] strarr3 = {"London", "Paris", "Rome", "Barcelona", "Madrid"};
        for (int i = 0; i < strarr3.length; i++) {
            char[] strarr3Chars = strarr3[i].toCharArray();
            for (int j = strarr3Chars.length - 1; j >= 0; j--) {
                //for (int j = 0; j <strarr3Chars.length ; j++) {
                System.out.print(strarr3Chars[j]);
            }
            System.out.println();
        }
        //get the String Array a $115 $23,$75 remove the $ and then sum the numbers

        String [ ]numarr1 = {"$50","$40","$30"};
        System.out.println(numarr1.length + " length is here");

        int total = 0;
        for(int i = 0; i< numarr1.length; i++ ){
            String num1 = numarr1[i];
            num1 = num1.replace("$", " ");
            System.out.println(num1 + " num1 is here");

            int mynum = Integer.valueOf(num1);
           // total = total + mynum;
            total+= mynum;

            System.out.println(mynum);
        }

    }


}









