public class W03Practical {
    public static void main(String[] args) {

        // I start off by initializing a variable to represent the price of each individual purchase
        
    	double ring = (187.75);
        double brideClothes = (779.50);
        double groomClothes = (159.95);
        double bmaidClothes = (127.75);
        double dinner4One = (48.50);
        double drink4One = (16.10);
        double weddingCake = (202.80);
        double limo = (282.75);
        double buttonHole = (11.42);
        double bigBouquet = (102.95);
        double smallBouquet = (33.50);
        double invite = (6.66);
        double receptionVenue = (811.95);
        
        //Next, I multiply the individual prices by the quantities they're being purchased in
        //then, I sort them into reasonable categories

        double ringTotal = (2 * ring);
        double clothesTotal = (2 * groomClothes + brideClothes + 3 * bmaidClothes + 8 * buttonHole);
        double foodTotal = (64 * (dinner4One + drink4One) + weddingCake);
        double inviteTotal = (invite * 50);
        double transportTotal = (limo * 2);
        double flowerTotal = (bigBouquet + 3 * smallBouquet);
        
        //finally, I add up all of the categories and print out the total :)

        double costTotal = (ringTotal + clothesTotal + foodTotal + inviteTotal + transportTotal + flowerTotal +
                receptionVenue);

        System.out.println(costTotal);


    }
}