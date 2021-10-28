import java.util.Scanner;

public class Zadanie_2_e {
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
        System.out.println("dlugoscMaksymalnegoCiaguDodatniego: "+dlugoscMaksymalnegoCiaguDodatniego(tab));
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

    public static int dlugoscMaksymalnegoCiaguDodatniego(int[] tab) {
        int aktualnie_sprawdzany = 0;
        int najdluzszy = 0;
        for(int i : tab) {
            if(i > 0)
                aktualnie_sprawdzany++;
            else
                aktualnie_sprawdzany = 0;
            if(najdluzszy < aktualnie_sprawdzany)
                najdluzszy = aktualnie_sprawdzany;
        }
        return najdluzszy;
    }
}
