package proxy.practice;

public class Launch {
    public static void main(String[] args) {
        ICuenta cuenta = new Tarjeta();
        cuenta.ejecutarTransaccion(new Transaccion(30, "euros"));
        cuenta.ejecutarTransaccion(new Transaccion(15, "bolivianos"));
        cuenta.ejecutarTransaccion(new Transaccion(140, "bolivianos"));
        cuenta.ejecutarTransaccion(new Transaccion(70, "dolares"));
    }
}
