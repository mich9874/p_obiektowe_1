package Z2;
import java.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Zad2 {
    public static void main(String[] args) {
        ArrayList<Character> character = new ArrayList<>(Arrays.asList('a', 'b','c'));
        printMarginal(character);
        System.out.println();
    }

    public static <E extends Iterable<?>> void printMarginal(E object) {
        ArrayList<Object> copy = new ArrayList<>();
        object.forEach(e ->copy.add(e));
        System.out.print(copy.get(0)+""+copy.get(copy.size()-1));
    }
}
