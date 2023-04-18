package MainMenu;

import Database.FileRead;
import Database.FileRecording;
import Game.DresCode;
import Game.StartGame;
import ModelToy.Atoy;
import ToyWarehouse.MenyAddToi;
import ToyWarehouse.ScannerItem;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class MainMenu <E extends Atoy> implements ScannerItem{
    public void mainMenu(){
        FileRead fileRead = new FileRead();//чтение
        FileRecording fileRecord = new FileRecording();//запись
        int item = 0;
        while (item != 3) {
            System.out.println("{Игровой режим: введите - 1} {Режим Создание/Удаление: введите - 2} {Выход: введите - 3}");
            item = scanInt();
            if (item == 1) {
                DresCode dresCode = new DresCode();
                List<Atoy> atoyList = fileRead.fileRead();
                if (dresCode.checkTheWarehouse(atoyList) == true) {
                    StartGame startGame = new StartGame();
                    startGame.drawingOfAToy(atoyList);
                    fileRecord.fileRecording(atoyList);
                }
                else System.out.println("Увас закончились игрушки!!! Добавте новые");
            } else if (item == 2) {
                List<Atoy> atoyLis = fileRead.fileRead();
                MenyAddToi menyAddToi = new MenyAddToi();
                menyAddToi.meny(atoyLis);
                fileRecord.fileRecording(atoyLis);
            }
            else {item = 3;}
        }

    }
}
