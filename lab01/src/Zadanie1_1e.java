import java.util.Scanner;

public class Zadanie1_1e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = in.nextInt();
        double ciag = 1;
        for(int i = 1; i <= n; i++)
        {
            System.out.print("Podaj a_"+i+": ");
            ciag = ciag * Math.abs(in.nextDouble());
        }
        System.out.println("Wynik wyrazenia: "+ciag);
    }
}
