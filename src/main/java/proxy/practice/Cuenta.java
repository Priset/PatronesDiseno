package proxy.practice;

public class Cuenta implements ICuenta{
    int saldo;

    public Cuenta(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {
        transaccion.showInfo();
        saldo = saldo - transaccion.getMonto();
        System.out.println("Saldo actual: " + getSaldo() + " Bs");
    }

    public Transaccion cambiarABolivianos(Transaccion transaccion) {
        if(transaccion.getMoneda().equals("dolares")){
            System.out.println("Cambio de dolar a boliviano...");
            return new Transaccion(transaccion.getMonto() * 7, "bolivianos");
        } else if(transaccion.getMoneda().equals("euros")) {
            System.out.println("Cambio de euro a boliviano...");
            return new Transaccion(transaccion.getMonto() * 8, "bolivianos");
        } else {
            System.out.println("Moneda no identificada, verifique su entrada");
            return new Transaccion(0, "bolivianos");
        }
    }
}
