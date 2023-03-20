package decorator.practice;

public class Turbo extends Accesorios{
    public Turbo(Automovil automovil, int costo) {
        super(automovil, costo);
    }
    @Override
    public void operacion() {
        super.operacion();
        System.out.println("Tipo mejora: Turbo");
    }
}
