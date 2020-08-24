package factory.abstractfactory;

public class MagicFactory extends AbstractFactory {
    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    public Food createFood() {
        return new MashRoom();
    }

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }
}
