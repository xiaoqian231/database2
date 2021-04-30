public class orders {
    private int id;
    private String city;
    private String street;
    private String products;
    private String name;

    public orders() {
    }

    public orders(int id, String city, String street, String products, String name) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.products = products;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
