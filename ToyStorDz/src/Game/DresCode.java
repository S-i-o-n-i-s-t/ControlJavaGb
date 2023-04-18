package Game;
import ModelToy.Atoy;
import java.util.List;
import java.util.Random;

public class DresCode <E extends Atoy>{
    // Рандомный индес
    public int randomIndex(List<E> listToy){
        int random;
        random = new Random().nextInt(0, listToy.size());
        return random;
    }
    // Провеляем, осталась ли игрушка в наличии
    public boolean dresCode(List<E> listToy, int random){
        boolean dresCod;
        if (listToy.get(random).getAmount() <= 0){
            dresCod = false;
        }
        else dresCod = true;
        return dresCod;
    }
    // Розыгрыш. Проверяем хватает ли веса
    public boolean getToy(E toy){
        int random = new Random().nextInt(1,101);
        System.out.println(String.format("Доступный вес - %d", random));
        boolean bool;
        if (toy.weightToy() <= random){
            bool = true;
        }
        else bool = false;
        return bool;
    }
    // Достаем нужную игрушку
    public Atoy createToyPrank(int qanty, List<E> stek){
        Atoy toy;
        toy = stek.get(qanty);
        return toy;
    }
    // Убираем выигранную игрушку
    public List<E> redToy(List<E> listToy, int random){
        listToy.get(random).setAmount(listToy.get(random).getAmount() - 1);
        return listToy;
    }
    //Проверяем остались ли игрушки на складе
    public boolean checkTheWarehouse(List<E> listToy){
        boolean dresCod;
        int amount = 0;
        for (Atoy item: listToy) {
            amount = amount + item.getAmount();
        }
        if (amount == 0){
            dresCod = false;
        }
        else {
            dresCod = true;
        }
        return dresCod;
    }
}
