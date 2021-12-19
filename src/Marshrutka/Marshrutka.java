package Marshrutka;

import java.util.Arrays;

public class Marshrutka extends Passenger {
    public Marshrutka(int count) {
        System.out.println(places);
    }

    final String[][] places = new String[5][5];

    @Override
    public String toString() {

        return "Marshrutka{" +
                "places=" + Arrays.toString(places) +
                '}';
    }

    public static class Passenger {
        public Passenger() {
        }

        public void getName(String name) {
        }

        public void getPrice(int i) {
        }

        public void getNumeration(int i) {
        }

        public void setNumeration(int i) {
        }

        public void setName(String mizuya) {
        }

        public void setPrice(int i) {
        }
    }
}

class Passenger  {
    private int price;
    private String name;
    private int numeration;

    public int getPrice(int i) {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName(String s) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumeration(int i) {
        return numeration;
    }

    public void setNumeration(int numeration) {
        this.numeration = numeration;
    }

    public void getNumeration() {


    }
}

