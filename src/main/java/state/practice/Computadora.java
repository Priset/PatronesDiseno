package state.practice;

public class Computadora {
    private MemoriaRam ram;
    private Cpu cpu;
    private String programasAbiertos;
    private IState state;

    public Computadora(MemoriaRam ram, Cpu cpu, String programasAbiertos) {
        this.ram = ram;
        this.cpu = cpu;
        this.programasAbiertos = programasAbiertos;
    }

    public MemoriaRam getRam() {
        return ram;
    }

    public void setRam(MemoriaRam ram) {
        this.ram = ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public String getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void useComputer(){
        this.state.computerBehavior(this);
    }
}
