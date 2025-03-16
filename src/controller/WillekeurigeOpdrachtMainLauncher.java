package controller;

import java.util.ArrayList;

public class WillekeurigeOpdrachtMainLauncher {

    public static void main(String[] args) {

//        ArrayList<String> woordenlijst = new ArrayList<>();
//        woordenlijst.add("Morgen");
//        woordenlijst.add("wordt");
//        woordenlijst.add("het");
//        woordenlijst.add("mooi");
//        woordenlijst.add("weer");
//        for (String woord : woordenlijst) {
//            System.out.print(woord + " ");
//        }
//        System.out.println();
//        woordenlijst.remove(1);
//        woordenlijst.add(1, "is");
//        for (String woord : woordenlijst) {
//            System.out.print(woord + " ");
//        }
//        System.out.println();

        ArrayList<Integer> randomRijIntegers = genereerLijstWillekeurigeGetallen(25, 25);

        for (Integer integer : randomRijIntegers) {
            System.out.printf("%d  ", integer);
        }
        System.out.println();
        System.out.printf("De som van getallen is: %d %n", berekenSomGetallen(randomRijIntegers));
        System.out.printf("Het gemiddelde van getallen is: %.2f %n", berekenGemiddeldeGetallen(randomRijIntegers));
        System.out.println();

        ArrayList<Number> rijNumbers = new ArrayList<>();
        rijNumbers.add(5);
        rijNumbers.add(8);
        rijNumbers.add(13);
        rijNumbers.add(21);
        rijNumbers.add(34);
        rijNumbers.add(3.14);
        rijNumbers.add(2.72);
        rijNumbers.add(1.62);

        for (Number number : rijNumbers) {
            if (number instanceof Integer) {
                System.out.print(number + "  ");
            }
        }
        System.out.println();

        double som = 0;
        for (Number number : rijNumbers) {

            if (number instanceof Double) {
                som += (Double) number;
            }
        }
        System.out.printf("De som van alleen de doubles is: %.2f %n", som);
        System.out.printf("Het gemiddelde van de lijst is: %.2f %n", berekenGemiddeldeNumber(rijNumbers));

        System.out.println();

        System.out.println("Voor Lijst van auto’s (opdracht 6) - zie opdracht 5.2 Vervoermiddelen. \nGeen zin om de klassen opnieuw te schrijven...");

    } // main

    // methoden
    public static ArrayList<Integer> genereerLijstWillekeurigeGetallen(int aantal, int maximum) {
        ArrayList<Integer> getallenArrayList = new ArrayList<>();
        int randomGetal = 0;
        final int ONDERGRENS = 1;

        for (int i = 0; i < aantal; i++) {
            randomGetal = (int) (Math.random() * (maximum)) + ONDERGRENS;
            getallenArrayList.add(randomGetal);
        }
        return getallenArrayList;
    }

    public static int berekenSomGetallen(ArrayList<Integer> arrayList) {
        int somVanGetallen = 0;
        for (Integer integer : arrayList) {
            somVanGetallen += integer;
        }
        return somVanGetallen;
    }

    public static double berekenGemiddeldeGetallen(ArrayList<Integer> arrayList) {
        int somVanGetallen = berekenSomGetallen(arrayList);
        return (double) somVanGetallen / arrayList.size();
    }

    public static double berekenGemiddeldeNumber(ArrayList<Number> arrayList) {
        double som = 0;
        for (Number number : arrayList) {
            som += number.doubleValue();
        }
        return som / arrayList.size();
    }

} // main