package restaurant;

import HotDrink.Coffee;
import IceTea.ColdDrink;

/**
 * Created by ronald on 14/09/16.
 */
public class Menu {
    public static void main(String[] args) {
        ColdDrink coldDrink = new ColdDrink();
        coldDrink.sweatner();

        Coffee coffee = new Coffee();
        coffee.water();
    }
}
