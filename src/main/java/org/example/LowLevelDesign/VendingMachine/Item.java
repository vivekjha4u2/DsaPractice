package org.example.LowLevelDesign.VendingMachine;

public class Item {
    private ItemType itemType;
    private Double price;

    public Item(ItemType itemType, Double price) {
        this.itemType = itemType;
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
