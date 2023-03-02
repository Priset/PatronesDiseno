package command.practice;

public class AccionRegeneracion implements IAction{
    private Juego juego;

    public AccionRegeneracion(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void execute() {
        System.out.println("Acciones: ");
        this.juego.proteger();
        this.juego.curar();
    }
}
