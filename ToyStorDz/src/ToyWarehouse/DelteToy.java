package ToyWarehouse;
import ModelToy.Atoy;
import java.util.List;
import java.util.ListIterator;

public class DelteToy <E extends Atoy> implements ScannerItem{
    // Меню удаления
    public List<E> delteToy(List<E> listToy){
        int index = -1;
        while (index < 1 || index > listToy.size()) {
            System.out.println("Введите id игрушки которую хотите удалить");
            index = scanInt();
        }
        int item = 0;
        ListIterator<E> iterator = listToy.listIterator();
        while (iterator.hasNext()){
            iterator.next();
            item++;
            if (item == index){
                iterator.remove();
            }
        }
        MetodsCreareToy metodsCreareToy = new MetodsCreareToy();
        metodsCreareToy.sortList(listToy);
        return listToy;
    }
}
