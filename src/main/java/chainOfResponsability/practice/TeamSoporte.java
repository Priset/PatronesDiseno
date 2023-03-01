package chainOfResponsability.practice;

public class TeamSoporte implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void fallo(Persona persona, String titulo, String severidad, String descripcion) {
        if(severidad.equals("BAJA")){
            System.out.println("Team de soporte resolvio la falla tipo: ["+ severidad +"]");
            System.out.println("Titulo: "+titulo);
            System.out.println("Descripción: "+descripcion);
            System.out.println("Problema resuelto para el cliente: ");
            persona.showPersona();
        } else {
            System.out.println("ERROR: El Team de soporte no pudo resolver esta falla ["+ severidad +"] pasa la responsabilidad");
            next.fallo(persona, titulo, severidad, descripcion);
        }
    }
}
