package proxy.practice;

public class Tarjeta implements ICuenta{
    private Cuenta cuenta;

    public Tarjeta() {
        System.out.println("****SALDO ACUTAL: 600 Bs*****");
        cuenta = new Cuenta(600);
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {
        if(transaccion.getMoneda().equals("bolivianos") && transaccion.getMonto()<= cuenta.getSaldo()){
            cuenta.ejecutarTransaccion(transaccion);
        } else if(transaccion.getMonto()> cuenta.getSaldo()){
            System.out.println("******SALDO INSUFICIENTE***********");
        } else {
            cuenta.ejecutarTransaccion(cuenta.cambiarABolivianos(transaccion));
        }
    }
}
