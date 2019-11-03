import java.util.ArrayList;
import java.util.Collection;

public class ArrayListTask11 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red"); // 0
        list1.add("White");// 1
        list1.add("Black"); // 2
        list1.add("Green");
        System.out.println("List 1: " + list1);

        // code here
        for (int i = list1.size() - 1; i >= 0; i--) {

            System.out.print( list1.get(i) + " ");

        }
       // System.out.println();
        // end code



            }
        }


