import pl.imiajd.baginski.*;

public class Lab6 {
    public static void main(String[] args) {
        BetterRectangle rect = new BetterRectangle(2, 5, 3, 0);

        System.out.println("Obwód: " + rect.getPerimeter());
        System.out.println("Pole: " + rect.getArea());
    }
}
