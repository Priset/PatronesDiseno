package builder.practice;

public class ComputadoraI7 extends BuilderComputadora{

    @Override
    public void buildMonitor() {this.computadora.setMonitor(32);}

    @Override
    public void buildTeclado() {this.computadora.setTeclado("luminoso");}

    @Override
    public void buildMouse() {this.computadora.setMouse("luminoso");}

    @Override
    public void buildMemoria() {this.computadora.setMemoria("16 Gb");}

    @Override
    public void buildProcesador() {this.computadora.setProcesador("i7");}

    @Override
    public void buildVideo() {this.computadora.setVideo(8);}
}
