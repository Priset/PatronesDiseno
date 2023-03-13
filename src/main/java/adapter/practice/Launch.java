package adapter.practice;

public class Launch {
    public static void main(String[] args) {
        Empresa1 dradler = new Empresa1("Dradler SRL");
        Empresa2 aurora = new Empresa2("Aurora", "upd.edu");

        aurora.iniciarSesion();

        AdapterEmpresa aurora2 = new AdapterEmpresa(dradler);
        aurora2.iniciarSesion();

        aurora.generacionDatos("El business model canvas esta acabado");
        aurora2.generacionDatos("FNOSFNO");

        aurora.cerrarSesion();
        aurora2.cerrarSesion();
    }
}
