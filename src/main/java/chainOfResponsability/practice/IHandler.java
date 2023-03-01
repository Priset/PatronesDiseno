package chainOfResponsability.practice;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    void fallo(Persona persona, String titulo, String severidad, String descripcion);
}
