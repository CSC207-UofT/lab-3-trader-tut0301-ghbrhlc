public class Donkey implements Tradable, Domesticatable {

    @Override
    public int getPrice() {
        return "750";
    }

    @Override
    public String sound() {
        return "heehaw";
    }
}
