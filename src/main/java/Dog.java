public class Dog implements Tradable, Domesticatable{
    /**
     * Return the sound made by a dog.
     *
     **/
    private int price;
    public Dog(){
        this.price = 10;
    }
    public String sound(){
        return "Woof!";
    }

    /**
     * Return the price of a dog
     */
    public int getPrice(){
        return this.price;
    }

    public void price_up(int price){
        this.price += price;
    }

    public void price_down(int price){
        this.price -= price;
    }
}
