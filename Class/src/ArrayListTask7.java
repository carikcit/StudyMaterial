import java.util.ArrayList;

public class ArrayListTask7 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red"); // 0
        colors.add("White");// 1
        colors.add("Black"); // 2
        colors.add("Green"); // 3
        System.out.println(colors);
//        boolean contain = colors.contains("Black");
//        if(contain){
//            System.out.println("\n it has Black");
//        }else System.out.println("not");
        // write your code here
        // print "It has Black color" if it has black color in arrayList
        // Hint: .contains method
        System.out.println("1. way");
        boolean containsBlack1 = false;
        for (String color : colors) {
            if (color.equals("Black")) {
                containsBlack1 = true;
            }

        }
        if (containsBlack1) {
            System.out.println("It has Black color");
        } else {
            System.out.println("It doesn't have Black color");
        }


        System.out.println("2. way");
        boolean containsBlack2 = colors.contains("Black");
        if (containsBlack2) {
            System.out.println("It has Black color");
        } else {
            System.out.println("It doesn't have Black color");
        }
    }
}




