package abstractFactory.practice;

public class PasajeSolidario extends IPasaje{
    private int numeroVuelo;
    private Destino destino = new Destino();
    private Origen origen = new Origen();
    private Avion avion = new Avion();
    private Pasajero pasajero = new Pasajero();
    private int numeroAsiento;
    private String costoPasaje;
    private String descuento;
    private String motivoDescuento;

    public PasajeSolidario() {}

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

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

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(String costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }

    @Override
    public void showPasaje() {
        System.out.println(" *** Pasaje Solidario ***");
        System.out.println("Número de vuelo: "+getNumeroVuelo());
        destino.showInfo();
        origen.showInfo();
        avion.showInfo();
        pasajero.showInfo();
        System.out.println("Número de asiento: "+getNumeroAsiento());
        System.out.println("Costo de pasaje: "+getCostoPasaje());
        System.out.println("Descuento: "+getDescuento());
        System.out.println("Motivo descuento: "+getMotivoDescuento());
    }
}
