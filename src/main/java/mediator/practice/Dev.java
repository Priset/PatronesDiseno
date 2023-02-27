package mediator.practice;

public class Dev extends Persona{
    private String lenguaje;
    public Dev(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    @Override
    public void enviar(String msg) {
        this.canalComunicacion.send(msg,this);
    }

    @Override
    public void recibir(String msg) {
        this.showPersona();
        System.out.println("Lenguaje: "+lenguaje);
        System.out.println("Mensaje recibido: "+msg+"\n");
    }
}
