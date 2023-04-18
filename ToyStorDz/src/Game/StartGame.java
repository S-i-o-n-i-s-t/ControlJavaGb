package Game;

import Database.FileRecording;
import MainMenu.MainMenu;
import ModelToy.Atoy;

import java.util.List;
import java.util.Random;

public class StartGame <E extends Atoy>{
    private int randomIndex;

    public List<E> drawingOfAToy(List<E> listToy) {
        DresCode dresCode = new DresCode();
        randomIndex = dresCode.randomIndex(listToy);
        while (dresCode.dresCode(listToy, randomIndex) != true) {
            randomIndex = dresCode.randomIndex(listToy);
        }
        E newToy = (E) dresCode.createToyPrank(randomIndex, listToy);
        System.out.println("Внимание!!! Разигрывается:");
        System.out.println(newToy);
        if (dresCode.getToy(newToy) == true) {
            dresCode.redToy(listToy, randomIndex);
            System.out.println("Победа!!!!!");
            FileRecording fileRecording = new FileRecording();
            fileRecording.yourPrize(newToy);
        } else System.out.println("Игрушка оказалась тяжеловата...");
        return listToy;
    }
}
