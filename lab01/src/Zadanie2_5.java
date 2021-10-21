import java.util.Scanner;

public class Zadanie2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = in.nextInt();
        int ile_par = 0;
        double a = 0, b = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Podaj liczbe rzeczywista: ");
            if(i % 2 == 0) {
                a = in.nextDouble();
            } else {
                b = in.nextDouble();
            }
            if(i >= 1 && a > 0 && b > 0) {
                ile_par++;
            }
        }
        System.out.println("ilosc par: "+ile_par);
    }
}