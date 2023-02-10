package prototype.practice;

public class LaunchCelular {

    public static void main(String[] args) {
        CelularVendido venta = new CelularVendido(
                new Celular("Samsumg R10",
                        "38 x 57 mm",2,"4.4.2",
                        "5.3 MP","Si",1,
                        "1000 mAh","Audifono, Cargador, Estuche"),
                new Sim("Tigo","76710956")
        );

        venta.showInfo();

        //CelularVendido venta1 = new venta.clone();
    }
}
