package observer.practice;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements IUser{
    private String nombre;
    private String ci;
    private List<String> tipos;

    public Usuario(String ci, String nombre) {
        this.ci = ci;
        this.nombre = nombre;
        tipos = new ArrayList<>();
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getTipos() {
        return tipos;
    }

    public void setTipos(List<String> tipos) {
        this.tipos = tipos;
    }

    @Override
    public void update(String info, Mensaje mensaje) {
        System.out.println("**********NOTIFICACION***************");
        System.out.println("Nombre: "+getNombre());
        System.out.println("CI: "+getCi());
        for(String tipo: tipos){
            System.out.print(tipo + ", ");
        }
        System.out.println();
        System.out.println(info);
        mensaje.showMensaje();
        System.out.println("**********************************");
    }

    @Override
    public void setTypeNotification(List<String> type) {
        this.tipos = type;
    }

    @Override
    public List<String> getTypeNotification() {
        return tipos;
    }
}
