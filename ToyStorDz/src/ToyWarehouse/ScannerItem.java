package ToyWarehouse;
import java.util.Scanner;

public interface ScannerItem {
    default int scanInt(){
        Scanner scanner = new Scanner(System.in);
        int numer = scanner.nextInt();
        return numer;
    }
    default String scanString(){
        Scanner scanner = new Scanner(System.in);
        String Text = scanner.nextLine();
        return Text;
    }
}
