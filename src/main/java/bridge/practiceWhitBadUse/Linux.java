package bridge.practiceWhitBadUse;

public class Linux implements IPlataforma {
    @Override
    public void windows7X86() {
        System.out.println("***********ERROR SISTEMA INVALIDO**************");
    }

    @Override
    public void windows7X64() {
        System.out.println("***********ERROR SISTEMA INVALIDO**************");
    }

    @Override
    public void windows7X128() {
        System.out.println("***********ERROR SISTEMA INVALIDO**************");
    }

    @Override
    public void linuxX86() {
        System.out.println("Ejecutando LinuxX86");
    }

    @Override
    public void linuxX64() {
        System.out.println("Ejecutando LinuxX64");
    }

    @Override
    public void linuxX128() {
        System.out.println("Ejecutando LinuxX128");
    }
}
