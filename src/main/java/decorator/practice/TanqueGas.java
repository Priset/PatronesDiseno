package decorator.practice;

public class TanqueGas extends Accesorios{
    public TanqueGas(Automovil automovil, int costo) {
        super(automovil, costo);
    }
    @Override
    public void operacion() {
        super.operacion();
        System.out.println("Tipo mejora: Tanque de Gas");
    }
}
