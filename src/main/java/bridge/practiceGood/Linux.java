package bridge.practiceGood;

public class Linux implements IPlataforma{
    private IArquitectura arquitectura;

    public Linux(IArquitectura arquitectura) {
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
        System.out.println("Ejecutando Linux en: ");
        this.arquitectura.buildArquitectura();
    }
}
