public class Product implements iBuyable{

    private double price;
    private String productName;

    public String getProductName() {
        return productName;
    }

    public Product(double price, String productName){
        this.price = price;
        this.productName = productName;
    }

    public String toString(){
        return getProductName()+" "+getPrice();
    }

    @Override
    public double getPrice() {
        return price;
    }
}
