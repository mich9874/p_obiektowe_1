import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie_4 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 4, 9, 16));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(16, 9, 4, 1));
        System.out.println("a = "+a);
        System.out.println("reversed(a) = "+reversed(a));
        if(b.equals(reversed(a)))
            System.out.println("reversed dziala dobrze");
        else
            System.out.println("reversed dziala zle");
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> ArrL = new ArrayList<>();
        for(int i = a.size()-1; i >= 0; --i)
            ArrL.add(a.get(i));
        return ArrL;
    }
}
