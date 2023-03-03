package observer.practice;

public class Mensaje {
    private String titulo;

    public Mensaje(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void showMensaje(){
        System.out.println("Titulo: "+getTitulo());
    }
}
