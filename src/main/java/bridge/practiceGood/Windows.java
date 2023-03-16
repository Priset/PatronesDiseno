package bridge.practiceGood;

public class Windows implements IPlataforma{
    private IArquitectura arquitectura;

    public Windows(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    public IArquitectura getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void buildArquitectura() {
        System.out.println("Ejecutando Windows en: ");
        this.arquitectura.buildArquitectura();
    }
}
