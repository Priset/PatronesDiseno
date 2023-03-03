package observer.practice;

import java.util.List;

public interface IUser {
    void update(String info, Mensaje mensaje);
    void setTypeNotification(List<String> type);
    List<String> getTypeNotification();
}
