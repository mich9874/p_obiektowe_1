import java.util.Scanner;

public class Zadanie1_1g {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = in.nextInt();
        double suma = 0;
        double iloczyn = 1;
        for(int i = 1; i <= n; i++) {
            System.out.print("Podaj a_"+i+": ");
            double a = in.nextDouble();
            suma = suma + a;
            iloczyn = iloczyn * a;
        }
        System.out.println("suma: "+suma);
        System.out.println("iloczyn: "+iloczyn);
    }
}
