/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        changeHistory.add(getBalance());
        
    }
    
    public String history(){
        return changeHistory.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        if (amount < 0) {
            return 0.0;
        }
        if (amount > getBalance()) {
            double allThatWeCan = getBalance();
            super.addToWarehouse(allThatWeCan);
            changeHistory.add(getBalance());
            return allThatWeCan;
        }

        super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return amount;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }
}
