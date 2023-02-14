package abstractFactory.practice;

public class LaunchPasaje {
    public static void main(String[] args) {
        String iPasaje="PasajeStandart";

        FactoryPasaje.make(iPasaje).showPasaje();
        /*
        PasajeStandart pS1 = new PasajeStandartCreator().create();
        PasajeStandart pS2 = new PasajeStandartCreator().create();

        PasajeSolidario pSo1 = new PasajeSolidarioCreator().create();
        PasajeSolidario pSo2 = new PasajeSolidarioCreator().create();

        PasajeInfantes pI1 = new PasajeInfantesCreator().create();
        PasajeInfantes pI2 = new PasajeInfantesCreator().create();

        System.out.println("********************************");
        pS1.getPasajero().setNombre("Claudio");
        pS1.getPasajero().setCi("78784999");
        pS1.setNumeroAsiento(54);
        pS1.showPasaje();
        System.out.println("************************");
        pS2.getPasajero().setNombre("Fercho");
        pS2.getPasajero().setCi("214");
        pS2.setNumeroAsiento(78);
        pS2.showPasaje();

        System.out.println("************************");
        pSo1.getPasajero().setNombre("Alberto");
        pSo1.getPasajero().setCi("54658");
        pSo1.setNumeroAsiento(14);
        pSo1.showPasaje();
        System.out.println("************************");
        pSo2.getPasajero().setNombre("Jhonathan");
        pSo2.getPasajero().setCi("487922");
        pSo2.setNumeroAsiento(96);
        pSo2.showPasaje();

        System.out.println("************************");
        pI1.getPasajero().setNombre("Sophia");
        pI1.getPasajero().setCi("1111111");
        pI1.setNumeroAsiento(11);
        pI1.showPasaje();
        System.out.println("************************");
        pI2.getPasajero().setNombre("Lucian");
        pI2.getPasajero().setCi("200202");
        pI2.setNumeroAsiento(3);
        pI2.showPasaje();
         */
    }
}
