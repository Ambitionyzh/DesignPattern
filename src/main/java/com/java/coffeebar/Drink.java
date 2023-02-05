package com.java.coffeebar;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 饮品
 * @date 2023/2/5 9:34
 */
public abstract class Drink {
    public String description="";
    private float price = 0f;

    public String getDescription() {
        return description + "--" + this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public  abstract  float cost();
}
