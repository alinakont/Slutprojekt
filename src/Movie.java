public class Movie extends Categories {
    protected String category;
    protected String name;
    protected double price;
    protected int quantity;
    protected int ageLimit;
    protected String release;

    Movie(String category, String name, double price, int quantity, int ageLimit, String release) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageLimit = ageLimit;
        this.release = release;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public void setRelease(String release) {
        this.release = release;
    }
}
