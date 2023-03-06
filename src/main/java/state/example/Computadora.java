package state.example;

public class Computadora {
    private MemoryRam memoryRam;
    private TarjetaVideo tarjetaVideo;
    // IState
    private IStateComputer stateComputer;


    public Computadora(MemoryRam memoryRam, TarjetaVideo tarjetaVideo) {
        this.memoryRam = memoryRam;
        this.tarjetaVideo = tarjetaVideo;
    }

    public MemoryRam getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(MemoryRam memoryRam) {
        this.memoryRam = memoryRam;
    }

    public TarjetaVideo getTargetaVideo() {
        return tarjetaVideo;
    }

    public void setTargetaVideo(TarjetaVideo tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public IStateComputer getStateComputer() {
        return stateComputer;
    }

    public void setStateComputer(IStateComputer stateComputer) {
        this.stateComputer = stateComputer;
    }

    public void useComputer(){
        this.stateComputer.computerBehavior(this);
    }
}
