import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        //Creating
        List<String>  str1 = new ArrayList<>();
        List<Integer>  str2 = new ArrayList<>();
        List<Double>  str3 = new ArrayList<>();
        //adding
        str1.add("new jersey");
        str1.add("1");

        str2.add(2);
        str2.add(10);
        str2.add(100);
        str2.add(1000);
        str2.add(20);
        str2.add(2000);
        str2.add(3000);


        str3.add(3.2);
        str3.add(3.5);
        //print
        System.out.println(str2);
        System.out.println(str1);
        // get the value in the arraylist and print the value 1,3,5
        int[] intArr = {1,2,3,4,5};
        System.out.println(intArr[2]);
        System.out.println(str2.get(5));
        System.out.println("................");
//print all for loop
        for (int i = 0; i <str2.size() ; i++) {
            System.out.println(str2.get(i));

        }
        System.out.println("...................");
//get the element in the arraylist
        List<String> strArr = new ArrayList<>();
        strArr.add("New Jersey");
        strArr.add("New York");
        strArr.add("Virginia");
        strArr.add("Georgia");

        System.out.println("index of this line " +strArr.indexOf("Virginia"));


    //sort the arraylist
        System.out.println("strArr before the sorting" + strArr );
        Collections.sort(strArr);
        System.out.println("strArr after the sorting" +strArr);

    }



}
