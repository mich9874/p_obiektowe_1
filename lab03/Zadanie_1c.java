import java.util.Scanner;
public class Zadanie_1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        String str = sc.nextLine();
        System.out.println("srodek napisu: "+ middle(str));
    }

    public static String middle(String str) {
        double dlugosc = str.length()/2;
        int n = (int) (Math.round(dlugosc));
        if (str.length()%2 == 1)
            return (""+str.charAt(n));
        else
            return (""+str.charAt(n-1)+str.charAt(n));
    }
}
