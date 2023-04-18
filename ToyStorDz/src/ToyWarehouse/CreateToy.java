package ToyWarehouse;
import ModelToy.AnExpensiveToy;
import ModelToy.AnLuxToy;
import ModelToy.AnOrdinaryToy;
import ModelToy.Atoy;

public class CreateToy implements ScannerItem{
    public Atoy weightCategory(){
        // Меню создания
        Atoy atoy;
        System.out.println("Введите: {1 - если вес до 5г} {2 - если вес до 30гр} {3 - если вес до 75}");
        //Scanner scanner = new Scanner(System.in);
        int weightSelection = scanInt();
        if(weightSelection == 1) {
            atoy = new AnOrdinaryToy("", 0);
        }
        else if (weightSelection == 2) {
            atoy = new AnExpensiveToy("", 0);
        }
        else {
            atoy = new AnLuxToy("", 0);
        }
        return atoy;
    }
}
