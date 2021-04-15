package all.exercise6.absctract_fabricka;

public class MagicChairFabrika implements Fabrika {

    @Override
    public Chair createChair(){
        return new MagicChair();
    }
}
