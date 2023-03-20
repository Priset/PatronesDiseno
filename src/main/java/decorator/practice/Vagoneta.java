package decorator.practice;

public class Vagoneta implements Automovil{
    private String placa;
    private String velocidad;
    private boolean avanzar;

    public Vagoneta(String placa, String velocidad, boolean avanzar) {
        this.placa = placa;
        this.velocidad = velocidad;
        this.avanzar = avanzar;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void operacion() {
        System.out.println("Velocidad: " + getVelocidad());
        System.out.println("Avanzar: " + isAvanzar());
        System.out.println("Placa: " + getPlaca());
    }
}
