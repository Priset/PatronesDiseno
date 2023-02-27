package mediator.practice;

public class Qa extends Persona{
    private String grado;
    public Qa(ICanalComunicacion canalComunicacion){
        super(canalComunicacion);
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
