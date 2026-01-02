package az.idtech.nijat.mitderm2.task4;

public class WashingMachine extends ElectronicsProduct {

    private int warranty; // years

    public void extendWarranty(int years) {
        warranty += years;
    }
}
