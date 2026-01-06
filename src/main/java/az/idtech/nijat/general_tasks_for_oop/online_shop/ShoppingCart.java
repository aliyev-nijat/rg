package az.idtech.nijat.general_tasks_for_oop.online_shop;

public class ShoppingCart {

    CardItem[] items;

    public ShoppingCart() {
        this.items = new CardItem[10];
    }

    public CardItem addItem(CardItem cardItem) {
        if (
                cardItem == null ||
                        cardItem.getProduct() == null ||
                        cardItem.getQuantity() <= 0
        ) {
            System.out.println("invalid parameter");
            return null;
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) continue;

            return items[i] = cardItem;
        }
        CardItem[] newList = new CardItem[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            newList[i] = items[i];
        }
        this.items = newList;

        return addItem(cardItem);
    }

    public void removeItem(CardItem cardItem) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == cardItem) {
                items[i] = null;

                return;
            }
        }
    }

    public double getTotalPrice() {
        double sum = 0;
        for (CardItem item : items) {
            if (item == null) continue;
            sum += item.getQuantity() * item.getProduct().getPrice();
        }

        return sum;
    }
}
