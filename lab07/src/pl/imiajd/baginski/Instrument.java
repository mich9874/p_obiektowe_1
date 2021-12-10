package pl.imiajd.baginski.;
import java.time.LocalDate;

public abstract class Instrument {

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public abstract String dziwek();

    public String getProducent() {
        return this.producent;
    }

    public LocalDate getRokProdukcji() {
        return this.rokProdukcji;
    }

    public boolean equals(Instrument instrument) {
        if(this.producent.equals(instrument.producent) && this.rokProdukcji.equals(instrument.rokProdukcji)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.producent+" "+this.rokProdukcji;
    }
    private String producent;
    private LocalDate rokProdukcji;
}