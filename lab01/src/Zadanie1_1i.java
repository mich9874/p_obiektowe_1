import java.util.Scanner;

public class Zadanie1_1i {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = in.nextInt();
        double ciag = 0;
        int mianownik = 1;
        for(int i = 1; i <= n; i++) {
            System.out.print("Podaj a_"+i+": ");
            mianownik = mianownik * i;
            ciag = ciag + (Math.pow(-1, i)*in.nextDouble())/mianownik;
        }
        System.out.println("Wartosc wyrazenia: "+ciag);
    }
}
