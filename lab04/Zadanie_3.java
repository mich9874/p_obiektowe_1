import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie_3 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 4, 9, 16));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(9, 7, 4, 9, 11));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(1, 4, 4, 7, 9, 9, 9, 11, 16));
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("mergeSorted(a, b) = "+mergeSorted(a, b));
        if(c.equals(mergeSorted(a, b)))
            System.out.println("mergeSorted dziala dobrze");
        else
            System.out.println("mergeSorted dziala zle");
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.addAll(0, a);
        arrL.addAll(a.size(), b);
        int n = arrL.size();
        do {
            for(int i = 0; i < n-1; ++i) {
                if(arrL.get(i) > arrL.get(i+1)) {
                    int temp = arrL.get(i+1);
                    arrL.set((i+1), arrL.get(i));
                    arrL.set(i, temp);
                }
            }
            n = n-1;
        } while (n > 1);
        return arrL;
    }
}
