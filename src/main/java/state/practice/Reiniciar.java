package state.practice;

public class Reiniciar implements IState{
    @Override
    public void computerBehavior(Computadora computadora) {
        computadora.getRam().setPorcentaje(0);
        computadora.getCpu().setPorcentaje(0);
        System.out.println("Estado: Reiniciar");
        computadora.getRam().showRam();
        computadora.getCpu().showCpu();
    }
}
