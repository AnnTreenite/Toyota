package CarModels;

import Accessories.Socket;
import TypeOfCar.CargoVan;

public class Dyna extends CargoVan implements Socket {
    @Override
    public void chargeThePhone() {
        System.out.println("можете зарядить телефон");
    }

    public int loadCapacity;
}
