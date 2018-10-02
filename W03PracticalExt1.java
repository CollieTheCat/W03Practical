import java.util.*; //for my maps
public class W03PracticalExt1 {

    public static void main(String[] args) {

        LinkedHashMap prices = new LinkedHashMap(); //Made a hashmap of prices of indivdual items

        prices.put("rings", new Double(187.75));
        prices.put("wedding dresses", new Double(779.50));
        prices.put("groom's outfits", new Double(159.95));
        prices.put("bridesmaid's dresses", new Double(127.75));
        prices.put("dinners", new Double(48.50));
        prices.put("drinks", new Double(16.10));
        prices.put("wedding cakes", new Double(202.80));
        prices.put("limos", new Double(282.75));
        prices.put("buttonholes", new Double(11.42));
        prices.put("bride's bouquets", new Double(102.95));
        prices.put("bridesmaid's bouquets", new Double(33.50));
        prices.put("invitations", new Double(6.66));
        prices.put("reception venues", new Double(811.95));

        Set set = prices.entrySet(); //changes my map into a set for use in while loop

        Iterator it = set.iterator();

        EasyIn2 reader = new EasyIn2(); //object for asking and storing input from the console

        double grandTotal = 0;

        /*The while loop starts by asking the user how much of each key they need, then multiplying the quantity by
        the map value, and finally, adding the new map value to the total*/

        while(it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            System.out.println("How many " + me.getKey() + " do you need?");
            int quant = reader.getInt();
            double total = (((Double)me.getValue()).doubleValue()*quant);
            prices.put(me.getKey(), new Double(total));
            grandTotal += total;
        }
        System.out.println("Your grand total is £" + grandTotal);
    }
}