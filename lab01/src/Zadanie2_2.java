import java.util.Scanner;

public class Zadanie2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = in.nextInt();
        double suma = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Podaj liczbe rzeczywista: ");
            double a = in.nextDouble();
            if(a > 0) {
                suma += a;
            }
        }
        suma *= 2;
        System.out.println("Suma: "+suma);
    }
}
