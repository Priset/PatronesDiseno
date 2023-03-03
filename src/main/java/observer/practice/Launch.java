package observer.practice;

import java.util.List;

public class Launch {
    public static void main(String[] args) {
        Notificacion compania = new Notificacion();
        compania.setTitulo("Tigo");

        Usuario user1 = new Usuario("78FD19","Roman");
        Usuario user2 = new Usuario("898RDSR","Jonas");
        Usuario user3 = new Usuario("121321SDR","Alberto");

        compania.subscription(user1, List.of("premios", "promociones"));
        compania.subscription(user2, List.of("noticia"));
        compania.subscription(user3, List.of("precios llamadas", "promociones", "premios", "noticia"));

        compania.addMensaje(new Mensaje("premios"));
    }
}
