import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Zadanie1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Double> ciag = new ArrayList<Double>();
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Podaj a_"+i+": ");
            double x = scanner.nextDouble();
            ciag.add(x);
        }
        ciag.add(ciag.get(0));
        ciag.remove(0);
        System.out.println(ciag);
    }
}