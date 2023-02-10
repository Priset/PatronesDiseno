package prototype.practice;

import java.util.List;

public class Celular implements ICelular{
    private String modelo;
    private String tamano;
    private int numeroCpu;
    private String versionAndroid;
    private String pixeles;
    private String bluetooth;
    private int memoriasExternas;
    private String consumoBateria;
    private String accesorios;

    private Sim sim;

    public Celular(String modelo, String tamano, int numeroCpu, String versionAndroid, String pixeles, String bluetooth, int memoriasExternas, String consumoBateria, String accesorios) {
        this.modelo = modelo;
        this.tamano = tamano;
        this.numeroCpu = numeroCpu;
        this.versionAndroid = versionAndroid;
        this.pixeles = pixeles;
        this.bluetooth = bluetooth;
        this.memoriasExternas = memoriasExternas;
        this.consumoBateria = consumoBateria;
        this.accesorios = accesorios;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getNumeroCpu() {
        return numeroCpu;
    }

    public void setNumeroCpu(int numeroCpu) {
        this.numeroCpu = numeroCpu;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getPixeles() {
        return pixeles;
    }

    public void setPixeles(String pixeles) {
        this.pixeles = pixeles;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getMemoriasExternas() {
        return memoriasExternas;
    }

    public void setMemoriasExternas(int memoriasExternas) {
        this.memoriasExternas = memoriasExternas;
    }

    public String getConsumoBateria() {
        return consumoBateria;
    }

    public void setConsumoBateria(String consumoBateria) {
        this.consumoBateria = consumoBateria;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public void showInfo(){
        System.out.println("Modelo celular: "+modelo);
        System.out.println("Tamaño celular: "+tamano);
        System.out.println("Número de Cpu celular: "+numeroCpu);
        System.out.println("Versión android celular: "+versionAndroid);
        System.out.println("Mega pixeles cámara: "+pixeles);
        System.out.println("Bluetooth celular: "+bluetooth);
        System.out.println("Memoria Externa celular: "+memoriasExternas);
        System.out.println("Capacidad Batería celular: "+consumoBateria);
        System.out.println("Accesorios celular: "+accesorios);
        sim.showInfo();
    }

    @Override
    public Celular clone() {

        Celular clone = new Celular(this.modelo,this.tamano,this.numeroCpu,
                this.versionAndroid,this.pixeles,this.bluetooth,this.memoriasExternas,
                this.consumoBateria,this.accesorios);

        clone.setSim(this.getSim());

        return clone;
    }
}
