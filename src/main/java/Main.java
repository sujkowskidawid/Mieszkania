import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //TEST
        House house= new House();
        house.setNumberOfRooms(6);
        house.setNumberOfWindows(15);
        house.setArea(150);
        house.setHasGarden(true);
        house.setHasGarage(true);
        house.setHasGym(false);
        house.setOneStorey(true);

        ApartmentBuilding apartmentBuilding = new ApartmentBuilding();
        apartmentBuilding.setNumberOfRooms(80);
        apartmentBuilding.setNumberOfWindows(120);
        apartmentBuilding.setArea(2_300);
        apartmentBuilding.setHasGarden(false);
        apartmentBuilding.setHasGarage(false);
        apartmentBuilding.setHasGym(true);
        apartmentBuilding.setNumberOfApartments(40);
        apartmentBuilding.setNumberOfFloors(4);

        System.out.println(house);
        System.out.println(apartmentBuilding);
        System.out.println();
        // TEST END

        Apartment apartment1 = new Apartment();
        Apartment apartment2 = new Apartment();
        Apartment apartment3 = new Apartment();

        apartment1.setCity("Warsaw");
        apartment1.setArea(100);
        apartment1.setPrice(8000);

        apartment2.setCity("Poznan");
        apartment2.setArea(82);
        apartment2.setPrice(6400);

        apartment3.setCity("Gdansk");
        apartment3.setArea(75);
        apartment3.setPrice(7350);

        ArrayList<Apartment> apartmentsList = new ArrayList<>();

        apartmentsList.add(apartment1);
        apartmentsList.add(apartment2);
        apartmentsList.add(apartment3);

        for (Apartment apartaments : apartmentsList) {
            System.out.println(apartaments);
            System.out.println("Całkowita cena mieszkania to:" + apartaments.getFullPrice() + "\n");

        }
        double sum = 0;
        for (Apartment a : apartmentsList) {
            sum += a.getFullPrice();
        }
        System.out.format("średnia cena mieszkań to: %.2f", sum / apartmentsList.size());


    }
}



