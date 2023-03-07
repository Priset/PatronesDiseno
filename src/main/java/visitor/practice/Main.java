package visitor.practice;

public class Main {
    public static void main(String[] args) {
        Bolivia bolivia = new Bolivia();
        EEUU eeuu = new EEUU();
        Europa europa = new Europa();

        LibreCambista cambista = new LibreCambista();

        bolivia.cambio(cambista,30);
        eeuu.cambio(cambista,25);
        europa.cambio(cambista,40);
    }
}
