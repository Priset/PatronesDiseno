package singleton.practice1;

public class LaunchEmpresa {
    public static void main(String[] args) {
        System.out.println("***********************");
        LibreCambista libreCambista = new LibreCambista(70);
        libreCambista.cambioBolivianoDolar();
        libreCambista.cambioBolivianoEuro();
        libreCambista.cambioDolarBoliviano();
        libreCambista.cambioDolarEuro();
        libreCambista.cambioEuroDolar();
        libreCambista.cambioEuroBoliviano();

        System.out.println("***********************");
        CasaCambio casaCambio = new CasaCambio(100);
        casaCambio.cambioBolivianoDolar();
        casaCambio.cambioBolivianoEuro();
        casaCambio.cambioDolarBoliviano();
        casaCambio.cambioDolarEuro();
        casaCambio.cambioEuroDolar();
        casaCambio.cambioEuroBoliviano();

        System.out.println("***********************");
        Banco banco = new Banco(20);
        banco.cambioBolivianoDolar();
        banco.cambioBolivianoEuro();
        banco.cambioDolarBoliviano();
        banco.cambioDolarEuro();
        banco.cambioEuroDolar();
        banco.cambioEuroBoliviano();

        System.out.println("***********************");
        Cliente cliente = new Cliente("Pablo","69696969");
        cliente.showInfo();
        cliente.cambioABolivianos(70,20);


    }
}
