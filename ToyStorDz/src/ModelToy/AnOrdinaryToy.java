package ModelToy;

import java.io.Serializable;

public class AnOrdinaryToy extends Atoy{
    public AnOrdinaryToy(String titleToy, int amount) {
        super(titleToy, amount);
    }
    public int weightToy() {
        return 5;
    }
}
