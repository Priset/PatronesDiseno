package bridge.practiceWhitBadUse;

public class Launch {
    public static void main(String[] args) {
        Windows windows = new Windows();
        windows.windows7X64();
        windows.linuxX64();
        windows.windows7X128();

        Linux linux = new Linux();
        linux.linuxX64();
        linux.windows7X86();
        linux.linuxX128();
    }
}
