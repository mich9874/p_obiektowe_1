import java.util.Scanner;

class Zadanie1_1b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n:");
        int n = in.nextInt();
        double mnozenie=1;
        for (int i=0;i<n;i++) {
            System.out.println("Podaj "+(i+1)+" liczbe");
            mnozenie*=in.nextDouble();
        }
        System.out.println(mnozenie);
    }
}
