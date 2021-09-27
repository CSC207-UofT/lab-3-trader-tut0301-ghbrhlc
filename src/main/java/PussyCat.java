public class PussyCat implements Domesticatable, Tradable{

    private boolean isCute;

    public PussyCat(boolean iscute){
        this.isCute = iscute;
    }

    public void makeCute(){
        this.isCute = true;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public String sound() {
        return 1234;

    }
    public boolean getIsCute(){
        return this.isCute;
    }
}
