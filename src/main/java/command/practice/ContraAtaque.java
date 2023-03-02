package command.practice;

public class ContraAtaque implements IAction{
    private Juego juego;

    public ContraAtaque(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void execute() {
        System.out.println("Acciones: ");
        this.juego.correr();
        this.juego.saltar();
        this.juego.correr();
        this.juego.saltar();
        this.juego.proteger();
        this.juego.golpear();
        this.juego.curar();
        this.juego.correr();
    }
}
