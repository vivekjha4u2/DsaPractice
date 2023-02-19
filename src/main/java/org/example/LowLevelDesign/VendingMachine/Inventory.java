package org.example.LowLevelDesign.VendingMachine;

public class Inventory {
    ItemShelf [] inventory = null;

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    void initializeEmptyInventory(){

    }
    void addItem(){

    }
    void getItem(){}
    void updateSoldOutItem(){}
}
