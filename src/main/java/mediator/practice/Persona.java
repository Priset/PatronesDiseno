package mediator.practice;

public abstract class Persona {
    protected ICanalComunicacion canalComunicacion;
    private String name;
    private String ci;
    private String cargo;
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

    public String getCargo() {
        return cargo;
    }

    public Persona setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public void showPersona(){
        System.out.println("***********PERSONA**********");
        System.out.println("Nombre: "+getName());
        System.out.println("CI: "+getCi());
        System.out.println("Cargo: "+getCargo());
    }

    public abstract void enviar(String msg);
    public abstract void recibir(String msg);
}
