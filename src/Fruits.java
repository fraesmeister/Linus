public class Fruits { // TODO: change name of class to Fruit (use refactor->rename so that all references get updated automatically)
    private String name;
    private Integer price;

    /**
     * Fields are now private, which means that only the class has direct access to them
     * The class exposes the following methods to allow for manipulation of fields (read with get and write with set)
     * This way, a field could just have a get method but not a set method, which means that only this class can actually
     * write its values but other classes could read the value. This is called encapsulation.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
