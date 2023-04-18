package View;

import Database.FileRead;
import Database.FileRecording;
import MainMenu.MainMenu;
import ModelToy.AnExpensiveToy;
import ModelToy.AnLuxToy;
import ModelToy.AnOrdinaryToy;
import ModelToy.Atoy;
import ToyWarehouse.MetodsCreareToy;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class Main{
    public static void main(String[] args){
        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu();
        //MetodsCreareToy drawingOfAToy = new MetodsCreareToy();
        //drawingOfAToy.addNevTypeToy(new AnLuxToy( "Слон", 0))
        //        .addNevTypeToy(new AnOrdinaryToy( "Гном", 0))
        //        .addNevTypeToy(new AnExpensiveToy( "Жираф", 1))
        //        .addNevTypeToy(new AnExpensiveToy( "Медведь", 0));
        //FileRead fileRead = new FileRead();
        //FileRecording fileRecording = new FileRecording();
        //List<Atoy> FAIL;
        //System.out.println(fileRead.fileRead());



    }
}