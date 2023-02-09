package singleton.practice_one;

public class Cliente {
        private String name;
        private String last_name;

        public Cliente(String name, String last_name) {
            Logger.getInstance().registro("Create instance : "+name+last_name);
            this.name = name;
            this.last_name = last_name;
        }

    public String getName() {
        Logger.getInstance().registro("get name : Nombre "+name);
        return name;
    }

    public void setName(String name) {
        Logger.getInstance().registro("set name : Nombre "+name);
        this.name = name;
    }

    public String getLast_name() {
        Logger.getInstance().registro("get last name : Apellido "+last_name);
        return last_name;
    }

    public void setLast_name(String name) {
        Logger.getInstance().registro("set last name : Apellido "+last_name);
        this.name = last_name;
    }
}
