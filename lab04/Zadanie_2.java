import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie_2 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 4, 9, 16));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(9, 7, 4, 9, 11));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(1, 9, 4, 7, 9, 4, 16, 9, 11));
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("merge(a, b) = "+merge(a, b));
        if(c.equals(merge(a, b)))
            System.out.println("merge dziala dobrze");
        else
            System.out.println("merge dziala zle");
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> ArrL = new ArrayList<>();
        int size;
        if(a.size() <= b.size())
            size = a.size();
        else
            size = b.size();
        for(int i = 0; i < size; ++i) {
            ArrL.add(a.get(i));
            ArrL.add(b.get(i));
        }
        if(a.size() < b.size())
            for(int i = size; i < b.size(); ++i)
                ArrL.add(b.get(i));
        if(b.size() < a.size())
            for(int i = size; i < a.size(); ++i)
                ArrL.add(a.get(i));
        return ArrL;
    }
}
