
public class EBike implements Drivable, Tradable {
    private int maxSpeed;

    public EBike(){
        this.maxSpeed = 5;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed+=2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed-=2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 15;
    }
}
