package ModelToy;
import ToyWarehouse.ScannerItem;
import java.io.Serializable;
import java.util.*;

public class Atoy implements WeightToy, ScannerItem, Comparable<Atoy>, Iterator<String>, Serializable{
    protected int idToy;  // id игрушки
    protected String titleToy; // Название игрушки
    protected int amount; // Количество игрушек
    @Override
    public int weightToy() { //Вес игрушк
        return 0;
    }
    //Гетеры
    public int getAmount() {
        return amount;
    }
    public int getIdToy() {
        return idToy;
    }
    public String getTitleToy() {
        return titleToy;
    }
    public int getItem() {
        return item;
    }
    // Сетеры
    public void setTitleToy(String titleToy) {
        this.titleToy = titleToy;
    }
    public void setItem(int item) {
        this.item = item;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setIdToy(int idToy) {
        this.idToy = idToy;
    }
    public Atoy(String titleToy, int amount) {
        this.titleToy = titleToy;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return '{' +
                "id " + idToy +
                ", Название = " + '\'' + titleToy + '\'' +
                " Количество = " + amount + " Вес = " + weightToy() +
                '}';
    }
    @Override
    public int compareTo(Atoy o) {
            return Integer.compare(this.idToy, o.idToy);
    }
    // Итерация
    int item;
    @Override
    public boolean hasNext() {
        return item++ < 4;
    }
    @Override
    public String next() {
        switch (item) {
            case 1:
                return  String.format("%d", idToy);
            case 2:
                System.out.println("Введите название игрушки, которую хотите добавить");
                titleToy = scanString();
                return String.format("%s", titleToy);
            case 3:
                System.out.println("Введите количество добавляемых игрушек");
                amount = scanInt();
                return String.format("%d", amount);
            default:
                return String.format("%d", weightToy());
        }
    }
}
