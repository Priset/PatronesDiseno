package composite.practice;

import java.util.Stack;

public class Help {
    private Stack<String> imprimir = new Stack<>();
    private int precioGlobal = 0;


    private static Help instance;

    private Help() {}

    public static Help getInstance() {
        if(instance == null) {
            instance = new Help();
        }
        return instance;
    }

    public void add(String info) {
        imprimir.push(info);
    }

    public int getStackSize() {
        return imprimir.size();
    }

    public void showInfo() {
        while(!imprimir.isEmpty()) {
            System.out.print(imprimir.pop());

        }

    }

    public int getPrecioGlobal() {
        return precioGlobal;
    }

    public void setPrecioGlobal(int precioGlobal) {
        this.precioGlobal = precioGlobal;
    }
}
