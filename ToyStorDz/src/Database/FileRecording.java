package Database;
import ModelToy.Atoy;
import java.io.*;
import java.util.List;

public class FileRecording <E extends Atoy>{
    // Запись файла.
    public void yourPrize(E text){
        try {
            File file = new File("yourPrize");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(text);
            printWriter.close();
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Сериализация Десериализация
    public void fileRecording(List<E> listAtoy){
        //FileOutputStream fileOutput = null;
        try {
            FileOutputStream fileOutput = new FileOutputStream("Stek");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

            objectOutput.writeObject(listAtoy);

            objectOutput.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
