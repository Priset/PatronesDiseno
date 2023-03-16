package bridge.practiceWhitBadUse;

public class Windows implements IPlataforma{
    @Override
    public void windows7X86() {
        System.out.println("Ejecutando Windows7X86");
    }

    @Override
    public void windows7X64() {
        System.out.println("Ejecutando Windows7X64");
    }

    @Override
    public void windows7X128() {
        System.out.println("Ejecutando Windows7X128");
    }

    @Override
    public void linuxX86() {
        System.out.println("***********ERROR SISTEMA INVALIDO**************");
    }

    @Override
    public void linuxX64() {
        System.out.println("***********ERROR SISTEMA INVALIDO**************");
    }

    @Override
    public void linuxX128() {
        System.out.println("***********ERROR SISTEMA INVALIDO**************");
    }
}
