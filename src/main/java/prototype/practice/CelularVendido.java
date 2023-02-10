package prototype.practice;

public class CelularVendido implements ICelular{
    private Celular celular;
    private Sim sim;

    public CelularVendido(Celular celular, Sim sim) {
        this.celular = celular;
        this.sim = sim;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    @Override
    public CelularVendido clone() {
        CelularVendido clone = new CelularVendido(this.celular,this.sim);
        return clone;
    }

    public void showInfo(){
        celular.showInfo();
        sim.showInfo();
    }
}
