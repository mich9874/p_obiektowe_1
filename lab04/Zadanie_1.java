import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie_1 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 4, 9, 16));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(9, 7, 4, 9, 11));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11));
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("append(a, b) = "+append(a, b));
        if(c.equals(append(a, b)))
            System.out.println("append dziala dobrze");
        else
            System.out.println("appedn dziala zle");
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.addAll(0, a);
        arrL.addAll(a.size(), b);
        return arrL;
    }
}
