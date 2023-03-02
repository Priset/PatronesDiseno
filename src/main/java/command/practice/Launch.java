package command.practice;

public class Launch {
    public static void main(String[] args) {
        Juego valorant = new Juego("Valorant","Multijugador Online");
        AccionAtacar atacar  = new AccionAtacar(valorant);
        AccionRegeneracion regeneracion = new AccionRegeneracion(valorant);
        ContraAtaque contraAtaque = new ContraAtaque(valorant);
        Correr correr = new Correr(valorant);

        GenerateAction nivel1 = new GenerateAction();
        nivel1.addNewAction(correr);

        GenerateAction nivel2 = new GenerateAction();
        nivel2.addNewAction(regeneracion);

        GenerateAction nivel3 = new GenerateAction();
        nivel3.addNewAction(atacar);

        GenerateAction nivel4 = new GenerateAction();
        nivel4.addNewAction(contraAtaque);

        System.out.println("********NIVEL 1*************");
        nivel1.run();
        System.out.println("********NIVEL 2*************");
        nivel2.run();
        System.out.println("********NIVEL 3*************");
        nivel3.run();
        System.out.println("********NIVEL 4*************");
        nivel4.run();
    }
}
