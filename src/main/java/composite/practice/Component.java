package composite.practice;

public abstract class Component {
    private int precio;
    private String tipo;
    private String espacio;

    private boolean ultimo;

    public Component(String tipo) {

        this.tipo = tipo;

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isUltimo() {
        return ultimo;
    }

    public void setUltimo(boolean ultimo) {
        this.ultimo = ultimo;
    }

    public abstract String showInfo();
    public abstract void calcularPrecio();

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int index);
}
