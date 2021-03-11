public class ShoppingList{

    double sum;
    Product[] products = new Product[]
            {
                    new Product(9, "Socken"),
                    new Product(2.4, "Milch"),
                    new Product(4.5, "Erdbeeren"),
                    new Product(1.5, "Banane")

            };

    public void Start(){
        for (Product p: products) {
            System.out.println(p);
            sum += p.getPrice();
        }
        System.out.println("------------------");
        System.out.println("Gesamtpreis: "+sum);

    }

}
