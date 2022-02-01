package Z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalTime;

public class Zad1 {
    public static void main(String[] args) {
        ArrayList<Character> character = new ArrayList<>(Arrays.asList('a','b','a'));
        removeRepeatedElements(character).forEach(e-> System.out.println(e));

        ArrayList<LocalTime> localTime = new ArrayList<>(Arrays.asList(LocalTime.of(12,55),LocalTime.of(11,25),LocalTime.of(12,55)));
        removeRepeatedElements(localTime).forEach(e-> System.out.println(e));

    }
    public static <T> ArrayList<T>removeRepeatedElements(ArrayList<T> list) {
        ArrayList<T> newlist = new ArrayList<>();
        for (T e: list) {
            if(!newlist.contains(e))
                newlist.add(e);
        }
        return newlist;
    }
}
