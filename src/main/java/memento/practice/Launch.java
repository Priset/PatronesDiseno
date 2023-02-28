package memento.practice;

public class Launch {

    public static void main(String[] args) {

        Almacenamiento almacenamiento = new Almacenamiento();
        Versionador versionador = new Versionador();

        BDD baseDeDatos;

        baseDeDatos = new BDD(new Persona[]{new Persona("Joaquina", "7845165", 19), new Persona("Jose", "02154165", 17),
        new Persona("Jonas", "4185749", 20)});

        versionador.setBackup(baseDeDatos);
        almacenamiento.createBackup("BackupEnero", versionador.createBackup());

        baseDeDatos = new BDD(new Persona[]{new Persona("Arturo", "4894912", 24), new Persona("Javi", "9849849841", 35),
                new Persona("Tuqui", "45187191", 22)});

        versionador.setBackup(baseDeDatos);
        almacenamiento.createBackup("BackupFebrero", versionador.createBackup());

        baseDeDatos = new BDD(new Persona[]{new Persona("Dalas", "3324332", 19), new Persona("Javi", "7649576", 76),
                new Persona("Roberto", "389043", 32)});

        versionador.setBackup(baseDeDatos);
        almacenamiento.createBackup("BackupMarzo", versionador.createBackup());

        baseDeDatos = new BDD(new Persona[]{new Persona("Jhontan", "774717171", 29), new Persona("Queton", ".0230321", 41),
                new Persona("Parce", "979248", 40)});

        versionador.setBackup(baseDeDatos);
        almacenamiento.createBackup("BackupAbril", versionador.createBackup());

        baseDeDatos = new BDD(new Persona[]{new Persona("Patu", "1111412", 40), new Persona("Balu", "987984", 32),
                new Persona("Reyna", "98789152", 39)});

        versionador.setBackup(baseDeDatos);
        almacenamiento.createBackup("BackupFebrero", versionador.createBackup());

        baseDeDatos.showInfo();

        baseDeDatos = versionador.restoreBackup(almacenamiento.getBackup("BackupEnero"));

        baseDeDatos.showInfo();
    }

}


