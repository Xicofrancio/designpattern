package org.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder(drink.getText());
        StringBuilder reversestr = str.reverse();
        drink.setText(String.valueOf(reversestr));
    }

}
