package builder.practice;

public class ComputadoraI9 extends BuilderComputadora{

    @Override
    public void buildMonitor() {this.computadora.setMonitor(45);}

    @Override
    public void buildTeclado() {this.computadora.setTeclado("luminoso");}

    @Override
    public void buildMouse() {this.computadora.setMouse("gamer");}

    @Override
    public void buildMemoria() {this.computadora.setMemoria("32 Gb");}

    @Override
    public void buildProcesador() {this.computadora.setProcesador("i9");}

    @Override
    public void buildVideo() {this.computadora.setVideo(16);}
}
