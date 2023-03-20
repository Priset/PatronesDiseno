package decorator.practice;

public class Launch {
    public static void main(String[] args) {
        Automovil minibus = new Minibus("88SDSDF", "300mps", true);

        minibus = new Turbo(minibus, 1500);
        minibus = new Gps(minibus, 300);
        minibus = new TanqueGas(minibus, 2000);

        minibus.operacion();
        System.out.println("*************************");

        Automovil taxi = new Taxi("98994DSAS", "180mps", true);

        taxi = new TanqueGas(taxi, 350);

        taxi.operacion();
        System.out.println("*************************");

        Automovil vagoneta = new Vagoneta("1111SDAS", "210mps", false);

        vagoneta = new Turbo(vagoneta, 2050);
        vagoneta = new Gps(vagoneta, 7500);

        vagoneta.operacion();
        System.out.println("*************************");
    }
}
