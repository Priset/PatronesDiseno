package state.practice;

public class Prendido implements IState{
    @Override
    public void computerBehavior(Computadora computadora) {
    int usoActualRam = computadora.getRam().getPorcentaje();
    int usoActualCPU = computadora.getCpu().getPorcentaje();

        while (computadora.getRam().getPorcentaje() < 100 || computadora.getCpu().getPorcentaje() < 100) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (computadora.getProgramasAbiertos().equals("Fornite")) {
            usoActualRam = usoActualRam + 40;
            computadora.getRam().setPorcentaje(usoActualRam);
            computadora.getRam().showRam();

            usoActualCPU = usoActualCPU + 40;
            computadora.getCpu().setPorcentaje(usoActualCPU);
            computadora.getCpu().showCpu();
        } else if (computadora.getProgramasAbiertos().equals("Sons of the forest")) {
            usoActualRam = usoActualRam + 50;
            computadora.getRam().setPorcentaje(usoActualRam);
            computadora.getRam().showRam();

            usoActualCPU = usoActualCPU + 50;
            computadora.getCpu().setPorcentaje(usoActualCPU);
            computadora.getCpu().showCpu();
        } else if (computadora.getProgramasAbiertos().equals("Firefox")) {
            usoActualRam = usoActualRam + 5;
            computadora.getRam().setPorcentaje(usoActualRam);
            computadora.getRam().showRam();

            usoActualCPU = usoActualCPU + 5;
            computadora.getCpu().setPorcentaje(usoActualCPU);
            computadora.getCpu().showCpu();
        } else if (computadora.getProgramasAbiertos().equals("Warzone")) {
            usoActualRam = usoActualRam + 30;
            computadora.getRam().setPorcentaje(usoActualRam);
            computadora.getRam().showRam();

            usoActualCPU = usoActualCPU + 30;
            computadora.getCpu().setPorcentaje(usoActualCPU);
            computadora.getCpu().showCpu();
        }
        if (usoActualRam > 100) {
            computadora.getRam().setPorcentaje(100);
            System.out.println("Uso actual de la RAM al 100%");
        }
        if (usoActualCPU > 100) {
            computadora.getCpu().setPorcentaje(100);
            System.out.println("Uso actual de la CPU al 100%");
        }
    }
        System.out.println("Maximo rendimiento de la computadora.");
}
}
