package abstractFactory.practice;

public class LaunchPasaje {
    public static void main(String[] args) {
        String pasajeStandart1="PasajeStandart";
        String pasajeStandart2="PasajeStandart1";
        FactoryPasaje.make(pasajeStandart1).showPasaje();
        FactoryPasaje.make(pasajeStandart2).showPasaje();

        System.out.println("********************************");

        String pasajeSolidario1="PasajeSolidario";
        String pasajeSolidario2="PasajeSolidario1";
        FactoryPasaje.make(pasajeSolidario1).showPasaje();
        FactoryPasaje.make(pasajeSolidario2).showPasaje();

        System.out.println("********************************");

        String pasajeInfantes1="PasajeInfantes";
        String pasajeInfantes2="PasajeInfantes1";
        FactoryPasaje.make(pasajeInfantes1).showPasaje();
        FactoryPasaje.make(pasajeInfantes2).showPasaje();

        System.out.println("********************************");

    }
}
