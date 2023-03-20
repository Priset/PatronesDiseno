package composite.practice;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> computerComponentList = new ArrayList<>();

    public Composite(String type) {super(type);}

    @Override
    public String showInfo() {
        return getEspacio() + getTipo() +": \n" + getEspacio()+ "-Precio: " + getPrecio() + "\n";
    }

    @Override
    public void calcularPrecio() {

        for(Component computerComponent : computerComponentList) {
            computerComponent.calcularPrecio();
            this.setPrecio(this.getPrecio() + computerComponent.getPrecio());
        }
        Help.getInstance().add(this.showInfo());

        if(isUltimo()) {

            Help.getInstance().showInfo();
            Help.getInstance().setPrecioGlobal(Help.getInstance().getPrecioGlobal() + this.getPrecio());
        }
    }

    @Override
    public void add(Component component) {
        computerComponentList.add(component);
    }

    @Override
    public void remove(Component component) {
        computerComponentList.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return computerComponentList.get(index);
    }
}
