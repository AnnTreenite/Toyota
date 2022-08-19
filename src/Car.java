import CarActions.StartCarException;

public class Car {
    private Wheel wheel;
    private int countWheel;
    private int gasTank;
    private boolean engineHealth;
    private boolean electronicsHealth;
    private boolean headlightHealth;

    public Car(Wheel wheel, int countWheel, int gasTank, boolean engineHealth, boolean electronicsHealth, boolean headlightHealth) {
        this.wheel = wheel;
        this.countWheel = countWheel;
        this.gasTank = gasTank;
        this.engineHealth = engineHealth;
        this.electronicsHealth = electronicsHealth;
        this.headlightHealth = headlightHealth;
    }
    public void canMove() throws StartCarException {
        if ((countWheel == 4) && !wheel.full && (gasTank > 0) && engineHealth && electronicsHealth && headlightHealth) {
            throw new StartCarException("машина не может ехать");
        }
        System.out.println("машина поехала");
    }

    //    public Car ()
    public static class Wheel {
        private int diameter;
        private boolean full;
        public Wheel(boolean full, int diameter) {
            this.full = full;
            this.diameter = diameter;
        }
}
}
