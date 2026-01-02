package az.idtech.nijat.mitderm2.task4;

public class ElectronicsProduct {

    private Long productID;
    private double price;
    private int discount;

    public void discount(int amount) {
        discount = Math.min(100, discount + amount);
    }

    public double calculateFinalPrice() {
        return (price * (100 - discount)) / 100;
    }
}
