package com.cafe;
public interface CoffeeOrder
{
    // String selectCoffee(String coffeeType);
    public String selectCoffee();
    // String selectSize(String size);
    public String selectSize();
    public void displayOrder();
    public int getPrice();
}