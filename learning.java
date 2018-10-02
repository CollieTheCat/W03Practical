import java.util.*; //for my maps
import java.lang.*; //for a rounding error from working with doubles

public class learning {

    public static void main(String[] args) {

        LinkedHashMap<String, Double> prices = new LinkedHashMap<String, Double>(); //Made a hashmap of prices of indivdual items

        prices.put("rings", 187.75);
        prices.put("wedding dresses", 779.50);
        prices.put("groom's outfits", 159.95);
        prices.put("bridesmaid's dresses", 127.75);
        prices.put("dinners", 48.50);
        prices.put("drinks", 16.10);
        prices.put("wedding cakes", 202.80);
        prices.put("limos", 282.75);
        prices.put("buttonholes", 11.42);
        prices.put("bride's bouquets", 102.95);
        prices.put("bridesmaid's bouquets", 33.50);
        prices.put("invitations", 6.66);
        prices.put("reception venues", 811.95);

        Set<Map.Entry<String, Double>> set = prices.entrySet(); //changes my map into a set for use in while loop

        Iterator<Map.Entry<String, Double>> it = set.iterator();

        EasyIn2 reader = new EasyIn2(); //object for asking and storing input from the console

        double grandTotal = 0;

        /*The while loop starts by asking the user how much of each key they need, then multiplying the quantity by
        the map value, and finally, adding the new map value to the total*/

        while(it.hasNext()) {
            Map.Entry<String, Double> me = it.next();
            System.out.println("How many " + me.getKey() + " do you need?");
            int quant = reader.getInt();
            double subTotal = (me.getValue()*quant);
            double newSubTotal = Math.round((subTotal * 100.0)) / 100.0; //round off the subtotals
            prices.put(me.getKey(), newSubTotal);
            grandTotal += newSubTotal;
            System.out.println(newSubTotal);
            System.out.println(subTotal);
        }

        Iterator<Map.Entry<String, Double>> i = set.iterator(); //another iterator for the next while loop

        System.out.println("----------"); //all about that formatting
        System.out.println("Receipt:\n");
        System.out.println("----------");

        while(i.hasNext()) {
            Map.Entry<String, Double> me = i.next();
            String fixedCaps = me.getKey().substring(0,1).toUpperCase() + me.getKey().substring(1).toLowerCase(); //more formatting
            System.out.print(fixedCaps + ": ");
            System.out.println(me.getValue());
        }

        //new grand total after rounding FIX

        System.out.println("----------");
        System.out.println("Your grand total is £" + grandTotal);
    }
}