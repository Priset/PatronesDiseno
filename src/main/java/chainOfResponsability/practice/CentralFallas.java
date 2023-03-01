package chainOfResponsability.practice;

public class CentralFallas implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void fallo(Persona persona, String titulo, String severidad, String descripcion) {
        TeamSoporte teamSoporte = new TeamSoporte();
        PO po = new PO();
        QA qa = new QA();
        DEV dev = new DEV();

        this.setNext(teamSoporte);
        teamSoporte.setNext(po);
        po.setNext(qa);
        qa.setNext(dev);

        this.next.fallo(persona, titulo, severidad, descripcion);
    }
}
