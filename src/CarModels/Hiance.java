package CarModels;

import Accessories.Stepney;
import TypeOfCar.CargoVan;

public class Hiance extends CargoVan implements Stepney {
    @Override
    public void spareWheel() {
        System.out.println("есть запасное колесо");
    }
}
