public class Elephant implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Elephant() {
        this.maxSpeed = 35;
    }

    @Override
    public String sound() {
        return "Trumpet!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
