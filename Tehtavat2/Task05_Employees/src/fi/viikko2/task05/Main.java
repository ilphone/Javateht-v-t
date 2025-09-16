/**
 * Tehtävä 5 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Employee[] ja laske palkkasumma.
 *  2. Tulosta tiedot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class Main {
    public static void main(String[] args) {
        Employee[] payroll = {
            new HourlyEmployee("Ilari", 10, 160),
            new SalariedEmployee("Pekka", 5000)
        };

        double total=0;
        for(Employee e: payroll){
            total += e.monthlyPay();
        }

        System.out.println(total);

    }
}