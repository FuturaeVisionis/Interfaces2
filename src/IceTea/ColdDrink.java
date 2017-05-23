package IceTea;

import HotDrink.Coffee;
import SoftDrink.Sprite;
import static java.lang.System.out;

/**
 * Created by ronald on 14/09/16.
 */
public class ColdDrink extends Coffee implements Sprite {
    @Override
    public void sweatner() {
        out.println("Cold drinks contain lots of sweatner.");
    }

    @Override
    public void bubbles() {
        out.println("Cold drinks don't have any bubbles added.");

    }
}
/*
Remember that because ColdDrink extends Coffee, all the methods within Coffee
are silently inherited. That is: water, sugar en CO2

A class can be extended and a interface can be implemented!!
 */
