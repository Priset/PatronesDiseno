package memento.practice;

public class BDD {
    private Persona[] personas;

    public BDD(Persona[] personas) {

        this.personas = personas;

    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public void showInfo() {

        System.out.println(">>>>>Contenido de la base de datos: ");
        for(Persona persona : personas) {

           persona.showInfo();

        }

    }


}
