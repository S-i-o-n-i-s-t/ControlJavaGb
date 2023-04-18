package ModelToy;

import ToyWarehouse.ScannerItem;

import java.io.Serializable;

public class AnExpensiveToy extends Atoy{
    public AnExpensiveToy(String titleToy, int amount) {
        super(titleToy, amount);
    }
    @Override
    public int weightToy() {
        return 30;
    }

}
