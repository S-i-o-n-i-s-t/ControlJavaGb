package ToyWarehouse;
import ModelToy.Atoy;
import java.util.List;

public class AddToy <E extends Atoy> implements ScannerItem{
    // Меню добавления
    public void addToy(List<E> listToy){
        int index = -1;
        int numberToys = -1;
        while (index < 1 || index > listToy.size()) {
            System.out.println("Введите id игрушки которую хотите добавить");
            index = scanInt();
        }
        while (numberToys < 0) {
            System.out.println("Введите сколько игрушек добавить");
            numberToys = scanInt();
        }
        numberToys = numberToys + listToy.get(index - 1).getAmount();
        listToy.get(index - 1).setAmount(numberToys);
    }


}
