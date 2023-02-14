package singleton.practice1;
public class EmpresaCambio {
    private static EmpresaCambio instance = null;

    private EmpresaCambio() {}

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new EmpresaCambio();
        }
    }
    public static EmpresaCambio getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void dolarABoliviano(int dinero){
        System.out.println("El cambio es: "+dinero*7);
    }

    public synchronized void bolivianoADolar(int dinero){
        System.out.println("El cambio es: "+dinero/7);
    }
    public synchronized void bolivianoAEuro(int dinero){
        System.out.println("El cambio es: "+dinero/8);
    }
    public synchronized void euroABoliviano(int dinero){
        System.out.println("El cambio es: "+dinero*8);
    }
    public synchronized void euroADolar(int dinero){
        System.out.println("El cambio es: "+dinero/1.07);
    }
    public synchronized void dolarAEuro(int dinero){
        System.out.println("El cambio es: "+dinero*1.07);
    }

}
