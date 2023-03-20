package decorator.practice;

public class Accesorios implements Automovil{
    private Automovil automovil;
    private int costo;

    public Accesorios(Automovil automovil, int costo) {
        this.automovil = automovil;
        this.costo = costo;
    }

    @Override
    public void operacion() {
        automovil.operacion();
        System.out.println("****MEJORAS*****");
        System.out.println("Costo: " + costo + "$");
    }
}
