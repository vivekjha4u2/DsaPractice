package org.example.LowLevelDesign.VendingMachine.VendingStates;

import org.example.LowLevelDesign.VendingMachine.Coin;
import org.example.LowLevelDesign.VendingMachine.Item;
import org.example.LowLevelDesign.VendingMachine.VendingMachine;

import java.util.List;

public interface State {
    void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
    void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
    void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    void chooseProduct(VendingMachine machine, int code) throws Exception;
    int getChange(int returnChangeMoney) throws Exception;
    Item dispenseProduct(VendingMachine machine, int code) throws Exception;
    List<Coin> refundFullMoney(VendingMachine machine) throws Exception;
    void updateInventory(VendingMachine machine, Item item, int code) throws Exception;
}
