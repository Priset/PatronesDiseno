package state.practice;

public class Apagado implements IState{
    @Override
    public void computerBehavior(Computadora computadora) {
        computadora.getRam().setPorcentaje(1);
        computadora.getCpu().setPorcentaje(1);
        System.out.println("Estado: Apagado");
        computadora.getRam().showRam();
        computadora.getCpu().showCpu();
    }
}
