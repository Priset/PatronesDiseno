package mediator.practice;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion{
    private Map<String, Persona> profesionalChat = new HashMap<>();
    public Skype addToChat(String ci,Persona profesional){
        profesionalChat.put(ci, profesional);
        return this;
    }
    @Override
    public void send(String mensaje, Persona colleague) {
        for (String profesional : profesionalChat.keySet()) {
            if (!colleague.getCi().equals(profesional)) {
                if (colleague.getCargo().equals("QA") && profesionalChat.get(profesional).getCargo().equals("QA")) {
                    profesionalChat.get(profesional).recibir(mensaje);
                } else if (colleague.getCargo().equals("Dev") && profesionalChat.get(profesional).getCargo().equals("Dev")) {
                    profesionalChat.get(profesional).recibir(mensaje);
                } else if (colleague.getCargo().equals("SM")) {
                    profesionalChat.get(profesional).recibir(mensaje);
                }
            }
        }
    }
}
