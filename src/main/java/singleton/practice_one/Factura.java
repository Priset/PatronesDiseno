package singleton.practice_one;

public class Factura {

    private String nit;
    private int total;

    public Factura(String nit, int total) {
        Logger.getInstance().registro("Create instance : "+nit+total);
        this.nit = nit;
        this.total = total;
    }

    public String getNit() {
        Logger.getInstance().registro("get nit : NIT"+nit);
        return nit;
    }

    public void setNit(String nit) {
        Logger.getInstance().registro("set nit : NIT"+nit);
        this.nit = nit;
    }

    public int getTotal() {
        Logger.getInstance().registro("get total : Total monto"+total);
        return total;
    }

    public void setTotal(int total) {
        Logger.getInstance().registro("set total : Total monto"+total);
        this.total = total;
    }
}
