package abstractFactory.practice;

public class FactoryPasaje {
    public static IPasaje make(String type){
        IPasaje iPasaje;
        switch (type.toLowerCase()) {
            case "pasajesolidario":
                iPasaje = new PasajeSolidario();
                ((PasajeSolidario)iPasaje).setAvion(new Avion("Toyota", "200 personas", "F43", "200 asientos"));
                ((PasajeSolidario)iPasaje).setPasajero(new Pasajero("Claudio","78784999"));
                ((PasajeSolidario)iPasaje).setOrigen(new Origen("Bolivia","Pando", "Coronilla"));
                    ((PasajeSolidario)iPasaje).setDestino(new Destino("Bolivia", "Cochabamba", "Viru Viru"));
                iPasaje.setNumeroVuelo(23);
                iPasaje.setNumeroAsiento(87);
                ((PasajeSolidario)iPasaje).setCostoPasaje("125 Bs");
                ((PasajeSolidario)iPasaje).setDescuento("25%");
                ((PasajeSolidario)iPasaje).setMotivoDescuento("Apoyo economico");
                break;
            case "pasajesolidario1":
                iPasaje = new PasajeSolidario();
                ((PasajeSolidario)iPasaje).setAvion(new Avion("Toyota", "200 personas", "F43", "200 asientos"));
                ((PasajeSolidario)iPasaje).setPasajero(new Pasajero("Jhonatan","55555"));
                ((PasajeSolidario)iPasaje).setOrigen(new Origen("Bolivia","Pando", "Coronilla"));
                ((PasajeSolidario)iPasaje).setDestino(new Destino("Bolivia", "Cochabamba", "Viru Viru"));
                iPasaje.setNumeroVuelo(123);
                iPasaje.setNumeroAsiento(78);
                ((PasajeSolidario)iPasaje).setCostoPasaje("125 Bs");
                ((PasajeSolidario)iPasaje).setDescuento("25%");
                ((PasajeSolidario)iPasaje).setMotivoDescuento("Apoyo economico");
                break;
            case "pasajeinfantes":
                iPasaje = new PasajeInfantes();
                ((PasajeInfantes)iPasaje).setAvion(new Avion("Force", "100 personas", "F123", "105 personas"));
                ((PasajeInfantes)iPasaje).setPasajero(new Pasajero("Sophia","121313"));
                ((PasajeInfantes)iPasaje).setOrigen(new Origen("Bolivia","Potosi", "Coronel"));
                ((PasajeInfantes)iPasaje).setDestino(new Destino("Argentina", "Buenos Aires", "Corona"));
                iPasaje.setNumeroVuelo(76);
                iPasaje.setNumeroAsiento(24);
                ((PasajeInfantes)iPasaje).setCostoEspecial("100 Bs");
                break;
            case "pasajeinfantes1":
                iPasaje = new PasajeInfantes();
                ((PasajeInfantes)iPasaje).setAvion(new Avion("Force", "100 personas", "F123", "105 personas"));
                ((PasajeInfantes)iPasaje).setPasajero(new Pasajero("Ana","32325"));
                ((PasajeInfantes)iPasaje).setOrigen(new Origen("Bolivia","Potosi", "Coronel"));
                ((PasajeInfantes)iPasaje).setDestino(new Destino("Argentina", "Buenos Aires", "Corona"));
                iPasaje.setNumeroVuelo(24);
                iPasaje.setNumeroAsiento(52);
                ((PasajeInfantes)iPasaje).setCostoEspecial("100 Bs");
                break;
            case "pasajestandart":
                iPasaje = new PasajeStandart();
                ((PasajeStandart)iPasaje).setAvion(new Avion("AirPlane", "300 personas", "F23", "300 asientos"));
                ((PasajeStandart)iPasaje).setPasajero(new Pasajero("Carlos","707077"));
                ((PasajeStandart)iPasaje).setOrigen(new Origen("Bolivia","Santa Cruz", "Viru Viru"));
                ((PasajeStandart)iPasaje).setDestino(new Destino("Brazil", "Rio de Janeiro", "Franco"));
                iPasaje.setNumeroAsiento(59);
                iPasaje.setNumeroVuelo(78);
                ((PasajeStandart)iPasaje).setCostoPasaje("200 Bs");
                break;
            default:
                iPasaje = new PasajeStandart();
                ((PasajeStandart)iPasaje).setAvion(new Avion("AirPlane", "300 personas", "F23", "300 asientos"));
                ((PasajeStandart)iPasaje).setPasajero(new Pasajero("Jhoni","7818877"));
                ((PasajeStandart)iPasaje).setOrigen(new Origen("Bolivia","Santa Cruz", "Viru Viru"));
                ((PasajeStandart)iPasaje).setDestino(new Destino("Brazil", "Rio de Janeiro", "Franco"));
                iPasaje.setNumeroAsiento(52);
                iPasaje.setNumeroVuelo(5);
                ((PasajeStandart)iPasaje).setCostoPasaje("200 Bs");
                break;
        }
        return iPasaje;
    }
}
