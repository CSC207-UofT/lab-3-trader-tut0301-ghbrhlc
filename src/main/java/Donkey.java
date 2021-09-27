public class Donkey implements Tradable, Domesticatable {

    private int maxSpeed;

    public Donkey(){
        this.maxSpeed = 1;
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
