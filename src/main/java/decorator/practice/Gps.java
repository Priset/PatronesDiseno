package decorator.practice;

public class Gps extends Accesorios{
    public Gps(Automovil automovil, int costo) {
        super(automovil, costo);
    }
    @Override
    public void operacion() {
        super.operacion();
        System.out.println("Tipo mejora: GPS");
    }
}
