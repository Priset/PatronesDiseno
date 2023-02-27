package mediator.practice;

public class Qa extends Persona{
    private String grado;
    public Qa(ICanalComunicacion canalComunicacion,String grado){
        super(canalComunicacion);
        this.grado=grado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public void enviar(String msg) {
        this.canalComunicacion.send(msg,this);
    }

    @Override
    public void recibir(String msg) {
        this.showPersona();
        System.out.println("Grado: "+grado);
        System.out.println("Mensaje recibido: "+msg+"\n");
    }
}
