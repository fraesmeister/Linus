public class Fruits implements Comparable<Fruits>{

    private String name;
    private int price;

    public Fruits(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " +  price;
    }

    @Override
    public int compareTo(Fruits tmp) {
        return price-tmp.getPrice();
    }

}
