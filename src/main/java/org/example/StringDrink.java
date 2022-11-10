package org.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class StringDrink {
    private String drink;
    public StringDrink(String drink){
        this.drink = drink;
    };

    public String getText() {
        return drink;
    }

    public void setText(String drink) {
        this.drink = drink;
    }
}
