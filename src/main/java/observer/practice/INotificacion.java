package observer.practice;

import java.util.List;

public interface INotificacion {
    void subscription(IUser user, List<String> category);
    void removeSubscription(IUser user);
    void notify(Mensaje mensaje);
}
