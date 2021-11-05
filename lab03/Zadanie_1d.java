import java.util.Scanner;

public class Zadanie_1d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj str: ");
        String str = in.nextLine();
        System.out.print("Podaj n: ");
        int n = in.nextInt();
        System.out.print(repeat(str, n));
    }

    public static String repeat(String str, int n) {
        String string = "";
        for(int i = 0; i < n; ++i)
            string = string.concat(str);
        return string;
    }
}
