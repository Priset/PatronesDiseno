package singleton.practice1;

public class CasaCambio {
    private int dinero;

    public CasaCambio(int dinero) {
        this.dinero = dinero;
    }

    public void cambioDolarBoliviano(){
        EmpresaCambio.getInstance().dolarABoliviano(dinero);
    }
    public void cambioEuroBoliviano(){
        EmpresaCambio.getInstance().euroABoliviano(dinero);
    }
    public void cambioBolivianoDolar(){
        EmpresaCambio.getInstance().bolivianoADolar(dinero);
    }
    public void cambioBolivianoEuro(){
        EmpresaCambio.getInstance().bolivianoAEuro(dinero);
    }
    public void cambioEuroDolar(){
        EmpresaCambio.getInstance().euroADolar(dinero);
    }

    public void cambioDolarEuro(){
        EmpresaCambio.getInstance().dolarAEuro(dinero);
    }
}
