import java.util.Scanner;

public class Zadanie2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = in.nextInt();
        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Podaj liczbe rzeczywista: ");
            double a = in.nextDouble();
            if(a > 0) {
                dodatnie++;
            }
            else {
                if(a < 0) {
                    ujemne++;
                }
                else {
                    zera++;
                }
            }
        }
        System.out.println("Wsrod podanych liczb jest: ");
        System.out.println(dodatnie+" - liczby dodatnie");
        System.out.println(ujemne+" - liczby ujemne");
        System.out.println(zera+" - zer");
    }
}