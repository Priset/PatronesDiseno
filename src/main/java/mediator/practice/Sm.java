package mediator.practice;

public class Sm extends Persona{
    private String certificaciones;
    public Sm(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    @Override
    public void enviar(String msg) {
        this.canalComunicacion.send(msg,this);
    }

    @Override
    public void recibir(String msg) {
        this.showPersona();
        System.out.println("Certificaciones: "+certificaciones);
        System.out.println("Mensaje recibido: "+msg+"\n");
    }
}
