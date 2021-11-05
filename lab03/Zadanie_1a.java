import java.util.Scanner;
public class Zadanie_1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj napis ");
        String str = in.nextLine();
        System.out.print("Podaj znak: ");
        char c = in.nextLine().charAt(0);
        System.out.println("Znak"+c+"powtarza sie "+countChar(str, c)+"razy ");
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); ++i)
            if (str.charAt(i) == c)
                ++count;
        return count;
    }


}
