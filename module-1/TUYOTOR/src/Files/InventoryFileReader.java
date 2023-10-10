package Files;

import Items.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryFileReader {

//     TO READ THE INVENTORY CLASS WE WILL CREATE THIS.
    private File inventoryFile = new File("C:\\Users\\Student\\Desktop\\inventory.csv");
    private Scanner inventoryScanner;

    // DATA CONSTRUCTOR
    // .....EXCEPTION HANDLING

    public InventoryFileReader() {

        try {
            inventoryScanner = new Scanner(inventoryFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Map<String, CandyStoreItems> loadData() {
          Map<String, CandyStoreItems> candyItems = new HashMap<>();
          while (inventoryScanner.hasNextLine()) {
            String currentCandy = inventoryScanner.nextLine();
            String[] currentCandyArray = currentCandy.split("\\ |");
            if (currentCandyArray[0].equals("CH")) {
                CandyStoreItems newCandy = new ChocolateCandy(currentCandyArray[2], currentCandyArray[1], Double.parseDouble(currentCandyArray[3]), currentCandyArray[4]);
                candyItems.put(currentCandyArray[1], newCandy);
            } else if (currentCandyArray[0].equals("SR")) {
                CandyStoreItems newCandy = new SourCandy(currentCandyArray[2], currentCandyArray[1], Double.parseDouble(currentCandyArray[3]), currentCandyArray[4]);
                candyItems.put(currentCandyArray[1], newCandy);
            } else if (currentCandyArray[0].equals("HC")) {
                CandyStoreItems newCandy = new HardCandy(currentCandyArray[2], currentCandyArray[1], Double.parseDouble(currentCandyArray[3]), currentCandyArray[4]);
                candyItems.put(currentCandyArray[1], newCandy);
            } else {
                CandyStoreItems newCandy = new LicoriceCandy(currentCandyArray[2], currentCandyArray[1], Double.parseDouble(currentCandyArray[3]), currentCandyArray[4]);
                candyItems.put(currentCandyArray[1], newCandy);
            }
                
        }
             return candyItems;
    }

}
