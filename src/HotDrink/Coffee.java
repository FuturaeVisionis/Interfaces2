package HotDrink;

import SoftDrink.Fanta;

import static java.lang.System.out;

/**
 * Created by ronald on 14/09/16.
 */
public class Coffee implements Fanta {
    @Override
    public void water() {
        out.println("Main ingredient of coffee is water.");
    }

    @Override
    public void sugar() {
        out.println("Coffee contains no sugar");
    }

    @Override
    public void CO2() {
        out.println("Coffee has no carbon dioxide added to it.");

    }
}
