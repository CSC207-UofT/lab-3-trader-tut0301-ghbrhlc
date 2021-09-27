/*
A Cow class that implements Domesticatable, Drivable and Tradable interface.
 */

public class Cow implements Domesticatable, Tradable, Drivable{
    private int max_speed;

    public Cow() {
        this.max_speed = 10;
    }

    @Override
    public int getPrice() {
        return 40;
    }

    @Override
    public String sound() {
        return "Mow!";
    }

    @Override
    public void upgradeSpeed() {
        this.max_speed += 2;
    }

    @Override
    public void downgradeSpeed() {
        this.max_speed -= 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }
}
