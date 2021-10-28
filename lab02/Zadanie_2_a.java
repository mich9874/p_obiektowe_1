import java.util.Scanner;

public class Zadanie_2_a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.println("1 <= n <= 100");
            System.out.print("Podaj n: ");
            n = in.nextInt();
        } while(n < 1 || n > 100);
        int[] tab = new int[n];
        generuj(tab, n, -999, 999);
        System.out.print("tab: ");
        wyswietl(tab);
        System.out.println("Ile nieparzystch: "+ileNieparzystych(tab));
        System.out.println("Ile parzystych: "+ileParzystych(tab));
    }

    public static void generuj (int[] tab, int n, int minWartosc, int maxWartosc) {
        for(int i = 0; i < n; ++i)
            tab[i] = (int)(Math.random()*(maxWartosc-minWartosc+1)) + minWartosc;
    }

    public static void wyswietl(int[] tab) {
        for(int i : tab)
            System.out.print(i+" ");
        System.out.println();
    }

    public static int ileNieparzystych(int[] tab) {
        int ile = 0;
        for(int i : tab)
            if(Math.abs(i) % 2 == 1)
                ++ile;
        return ile;
    }

    public static int ileParzystych(int[] tab) {
        int ile = 0;
        for(int i : tab)
            if(Math.abs(i) % 2 == 0)
                ++ile;
        return ile;
    }
}