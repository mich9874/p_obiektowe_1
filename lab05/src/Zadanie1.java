public class Zadanie1 {

    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        System.out.println("Na poczatku:");
        System.out.println("saver1: "+saver1.toString());
        System.out.println("saver2: "+saver2.toString());
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Po 1 miesiacu: ");
        System.out.println("saver1: "+saver1.toString());
        System.out.println("saver2: "+saver2.toString());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Po 2 miesiacu: ");
        System.out.println("saver1: "+saver1.toString());
        System.out.println("saver2: "+saver2.toString());
    }
}

class RachunekBankowy {
    public static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo_poczatkowe){
        saldo = saldo_poczatkowe;
    }
    public void obliczMiesieczneOdsetki(){
        saldo += (saldo*rocznaStopaProcentowa)/12;
    }

    public static void setRocznaStopaProcentowa(double value){
        rocznaStopaProcentowa = value;
    }

    public String toString() {
        return ""+saldo;
    }
}