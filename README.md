# Opdracht ArrayList-2

## Beschrijving
In deze serie opdrachten ga je de ArrayList gebruiken, meestal in combinatie met de foreach-loop.
Elke opdracht beschrijft wat je moet doen.

## 1. Lijst van woorden
Maak een ArrayList van Strings. Voeg achtereenvolgens de woorden "Morgen", "wordt", "het", "mooi" en "weer" toe. Verwijder nu het tweede woord, en plaats het woord "is" op de tweede plek.
Print alle woorden achter elkaar uit met behulp van een for loop.

## 2. Lijst van random gehele getallen
Schrijf een methode die een ArrayList maakt met random getallen van 1 tot een zeker maximum. Je geeft het aantal getallen mee en het maximum.
De methode heeft als signature
```java
public static ArrayList<Integer> maakRandomRijGetallen(int aantal, int maximum)
```
Maak in je main methode een lijst getallen aan en print de getallen om te zien of het werkt.

## 3. Som van een rij getallen
Schrijf een methode die van een lijst gehele getallen de som berekent.
De methode heeft als signature
```java
public static int somVanRij(ArrayList<Integer> rij)
```

## 4. Gemiddelde van een rij getallen
Schrijf een methode die van een lijst gehele getallen het gemiddelde berekent. Je kunt handig gebruik maken van de somVanRij methode.
De methode heeft als signature
```java
public static double gemiddeldeVanRij(ArrayList<Integer> rij)
```

## 5. Lijst van getallen
Maak een lijst van getallen met daarin de gehele getallen 5, 8, 13, 21 en 34 en de getallen 3.14, 2.72 en 1.62. Tip: Er is een abstracte klasse Number in Java.

a. Gebruik een loop om alleen de gehele getallen te tonen.
b. Bereken de som van de gebroken getallen.
c. Laat het gemiddelde uitrekenen van de lijst getallen. Gebruik hiervoor een methode.

## 6. Lijst van auto's
Maak een lijst van 8 auto's (zie opdracht 5.2 Vervoermiddelen). Schrijf een methode die de zwaarste auto teruggeeft uit een lijst met auto's.