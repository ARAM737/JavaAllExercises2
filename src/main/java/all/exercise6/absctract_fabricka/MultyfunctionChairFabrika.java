package all.exercise6.absctract_fabricka;

public class MultyfunctionChairFabrika implements Fabrika {
    @Override
    public Chair createChair() {
        return new MultyfunctionChair();
    }
}
