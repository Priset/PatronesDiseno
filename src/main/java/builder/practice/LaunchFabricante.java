package builder.practice;

public class LaunchFabricante {
    public static void main(String[] args) {
        Fabricante fabricante = new Fabricante();
        ComputadoraI9 i9 = new ComputadoraI9();
        ComputadoraI7 i7 = new ComputadoraI7();
        ComputadoraI5 i5 = new ComputadoraI5();

        fabricante.setTipoComputadora(i9);
        fabricante.buildComputadora();

        Computadora computadora = fabricante.getComputadora();
        System.out.println("********Computadora i9**********");
        computadora.showComputadora();

        fabricante.setTipoComputadora(i7);
        fabricante.buildComputadora();

        Computadora computadora2 = fabricante.getComputadora();
        System.out.println("********Computadora i7**********");
        computadora2.showComputadora();

        fabricante.setTipoComputadora(i5);
        fabricante.buildComputadora();

        Computadora computadora3 = fabricante.getComputadora();
        System.out.println("********Computadora i5**********");
        computadora3.showComputadora();
        System.out.println("********FIN**********");
    }
}
