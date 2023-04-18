package ToyWarehouse;
import ModelToy.Atoy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MetodsCreareToy <E extends Atoy>{
    private List<E> listToy = new ArrayList<>();
    // Для сoздание новой игрушки
    public E createToy(E toy){
        Iterator<String> iterator = toy;
        while (iterator.hasNext()){
            iterator.next();
        }
        return toy;
    }
    // Добавление игрушки на "склад"
    public MetodsCreareToy<E> addNevTypeToy(E atoy){
        atoy.setIdToy(listToy.size()+1);
        listToy.add(atoy);
        return this;
    }
    public List<E> addNevTypeToy(E atoy, List<E> listToy){
        atoy.setIdToy(listToy.size()+1);
        listToy.add(atoy);
        return listToy;
    }
    // Прочитать List
    public List<E> viewList(List<E> listToy){
        for (E item: listToy) {
            System.out.println(item);
        }
        return listToy;
    }
    // Сортировка индекса, (после удаления)
    public List<E> sortList(List<E> listToy){
        MetodsCreareToy sortList = new MetodsCreareToy();
        for (E item: listToy){
            sortList.addNevTypeToy(item);
        }
        return sortList.getListToy();
    }
    // Просто getList
    public List<E> getListToy() {
        return listToy;
    }

    @Override
    public String toString() {
        return "{" + listToy +
                '}';
    }
}
