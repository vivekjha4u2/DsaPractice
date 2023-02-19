package org.example.LowLevelDesign.VendingMachine.VendingStates;

import org.example.LowLevelDesign.VendingMachine.Coin;
import org.example.LowLevelDesign.VendingMachine.Item;
import org.example.LowLevelDesign.VendingMachine.VendingMachine;

import java.util.List;

public class IdleState implements State{
    public IdleState() {
        System.out.println("In Idle State");
    }
    public IdleState(VendingMachine machine) {
        System.out.println("In Idle State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        //change state
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Cannot perform the action");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Cannot perform the action");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("Cannot perform the action");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Cannot perform the action");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("Cannot perform the action");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("Cannot perform the action");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int code) throws Exception {
//        machine.getInventory().machine
    }
}
