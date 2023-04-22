package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;

    private int vegBasePrice = 300;
    private int nonVegBasePrice = 400;
    private int extraCheese = 80;
    private int extraToppingVeg = 70;
    private int extraToppingNonVeg = 120;
    private int paperBgPrice = 20;
    private boolean isExtraCheese;
    private boolean isTopping;
    private boolean isTakeAway;





    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.basePrice = getBasePrice();
        this.price = basePrice;
        this.isExtraCheese = false;
        this.isTopping = false;
        this.isTakeAway = false;
    }

    public int getPrice(){
        return this.price;
    }

    private int getBasePrice(){
        if(isVeg) return vegBasePrice;
        return nonVegBasePrice;
    }


    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            isExtraCheese = true;
            price+= extraCheese;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isTopping){
            isTopping = true;
            if(isVeg){
                price+= extraToppingVeg;
            }else{
                price+= extraToppingNonVeg;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            isTakeAway = true;
            price += paperBgPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String temp = "";
        temp+= "Base Price Of The Pizza:" + basePrice + "\n";
        if(isExtraCheese){
            temp+= "Extra Cheese Added:" + extraCheese + "\n";
        }

        if(isTopping){
            if(isVeg){
                temp+= "Extra Toppings Added:"+ extraToppingVeg + "\n";
            }else{
                temp+= "Extra Toppings Added:"+ extraToppingNonVeg + "\n";
            }
        }

        if(isTakeAway){
            temp+= "Paperbag Added:" + paperBgPrice + "\n";
        }

        temp+= "Total Price:" + price +"\n";

        this.bill = temp;

        return this.bill;
    }
}