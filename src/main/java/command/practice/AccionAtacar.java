package command.practice;

public class AccionAtacar implements IAction{
    private Juego juego;

    public AccionAtacar(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void execute() {
        System.out.println("Acciónes: ");
        this.juego.saltar();
        this.juego.correr();
        this.juego.golpear();
    }
}
