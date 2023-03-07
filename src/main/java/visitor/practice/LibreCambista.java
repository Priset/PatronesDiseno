package visitor.practice;

public class LibreCambista implements ILibreCambista{

    @Override
    public void cambiarBillete(Bolivia bolivia, int monto) {
        int cambioADolar = monto/7;
        int cambioAEuro = monto/8;
        System.out.println("Cambio de Bolivianos a Dolares: " + cambioADolar);
        System.out.println("Cambio de Bolivianos a Euros: " + cambioAEuro);
    }

    @Override
    public void cambiarBillete(EEUU eeuu, int monto) {
        int cambioABoliviano = monto*7;
        int cambioAEuro = monto;
        System.out.println("Cambio de Dolares a Bolivianos: " + cambioABoliviano);
        System.out.println("Cambio de Dolares a Euros: " + cambioAEuro);
    }

    @Override
    public void cambiarBillete(Europa europa, int monto) {
        int cambioABoliviano = monto*8;
        int cambioADolar = monto;
        System.out.println("Cambio de Euros a Dolares: " + cambioADolar);
        System.out.println("Cambio de Euros a Bolivianos: " + cambioABoliviano);
    }
}
