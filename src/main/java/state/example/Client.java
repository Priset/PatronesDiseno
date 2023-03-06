package state.example;

public class Client {
    public static void main (String []args){
        MemoryRam ram = new MemoryRam(0,"16G","DDR4");
        TarjetaVideo tarjetaVideo = new TarjetaVideo(0,"32G","MSI");
        Computadora pc = new Computadora(ram, tarjetaVideo);

        pc.setStateComputer(new Apagado());
        pc.useComputer();

        pc.setStateComputer(new ProgramaChrome());
        pc.useComputer();

        pc.setStateComputer(new Apagado());
        pc.useComputer();
    }

}
