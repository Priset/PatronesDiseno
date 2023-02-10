package prototype.practice;

public class Sim {
    private String empresaTelefonica;
    private String numeroTelefono;

    public Sim(String empresaTelefonica, String numeroTelefono) {
        this.empresaTelefonica = empresaTelefonica;
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmpresaTelefonica() {
        return empresaTelefonica;
    }

    public void setEmpresaTelefonica(String empresaTelefonica) {
        this.empresaTelefonica = empresaTelefonica;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void showInfo(){
        System.out.println("Empresa telefonica: "+getEmpresaTelefonica());
        System.out.println("Número telefonico: "+getNumeroTelefono());
    }
}
