package factoryMethod.practice;

public class PasajeStandartCreator extends CreatorPasaje{
    @Override
    public PasajeStandart create() {
        PasajeStandart pasaje = new PasajeStandart();
        pasaje.setNumeroVuelo(23);

        Destino destino = new Destino();
        destino.setAeropuerto("Viru Viru");
        destino.setCiudad("Cochabamba");
        destino.setPais("Bolivia");
        pasaje.setDestino(destino);

        Origen origen = new Origen();
        origen.setAeropuerto("Coronilla");
        origen.setCiudad("Pando");
        origen.setPais("Bolivia");
        pasaje.setOrigen(origen);

        Avion avion = new Avion();
        avion.setCapacidad("200 personas");
        avion.setMarca("Toyota");
        avion.setModelo("F43");
        avion.setNumeroAsientos("200 asientos");
        pasaje.setAvion(avion);

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Pedro");
        pasajero.setCi("8794669");
        pasaje.setPasajero(pasajero);

        pasaje.setNumeroAsiento(87);
        pasaje.setCostoPasaje("125 Bs");

        return pasaje;
    }
}
