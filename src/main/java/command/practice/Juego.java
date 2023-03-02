package command.practice;

public class Juego {
    private String nombre;
    private String modo;

    public Juego(String nombre, String modo) {
        this.nombre = nombre;
        this.modo = modo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public void curar(){
        System.out.println("El personaje se cura");
    }

    public void golpear(){
        System.out.println("EL personaje lanza un golpe");
    }
    public void saltar(){
        System.out.println("El personaje salta");
    }
    public void proteger(){
        System.out.println("El personaje se protege");
    }

    public void correr(){
        System.out.println("El personaje corre");
    }
}
