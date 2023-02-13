package factoryMethod.practice;

public class PasajeInfantesCreator extends CreatorPasaje{
    @Override
    public PasajeInfantes create() {
        PasajeInfantes pasaje = new PasajeInfantes();
        pasaje.setNumeroVuelo(76);

        Destino destino = new Destino();
        destino.setAeropuerto("Corona");
        destino.setCiudad("Buenos Aires");
        destino.setPais("Argentina");
        pasaje.setDestino(destino);

        Origen origen = new Origen();
        origen.setAeropuerto("Coronel");
        origen.setCiudad("Potosi");
        origen.setPais("Bolivia");
        pasaje.setOrigen(origen);

        Avion avion = new Avion();
        avion.setCapacidad("100 personas");
        avion.setMarca("Force");
        avion.setModelo("F123");
        avion.setNumeroAsientos("100 asientos");
        pasaje.setAvion(avion);

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Pablo");
        pasajero.setCi("12355");
        pasaje.setPasajero(pasajero);

        pasaje.setNumeroAsiento(24);
        pasaje.setCostoEspecial("100 Bs");

        return pasaje;
    }
}
