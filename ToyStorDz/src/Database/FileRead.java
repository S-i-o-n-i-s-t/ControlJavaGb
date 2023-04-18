package Database;
import ModelToy.Atoy;
import java.io.*;
import java.util.List;

public class FileRead <E extends Atoy>{
    //Сериализация Десериализация
    public List<E> fileRead(){
        List<E> listToy;
        try {
            FileInputStream fileInput = new FileInputStream("Stek");
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            listToy = (List<E>) objectInput.readObject();
            objectInput.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return listToy;
    }
}
