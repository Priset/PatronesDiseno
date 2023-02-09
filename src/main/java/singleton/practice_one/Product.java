package singleton.practice_one;

public class Product {

    private String name_product;
    private int price;

    public Product(String name_product, Integer price) {
        this.name_product = name_product;
        this.price = price;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
