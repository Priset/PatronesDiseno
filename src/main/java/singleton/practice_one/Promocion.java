package singleton.practice_one;

public class Promocion {

    private String name_promocion;
    private int descuento;

    public Promocion(String name_promocion, int descuento){
        this.name_promocion = name_promocion;
        this.descuento = descuento;
    }

    public String getName_promocion() {
        return name_promocion;
    }

    public void setName_promocion(String name_promocion) {
        this.name_promocion = name_promocion;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
