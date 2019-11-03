import java.util.HashSet;

public class JavaSetTask14 {
    //14. Write a Java program to check if a string in hash set
    // for ex: ["apple", "red", "green"]
    // if there is red => has red
    // else => dont have it
    public static void main(String[] args){
        HashSet<String> s1 = new HashSet<>();
        s1.add("apple");
        s1.add("red");
        s1.add("green");
        if(s1.contains("red")){
            System.out.println("has red");

        }else {
            System.out.println("don't have it");
        }




    }

}
