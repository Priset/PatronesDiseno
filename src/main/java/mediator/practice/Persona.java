package mediator.practice;

public abstract class Persona {
    protected ICanalComunicacion canalComunicacion;
    private String name;
    private String ci;
    public Persona(ICanalComunicacion canalComunicacion){
        this.canalComunicacion=canalComunicacion;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public void showPersona(){
        System.out.println("***********PERSONA**********");
        System.out.println("Nombre: "+name);
        System.out.println("CI: "+ci);
    }

    public abstract void enviar(String msg);
    public abstract void recibir(String msg);
}
