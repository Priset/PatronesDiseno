package singleton.practice_one;

public class LaunchShop {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Emanuel", "Lozano");
        cliente.setName("Arturo");
        cliente.getLast_name();

        Product producto = new Product("Manzana", 2);
        producto.setPrice(5);
        producto.getName_product();

        Factura factura = new Factura("712782hud",80);
        factura.setTotal(50);
        factura.getTotal();

        Promocion promocion = new Promocion("Verano",10);
        promocion.getName_promocion();
        promocion.setDescuento(80);
    }
}
