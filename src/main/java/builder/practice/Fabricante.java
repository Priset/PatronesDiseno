package builder.practice;

public class Fabricante {
    private BuilderComputadora builder;
    public Computadora getComputadora(){return builder.getComputadora();}
    public void setTipoComputadora(BuilderComputadora builder){this.builder = builder;}
    public void buildComputadora(){
        this.builder.armarComputadora();
        this.builder.buildMonitor();
        this.builder.buildTeclado();
        this.builder.buildMouse();
        this.builder.buildMemoria();
        this.builder.buildProcesador();
        this.builder.buildVideo();
    }
}
