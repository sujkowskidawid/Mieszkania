import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Apartaments apartament1 = new Apartaments();
        Apartaments apartament2 = new Apartaments();
        Apartaments apartament3 = new Apartaments();

        apartament1.setCity("Warsaw");
        apartament1.setArea(100);
        apartament1.setPrice(8000);

        apartament2.setCity("Poznan");
        apartament2.setArea(82);
        apartament2.setPrice(6400);

        apartament3.setCity("Gdansk");
        apartament3.setArea(75);
        apartament3.setPrice(7350);

        ArrayList<Apartaments> apartamentsList = new ArrayList<>();

        apartamentsList.add(apartament1);
        apartamentsList.add(apartament2);
        apartamentsList.add(apartament3);

        for (Apartaments apartaments : apartamentsList) {
            System.out.println(apartaments);
            System.out.println("Całkowita cena mieszkania to:" + apartaments.getFullPrice() + "\n");

        }
        double sum = 0;
        for (Apartaments a : apartamentsList) {
            sum += a.getFullPrice();
        }
        System.out.println("średnia cena mieszkań to:" + sum / apartamentsList.size());


    }
}



