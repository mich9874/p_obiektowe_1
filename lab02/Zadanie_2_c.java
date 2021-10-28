import java.util.Scanner;

public class Zadanie_2_c {
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
        System.out.println("Element maksymalny to "+maksymalny(tab));
        System.out.println("ileMaksymalnych: "+ileMaksymalnych(tab));
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

    public static int maksymalny(int[] tab) {
        int max = tab[0];
        int ile_max = 0;
        for(int i : tab) {
            if(i > max) {
                max = i;
                ile_max = 0;
            }
            if(i == max ) {
                ile_max++;
            }
        }
        return max;
    }

    public static int ileMaksymalnych(int[] tab) {
        int max = tab[0];
        int ile_max = 0;
        for(int i : tab) {
            if(i > max) {
                max = i;
                ile_max = 0;
            }
            if(i == max ) {
                ile_max++;
            }
        }
        return ile_max;
    }
}
