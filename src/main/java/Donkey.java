public class Donkey implements Tradable, Domesticatable {

    private int maxSpeed;

    public Donkey(){
        this.maxSpeed = 1;
    }

    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public int getPrice() {
        return 750;
    }

    @Override
    public String sound() {
        return "heehaw";
    }
}
