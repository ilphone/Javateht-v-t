/**
 * Tehtävä 2 – Metodien ylikuormitus (sum, min, max, taulukot)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Toteuta sum(int,int), sum(int,int,int), sum(int[]), sum(double[]).
 *  2. Toteuta max(int[]) ja min(int[]).
 *
 * VINKIT:
 *  - Käy taulukko silmukalla; varo tyhjiä taulukoita.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class MathUtil {

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int sum(int[] nums){
        int total = 0;
        for(int i : nums){
            total += i;
        }
        return total;
    }
    public static double sum(double[] nums){
        double total = 0;
        for (double i : nums){
            total += i;
        }
        return total;
    }

    public static int max(int[] nums){
        int maksimi = 0;
        for(int i : nums){
            if(i>maksimi) maksimi = i;
        }
        return maksimi;
    }

    public static int min(int[] nums){
        int minimi = nums[0];
        for(int i : nums){
            if(i<minimi){
                minimi = i;
            }
        }
        return minimi;
    }


    public static int placeholderInt(){ return 0; }
    public static double placeholderDouble(){ return 0.0; }

    
}