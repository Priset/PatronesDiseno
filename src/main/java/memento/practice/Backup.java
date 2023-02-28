package memento.practice;

public class Backup {
    private BDD state;

    public Backup(BDD baseDeDatos) {this.state = baseDeDatos;}

    public BDD getState() {return this.state;}

}
