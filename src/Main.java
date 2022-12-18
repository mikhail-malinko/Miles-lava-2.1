public class Main {
    public static void main(String[] args) {
//        int ticketPrice = 35_710;
//        int milePrice = 20;
//        int freeMiles = ticketPrice / milePrice;
//
//        System.out.println("Бонусные мили: " + freeMiles);

        BonusMilesService service = new BonusMilesService();
        int price = 35710;
        int miles = service.calculate(price);
        System.out.println(miles);

    }
}