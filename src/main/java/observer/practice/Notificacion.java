package observer.practice;

import java.util.ArrayList;
import java.util.List;

public class Notificacion implements INotificacion{
    private String titulo;
    private List<IUser> userList = new ArrayList<>();
    private List<Mensaje> mensajes = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void addMensaje(Mensaje mensajes) {
        this.mensajes.add(mensajes);
        this.notify(mensajes);
    }

    @Override
    public void subscription(IUser user, List<String> category) {
        user.setTypeNotification(category);
        userList.add(user);
    }

    @Override
    public void removeSubscription(IUser user) {
        userList.remove(user);
    }

    @Override
    public void notify(Mensaje mensaje) {
        for (IUser user: userList){
            if (user.getTypeNotification().contains(mensaje.getTitulo())){
                user.update("Notificación: ["+getTitulo()+"] envia un anuncio.", mensaje);
            }
        }
    }
}
