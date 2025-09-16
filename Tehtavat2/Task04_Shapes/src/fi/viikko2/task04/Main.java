/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(3, 4),
            new Circle(2),
            new Rectangle(5, 6),
            new Circle(3)
        };

        double totalArea = 0;
        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println(s.area());
            totalArea += s.area();
        }

        System.out.println("Kokonaispinta-ala: " + totalArea);
    }
}