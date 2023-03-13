package adapter.practice;

public class Empresa2 implements IWeb {
    private String nombre;
    private String dominio;

    public Empresa2(String nombre, String dominio) {
        this.nombre = nombre;
        this.dominio = dominio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Usuario logueado: "+getNombre());
        System.out.println("En el dominio: "+getDominio());
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Usuario cerrando sesion: "+getNombre());
        System.out.println("En el dominio: "+getDominio());
    }

    @Override
    public void generacionDatos(String contenidoReporte) {
        System.out.println("Reporte: "+contenidoReporte);
    }
}
