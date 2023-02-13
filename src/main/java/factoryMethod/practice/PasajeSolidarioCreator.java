package factoryMethod.practice;

public class PasajeSolidarioCreator extends CreatorPasaje{
    @Override
    public PasajeSolidario create() {
        PasajeSolidario pasaje = new PasajeSolidario();
        pasaje.setNumeroVuelo(5);

        Destino destino = new Destino();
        destino.setAeropuerto("Franco");
        destino.setCiudad("Rio de Janeiro");
        destino.setPais("Brazil");
        pasaje.setDestino(destino);

        Origen origen = new Origen();
        origen.setAeropuerto("Viru Viru");
        origen.setCiudad("Santa Cruz");
        origen.setPais("Bolivia");
        pasaje.setOrigen(origen);

        Avion avion = new Avion();
        avion.setCapacidad("300 personas");
        avion.setMarca("AirPlane");
        avion.setModelo("F23");
        avion.setNumeroAsientos("300 asientos");
        pasaje.setAvion(avion);

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Juan");
        pasajero.setCi("789415");
        pasaje.setPasajero(pasajero);

        pasaje.setNumeroAsiento(52);
        pasaje.setCostoPasaje("200 Bs");
        pasaje.setDescuento("25%");
        pasaje.setMotivoDescuento("Apoyo economico");

        return pasaje;
    }
}
