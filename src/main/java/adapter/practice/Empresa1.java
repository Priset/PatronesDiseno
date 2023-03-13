package adapter.practice;

public class Empresa1 implements IMovil {
    private String nombre;

    public Empresa1(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void login() {
        System.out.println("Usuario logueado: "+getNombre());
    }

    @Override
    public void logout() {
        System.out.println("Usuario cerradno sesion: "+getNombre());
    }

    @Override
    public void report(String reporte) {
        System.out.println("Reporte: "+reporte);
    }
}
