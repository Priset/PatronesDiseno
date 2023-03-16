package bridge.practiceGood;

public class Launch {
    public static void main(String[] args) {
        Windows windows = new Windows(new ArquitecturaX64());
        windows.buildArquitectura();
        windows.setArquitectura(new ArquitecturaX86());
        windows.buildArquitectura();

        Linux linux = new Linux(new ArquitecturaX86());
        linux.buildArquitectura();
        linux.setArquitectura(new ArquitecturaX128());
        linux.buildArquitectura();
    }
}
