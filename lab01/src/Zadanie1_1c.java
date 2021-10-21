import java.util.Scanner;
class Zadanie1_1c {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Podaj n:");
        int n=in.nextInt();
        double suma=0;
        for (int i=1;i<=n;i++){
            System.out.println("Podaj "+i+" liczbe:");
            double liczba=in.nextDouble();
            if(liczba<0){
                liczba*=(-1);
            }
            suma+=liczba;
        }
        System.out.println("Suma wynosi:"+suma);
    }
}
