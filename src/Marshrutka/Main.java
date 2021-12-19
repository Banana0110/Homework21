package Marshrutka;

public class Main {

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger();
        passenger1.setName("Mikoto");
        passenger1.setPrice(12);
        passenger1.setNumeration(1);

        Passenger passenger2 = new Passenger();
        passenger2.setName("Yamiyo");
        passenger2.setPrice(12);
        passenger2.setNumeration(2);

        Passenger passenger3 = new Passenger();
        passenger3.setName("Momoshiki");
        passenger3.setPrice(12);
        passenger3.setNumeration(3);


        Passenger passenger4 = new Passenger();
        passenger4.setName("Mizuya");
        passenger4.setPrice(12);
        passenger4.setNumeration(4);

        Passenger passenger5 = new Passenger();
        passenger5.setName("Kazuya");
        passenger5.setPrice(12);
        passenger5.setNumeration(5);

        int sum = 0;
        Passenger[] passengers = {passenger1, passenger2, passenger3, passenger4, passenger5};
        for (Passenger ignored : passengers) {
            sum = sum + passenger1.getPrice(12);
        }
        System.out.println("Количество пассажиров: " + passengers.length);
        //System.out.println(passenger4);        //не знаю почему не выводятся данные пассажиров
        System.out.println("За рейс было заработано: "+ sum);
        
        int pasng = 6;
        if (pasng > 5) {
            System.out.println("Мест нет!");
        } else {
            System.out.println("Есть места ");
        }


    }
}
