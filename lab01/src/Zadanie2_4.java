import java.util.Scanner;

public class Zadanie2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = in.nextInt();
        double min = 0, max = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Podaj liczbe rzeczywista: ");
            double a = in.nextDouble();
            if(i == 0) {
                min = a;
                max = a;
            } else {
                if(a < min) {
                    min = a;
                }
                if(a > max) {
                    max = a;
                }
            }
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
}
