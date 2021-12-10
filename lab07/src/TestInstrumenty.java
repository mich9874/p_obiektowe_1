import java.time.LocalDate;
import pl.imiajd.baginski.*;

import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList();
        orkiestra.add(new Fortepian("Yamaha", LocalDate.of(1970, 2, 1), "dzwięk fortepianu"));
        orkiestra.add(new Fortepian("Yamaha", LocalDate.of(1970, 2, 1), "dzwięk fortepianu"));
        orkiestra.add(new Fortepian("Yamaha", LocalDate.of(1970, 2, 1), "dzwięk fortepianu"));
        orkiestra.add(new Fortepian("Yamaha", LocalDate.of(1970, 2, 1), "dzwięk fortepianu"));
        orkiestra.add(new Fortepian("Yamaha", LocalDate.of(1970, 2, 1), "dzwięk fortepianu"));

        for(Instrument e : orkiestra) {
            System.out.println(e.toString());
        }
    }
}
