package memento.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Almacenamiento {

    private Map<String, Backup> backups = new LinkedHashMap<>();

    public void createBackup(String backupAlias, Backup backup) {backups.put(backupAlias, backup);}

    public Backup getBackup(String backupAlias) {return backups.get(backupAlias);}
}
