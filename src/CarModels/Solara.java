package CarModels;

import Accessories.Fridge;

public class Solara implements Fridge {
    @Override
    public void coolTheDrink() {
        System.out.println("может охладить ваш напиток");
    }
}
