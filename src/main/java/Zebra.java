public class Zebra implements Tradable, Domesticatable, Drivable{
    private int maxSpeed;

    public Zebra(int maxVal) {
        this.maxSpeed = 40;
    }

    @Override
    public String sound() {
        return "Zaaaaa!";
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
        return 100;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
