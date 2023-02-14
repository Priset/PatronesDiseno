package abstractFactory.practice;

public class FactoryPasaje {
    public static IPasaje make(String type){
        IPasaje iPasaje;
        switch (type.toLowerCase()) {
            case "pasajesolidario":
                iPasaje = new PasajeSolidario();
                break;
            case "pasajeinfantes":
                iPasaje = new PasajeInfantes();
                break;
            default:
                iPasaje = new PasajeStandart();
                break;
        }
        return iPasaje;
    }
}
