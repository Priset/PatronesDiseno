package state.practice;

public class Launch {
    public static void main(String[] args) {
        MemoriaRam memoriaRam = new MemoriaRam(0,"100");
        Cpu cpu = new Cpu(0,"100");
        Computadora computadora = new Computadora(memoriaRam,cpu,"Sons of the forest");

        computadora.setState(new Prendido());
        computadora.useComputer();
    }
}
