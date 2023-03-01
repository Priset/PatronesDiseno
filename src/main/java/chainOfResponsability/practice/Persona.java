package chainOfResponsability.practice;

public class Persona {
    private String nombre;
    private String ci;

    public Persona(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    public void showPersona(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("CI: "+getCi());
    }
}
