import pl.imiajd.baginski.*;
import java.time.LocalDate;

public class Zadanie_1 {
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];
        String[] p_imiona = {"Jan"};
        LocalDate p_dataUrodzenia = LocalDate.of(1990, 1, 25);
        LocalDate p_dataZatrudnienia = LocalDate.of(2010, 1, 25);
        String[] s_imiona = {"Małgorzata"};
        LocalDate s_dataUrodzenia = LocalDate.of(2000, 5, 25);
        ludzie[0] = new Pracownik("Kowalski", p_imiona, p_dataUrodzenia, true, 5000, p_dataZatrudnienia);
        ludzie[1] = new Student("Nowak", s_imiona, s_dataUrodzenia, false, "informatyka", 5.0);

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}


