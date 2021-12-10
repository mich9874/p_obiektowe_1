package pl.imiajd.baginski.;
import java.time.LocalDate;

public class Fortepian extends Instrument {

    public Fortepian(String producent, LocalDate rokProdukcji, String dzwiek) {
        super(producent, rokProdukcji);
        this.dzwiek = dzwiek;
    }

    public String dziwek() {
        return this.dzwiek;
    }

    private String dzwiek;
}
