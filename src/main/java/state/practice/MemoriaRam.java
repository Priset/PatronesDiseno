package state.practice;

public class MemoriaRam {

    private int porcentaje;
    private String total;

    public MemoriaRam(int porcentaje, String total) {
        this.porcentaje = porcentaje;
        this.total = total;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void showRam(){
        System.out.println("Porcentaje: "+getPorcentaje());
        System.out.println("Total: "+getTotal());
    }
}
