package pkg;

import Files.InventoryFileReader;
import Items.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    Map<String, CandyStoreItems> inventoryMap = new HashMap<>();

    public Inventory() {
        InventoryFileReader fileReader = new InventoryFileReader();
        inventoryMap = fileReader.loadData();
    }

    public List<CandyStoreItems> inventoryListMethod() {
        List<CandyStoreItems> inventoryList = new ArrayList<>();
        for (Map.Entry<String, CandyStoreItems> currentCandy : inventoryMap.entrySet()) {
            CandyStoreItems currentCandyObject = currentCandy.getValue();
            inventoryList.add(currentCandyObject);
        }
        return inventoryList;

    }

    public boolean validateQuantity(int quantity, String itemId) {
        CandyStoreItems candy = inventoryMap.get(itemId);
        if (candy.getQuantity() - quantity >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean candyId (String id) {
        if (inventoryMap.containsKey(id)) {
            return true;
        } else {
            return false;
        }
    }

    // INSTANCE OF...??

    public CandyStoreItems copyCandy(String itemId, int quantity) {
        CandyStoreItems candyToCopy = inventoryMap.get(itemId);
        CandyStoreItems newCandy;
        if(candyToCopy instanceof ChocolateCandy){
            newCandy = new ChocolateCandy(candyToCopy.getName(), candyToCopy.getID(), candyToCopy.getPrice(), candyToCopy.isWrapped());
        }
        else if (candyToCopy instanceof LicoriceCandy){
            newCandy = new LicoriceCandy(candyToCopy.getName(), candyToCopy.getID(), candyToCopy.getPrice(), candyToCopy.isWrapped());
        }
        else if (candyToCopy instanceof SourCandy){
            newCandy = new SourCandy(candyToCopy.getName(), candyToCopy.getID(), candyToCopy.getPrice(), candyToCopy.isWrapped());
        }
        else{
            newCandy = new HardCandy(candyToCopy.getName(), candyToCopy.getID(), candyToCopy.getPrice(), candyToCopy.isWrapped());
        }
        newCandy.setQuantity(quantity);

        return  newCandy;
        }

}
