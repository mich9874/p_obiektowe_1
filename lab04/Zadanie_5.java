import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie_5 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 4, 9, 16));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 4, 9, 16));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(16, 9, 4, 1));
        System.out.println("a = "+a);
        reversed(a);
        System.out.println("a po wyowlaniu reversed(a) = "+a);
        if(c.equals(a))
            System.out.println("reversed dziala dobrze");
        else
            System.out.println("reversed dziala zle");
    }

    public static void reversed(ArrayList<Integer> a) {
        int size = a.size();
        for(int i = 0; i < size/2; ++i) {
            int temp = a.get(size-i-1);
            a.set(size-i-1, a.get(i));
            a.set(i, temp);
        }
    }
}
