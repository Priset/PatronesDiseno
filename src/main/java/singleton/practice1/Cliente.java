package singleton.practice1;

public class Cliente {
    private String nombre;
    private String ci;

    public Cliente(String nombre, String ci) {
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
    public void cambioABolivianos(int dolar, int euro){
        CuentaBancaria.getInstance().cambioGeneral(dolar, euro);
    }
    public void showInfo(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("CI: "+getCi());
    }
}
