package Augabenblatt4;

public class PlantTestDrive {
    public static void main(String[] args) {
        // Initializieung eines Objekt;

        Plant plant = new Plant();
        plant.setHeight(10.0);
        plant.setType("Rosa");
        plant.setWaterLevel(8);


        //  Frage 1.3
        // Vor der Veränderung das Lichtverhältnis
        // Vor der Änderung des Lichtverhältnisses
        System.out.println("Vor Veränderung: Die Pflanze hat eine Höhe von " + plant.getHeight() + " cm.");

        // Test der Methode grow() mit verschiedenen Werten
        plant.grow(3); // 3 Stunden Sonnenlicht
        plant.grow(6); // 6 Stunden Sonnenlicht
        plant.grow(10); // 10 Stunden Sonnenlicht

        // Nach allen Änderungen
        System.out.println("Nach allen Änderungen: Die Pflanze hat eine Höhe von " + plant.getHeight() + " cm.");

        // Frage : 1.4
        // 1)- Diese Variable sind Teil des Objekts, deswegen können wir durch die Methode grow () die Werte direkt ändern
        // und wir können das realistische Wachstum der Pflänze ansehen.

        // 2)- Ohne Instanzvariablen hat die Methode kein Zugriff auf das Objekt.Das heißt er verliert die Fähigkeit,
        // seinen eigenen Zustand zu manipulieren, und es ist gegen Prinzipien der objektorientierten Programmierung,
        // führt zu komplizierterem Code und erhöht die Fehleranfälligkeit.

        // 3)-

        // 4)- obwohl der Wert negativ ist, verändert sich immer den Zahl, Wir können einen if-else conditions umsetzen

        // Frage : 2.1.2 Wassermengen
        System.out.println("-------------------------------------------------");
        System.out.println("Vor der Veränderung der Wassermenge, die Pflanze enthält : " +  plant.getWaterLevel() + "ml");

        plant.water(30);
        plant.water(80);
        plant.water(100);


        System.out.println("Nach allen Änderungen:  Die Wassermessung zeigt :  " + plant.getWaterLevel() + " ml");

        System.out.println("--------------------------------------------------");
        System.out.println("Braucht die Pflanze Wasser ? ");
        if(plant.needsWater()){
            System.out.println("Die Pflanze braucht Wasser. Wir geben 3 Einheiten Waaser.");
            plant.water(3);
        } else{
            System.out.println("Die Pflanze braucht kein Wasser.");
        }

        System.out.println("Wasserstand nach Prüfung: " + plant.getWaterLevel() + " ml");

        // Frage 2.4
        // 1) - Die Parameter amout in der Methode erlaubt mit verschiedene EingabeWerten zu arbeiten,
        // anstatt mit einer Feste Menge.
        //      - Wiederverwendbarkeit: . B. eine kleine Pflanze, die weniger Wasser benötigt,
        //      oder eine größere Pflanze, die mehr Wasser braucht

        // 2)- Unterschied:

        //      - Methode mit Rückgabewert(return): das Ergebnis kann weiter verarbeitet werden.
        //            dieser Methode ist geeignet für Berechnungen, Prüfungen , Datenabruf
        //      - Methode ohne Rückgabewert(void): führt eine Aktion aber gibt zurück keine Ergebnis.

        // 3)- Rückgabe True or False:
        //          true: das Wasserstand(waterLevel) unter dem definierten wert (5) liegt.
        //                    -> Die Pflanze hat Durst
        //          false: waterLevel ist gleich oder über den Wert(5) liegt.
        //                    -> Die Pflanze hat ausreichend Wasser.

        // 4)- Integration mit Sensoren:n Kombination mit echten Feuchtigkeitssensoren könnte
        // die Methode den tatsächlichen Wasserstand messen und das Ergebnis an ein Backend schicken, das weitere Aktionen auslöst.

        // frage 3.4 Test der Setter mit ungültigen Werten
        System.out.println("--------------------------------");
        plant.setHeight(-5.0);                  // Negative Höhe
        plant.setWaterLevel(-3);                // Negativer Wasserstand
        plant.setWaterLevel(-3);                // Über maximalen Wasserstand


        System.out.println("------ Nach dem ungültige Werte zu setzen ---------- ");
        System.out.println("Hohe der Pflanze : " + plant.getWaterLevel() + " cm");
        System.out.println("Wasserstand der Pflanze " + plant.getWaterLevel() + " ml");
        System.out.println("Type der Pflanze : " + plant.getType());

        // Frage 3.5
        // 1) - Schutzt für die Instanz variable , dass sie nur durch die Methode Getter und setter abgeruft werden können.
        //     -Erhöhung der Sicherheit, Wartbarkeit der Code.
        //     - Änderung an der interne Implementierung vorgenommen werden können.
        // 2) - In komplexen Anwendungen, wie Datenbanken oder APIs, werden Getter oft verwendet, um Daten zu exportieren,
        //      ohne den internen Zustand zu ändern.
        // 3) - Vorteile Setter-Methode: Vermeidung logischer Fehler, Logische Fehler, wie z. B. eine zu große Wassermenge,
        //      können verhindert werden, bevor sie das System beeinträchtigen.
        // 4) - Folgen eines negativen height-Werts: fehlerhafte Berechnungen: Andere Methoden,
        //      die height verwenden (z. B. zur Berechnung des Wachstums), könnten fehlerhaft funktionieren.
        //      - Mit einer private-Deklaration können Änderungen nur über Setter-Methoden erfolgen, die Validierungen enthalten.

        // Initialisierung und Deklarationen:
        System.out.println("----------------------------");
        System.out.println("Sind Sie gleich , height1 und height2 :");
        // Deklaration und Initialisierung der Variablen
        double height1 = 15.5;
        double height2 = 15.5;

        // Vergleich der beiden Variablen mit ==
        boolean areHeightsEqual = (height1 == height2);

        // Ausgabe des Ergebnisses mit erklärendem Text
        System.out.println("Es ist  " + areHeightsEqual);

        // Frage 4.2
        // Der == Operator vergleicht die tatsächlichen Werte der Variablen.

        // Frage 4.3 Objekt mit Equals
        System.out.println("-------------------------------------------------");
         Plant plant1 = new Plant();
         Plant plant2 = new Plant();

         plant1.setType("cactus");
         plant1.setType("rose");

        System.out.println("ist plant1 gleich plant2 durch den Equals Methode ?");
        boolean isEqual = plant1.equals(plant2);
        System.out.println(isEqual);
        // equals() ist besonders nützlich, wenn es darum geht, Inhalte in einer realen Anwendung zu vergleichen.

        // frage 4.4
        // 1) - Primitives wie double, int, oder char speichern direkt den Wert im Speicher.
        //      Der Operator == vergleicht daher den tatsächlichen numerischen oder logischen Wert.
        //      Objekte werden im Speicher als Referenzen gespeichert, die auf ihre Speicheradresse zeigen.
        //      Mit == vergleicht man daher die Referenzen und nicht die Inhalte der Objekte.
        // 2)-
        // 3) - equals() ist speziell dafür gedacht, Inhalte zu vergleichen, anstatt Referenzen. Sie stellt sicher,
        //      dass zwei Objekte als “gleich” gelten, wenn ihre wesentlichen Eigenschaften übereinstimmen.
        //      String-Objekte : Die equals()-Methode in der String-Klasse überprüft die Gleichheit jedes einzelnen Zeichens in den beiden Strings.
        //      Sie vergleicht also deren Inhalte statt ihrer Referenzen.
        // 4) - Überschreibung anwenden durch die Methode : @Override











    }
}
