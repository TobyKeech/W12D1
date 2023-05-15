public class Waterbottle {
    private int volume;

    public Waterbottle (int volume){
        this.volume= volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int reduceVolume(int a){
        int total=this.volume - a;
        return total;
    }

    public int reduceZero(){
        return this.volume - 100;
    }

    public int fillUp(){
        int volume = this.volume = 100;
        return volume;
    }



}
