package composite.practice;

public class Launch {
    public static void main(String[] args) {
        Computadora c1 = new Computadora("Computadora",  "Hp", "Medio");
        Computadora c2 = new Computadora("Computadora","Lenovo", "Medio");
        Computadora c3 = new Computadora("Computadora", "Asus", "Alto");
        Computadora c4 = new Computadora("Computadora","Asus", "Alto");
        Computadora c5 = new Computadora("Computadora","Asus", "Alto");
        Computadora c6 = new Computadora("Computadora","Lenovo", "Bajo");

        Composite laboratorio1 = new Composite("Laboratorio");
        Composite laboratorio2 = new Composite("Laboratorio");

        laboratorio1.add(c1);
        laboratorio1.add(c2);
        laboratorio1.add(c3);

        laboratorio2.add(c4);
        laboratorio2.add(c5);
        laboratorio2.add(c6);


        Composite contenedor1 = new Composite("ContenedorComputadora");

        contenedor1.setEspacio("");

        contenedor1.add(laboratorio1);
        contenedor1.add(laboratorio2);

        contenedor1.setUltimo(true);

        contenedor1.calcularPrecio();
        System.out.println("Total: " + Help.getInstance().getPrecioGlobal());

    }
}
