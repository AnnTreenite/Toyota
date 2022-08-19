package CarModels;

import Accessories.USB;
import TypeOfCar.PassengerCar;

public class Camry extends PassengerCar implements USB {

    @Override
    public void connectMusic() {
        System.out.println("в Камри играет музыка");
    }

    public boolean cruiseControl() {
        System.out.println("имеет функцию круиз-контроля");
        return false;
    }
}
