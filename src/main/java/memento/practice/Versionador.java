package memento.practice;

public class Versionador {
    private BDD state;

    public void setBackup(BDD state) {this.state = state;}

    public Backup createBackup() {return new Backup(state);}

    public BDD restoreBackup(Backup backup) {
        System.out.println("****RESTAURACIÓN****");
        this.state = backup.getState();
        return this.state;
    }

}
