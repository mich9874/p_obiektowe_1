package pl.imiajd.baginski;
import java.time.LocalDate;

public class Flet extends Instrument {

    public Flet(String producent, LocalDate rokProdukcji, String dzwiek) {
        super(producent, rokProdukcji);
        this.dzwiek = dzwiek;
    }

    public String dziwek() {
        return this.dzwiek;
    }

    private String dzwiek;
}