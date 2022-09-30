package VendingMachine;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Samp {

    public static void main(String[] args) {

       Map<Integer,String> itm = new HashMap<>();

        itm.put(5,"Ajin");
        BigDecimal bd = new BigDecimal(11.2);
        BigDecimal bd2= bd.setScale(2);
        System.out.println(bd2);
    }
}