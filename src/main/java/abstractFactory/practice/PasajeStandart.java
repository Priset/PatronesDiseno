package abstractFactory.practice;

public class PasajeStandart extends IPasaje{
    private Destino destino = new Destino("","","");
    private Origen origen = new Origen("","","");
    private Avion avion = new Avion("","","","");
    private Pasajero pasajero = new Pasajero("","");
    private String costoPasaje;

    public PasajeStandart() {}

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(String costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    @Override
    public void showPasaje() {
        System.out.println(" *** Pasaje Standart ***");
        System.out.println("Número de vuelo: "+getNumeroVuelo());
        destino.showInfo();
        origen.showInfo();
        avion.showInfo();
        pasajero.showInfo();
        System.out.println("Número de asiento: "+getNumeroAsiento());
        System.out.println("Costo de pasaje: "+getCostoPasaje());
    }
}
