package prototype.practice;

public class LaunchCelular {

    public static void main(String[] args) {

        Celular venta = new Celular("Samsumg R10",
                "38 x 57 mm",2,"4.4.2",
                "5.3 MP","Si",1,
                "1000 mAh","Audifono, Cargador, Estuche");
        venta.setSim(new Sim("Tigo","76710956"));
        System.out.println("********************ONE*******************");
        venta.showInfo();
        System.out.println("*******************TWO********************");
        Celular venta1 = venta.clone();
        venta1.setSim(new Sim("Entel","7845785"));
        venta1.showInfo();
        System.out.println("******************THREE*********************");
        Celular venta2 = venta.clone();
        venta2.setSim(new Sim("Viva","695960"));
        venta2.showInfo();
        System.out.println("******************FOUR*********************");
        Celular venta3 = venta.clone();
        venta3.setSim(new Sim("Telcel","32334"));
        venta3.showInfo();
        System.out.println("*******************FIVE********************");
        Celular venta4 = venta.clone();
        venta4.setSim(new Sim("Cotel","568960"));
        venta4.showInfo();
        System.out.println("*******************FINISH********************");
    }
}
