package adapter.practice;

public class AdapterEmpresa implements IWeb {
    private Empresa1 empresa1;

    public AdapterEmpresa(Empresa1 empresa1) {
        this.empresa1 = empresa1;
    }

    @Override
    public void iniciarSesion() {
        empresa1.login();
    }

    @Override
    public void cerrarSesion() {
        empresa1.logout();
    }

    @Override
    public void generacionDatos(String reporte) {
        empresa1.report(reporte);
    }

}
