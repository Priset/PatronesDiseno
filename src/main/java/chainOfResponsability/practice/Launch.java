package chainOfResponsability.practice;

public class Launch {
    public static void main(String[] args) {
        CentralFallas centralFallas = new CentralFallas();
        Persona persona = new Persona("Jonas","894651KMO");
        System.out.println("**************************************");
        centralFallas.fallo(persona,"Source","BAJA","Fallo en los ajustes.");
        System.out.println("**************************************");
        centralFallas.fallo(persona,"Graphics","ALTA","Fallo en los graficos.");
        System.out.println("**************************************");
        centralFallas.fallo(persona,"Storage","MEDIA","Fallo en el almacenamiento.");
        System.out.println("**************************************");
        centralFallas.fallo(persona,"RAM","CRITICA","Fallo en la RAM.");

    }
}
