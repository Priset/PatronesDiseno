package singleton.practice1;
public class CuentaBancaria {
    public int saldo;
    private static CuentaBancaria instance = null;

    private CuentaBancaria() {
        saldo = 1000;
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new CuentaBancaria();
        }
    }
    public static CuentaBancaria getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void cambioGeneral(int dolar, int euro){
        EmpresaCambio.getInstance().dolarABoliviano(dolar);
        EmpresaCambio.getInstance().euroABoliviano(euro);
    }
}
