package ToyWarehouse;
import ModelToy.Atoy;
import java.util.List;

public class MenyAddToi <E extends Atoy>implements ScannerItem{
    public List<E> meny(List<E> listToy){
        String yesNo = "y";
        int item;
        while (yesNo.equals("y")){
            System.out.println("Введите - {1 - для добавления игрушки} {2 - для создания новой игрушки} {3 - для удаления игрушки} {4 - для просмотра списка игрушек}");
            item = scanInt();
            if (item == 1){
                AddToy addToy = new AddToy();
                addToy.addToy(listToy);
            }
            else if (item == 2) {
                CreateToy createToy = new CreateToy();
                MetodsCreareToy metodsCreareToy = new MetodsCreareToy();
                metodsCreareToy.addNevTypeToy(metodsCreareToy.createToy(createToy.weightCategory()), listToy);
            }
            else if (item == 3) {
                DelteToy delteToy = new DelteToy();
                delteToy.delteToy(listToy);
            }
            else {
                MetodsCreareToy metodsCreareToy = new MetodsCreareToy();
                metodsCreareToy.viewList(listToy);
            }
            System.out.println("{ОСТАТЬСЯ в режиме 'Создание/Удаление' введите 'y'} {Выход - n}");
            yesNo = scanString();
        }
        return listToy;
    }
}
