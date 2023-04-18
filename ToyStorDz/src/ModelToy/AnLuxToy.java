package ModelToy;

import java.io.Serializable;

public class AnLuxToy extends Atoy{
    public AnLuxToy(String titleToy, int amount) {
        super(titleToy, amount);
    }
    @Override
    public int weightToy() {
        return 75;
    }
}
