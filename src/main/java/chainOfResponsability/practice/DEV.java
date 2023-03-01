package chainOfResponsability.practice;

import javax.sound.midi.Soundbank;

public class DEV implements IHandler{
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
    public void fallo(Persona persona ,String titulo, String severidad, String descripcion) {
        if(severidad.equals("CRITICA")){
            System.out.println("DEV resolvio la falla tipo: ["+ severidad +"]");
            System.out.println("Titulo: "+titulo);
            System.out.println("Descripción: "+descripcion);
            System.out.println("Problema resuelto para el cliente: ");
            persona.showPersona();
        } else {
            System.out.println("ERROR: El DEV no pudo resolver esta falla ["+ severidad +"]");
        }
    }
}
