package command.practice;

public class Correr implements IAction{
    private Juego juego;

    public Correr(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void execute() {
        System.out.println("Acción: ");
        this.juego.correr();
    }
}
