import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList< String > arabalar = new ArrayList<String>();
        arabalar.add("Ford");
        arabalar.add ("Volvo");
        arabalar.add ("BMW");
        arabalar.add ("Mercedes");
        arabalar.add ("Mazda");
        System.out.println("arabalar" + arabalar);
        System.out.println(arabalar.get(2));
        System.out.println("Degistirmeden once " +arabalar.get(4));
        arabalar.set(4, "Opel");
        System.out.println("Degistirtikden  sonra " +arabalar.get(4));


    }

}
