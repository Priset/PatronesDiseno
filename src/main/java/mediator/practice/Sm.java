package mediator.practice;

public class Sm extends Persona{
    private String certificaciones;
    public Sm(ICanalComunicacion canalComunicacion,String certificaciones) {
        super(canalComunicacion);
        this.certificaciones=certificaciones;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
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
