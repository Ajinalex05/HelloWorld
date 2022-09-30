package VendingMachine;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class StockItems {
    private Map<Integer, Products> items = new HashMap<>();
    private BigDecimal totalChange;


    public StockItems() {
        items.put(101, new Products("Pepsi", 35, 0));
        items.put(107, new Products("Sprite", 40, 10));
        items.put(111, new Products("Lays", 20, 5));
        items.put(505, new Products("7Up", 25, 1));
        items.put(203, new Products("ThumbsUp", 50, 12));
        totalChange = new BigDecimal(200);
    }

    public Map<Integer, Products> getItems() {
        return items;
    }

    public void setItems(Map<Integer, Products> items) {
        this.items = items;
    }

    public BigDecimal getTotalChange() {
        return totalChange;
    }

    public void setTotalChange(BigDecimal totalChange) {
        this.totalChange = totalChange;
    }


    public void showItems() {
        for (Map.Entry<Integer, Products> entry : items.entrySet()) {
            Products p = entry.getValue();
            System.out.println("\nCODE: " + entry.getKey() + "\nItemName: " + p.getPname() + " --> Rs " + p.getPprice());
        }
    }

    public Boolean checkCode(int code) {
        for (Map.Entry<Integer, Products> entry : items.entrySet()) {
            if (entry.getKey() == code) {
                return true;
            }
        }
        return false;
    }

    public Products checkStock(int code) {
        for (Map.Entry<Integer, Products> entry : items.entrySet()) {
            if (entry.getKey() == code && entry.getValue().getPstock()>0) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void updateTotalChangeAfterPurchase(int change){
        int tc = totalChange.intValue()-change;
        totalChange= new BigDecimal(tc);

    }

    public void updateStockAfterPurchase(int code){
        Products p= items.get(code);
        p.setPstock(p.getPstock()-1);
    }
}



