/**
 * Tehtävä 4 – Rectangle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: width, height.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Muista @Override.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }


    @Override
    public double area(){ 
        if(width < 0 || height < 0){
            return 0.0;
        }
        return width*height;
    }

    @Override
    public String toString(){ 
        return "Rectangle{width="+width+ ",height="+height+"}";
    }

    @Override
    public boolean equals(Object o){ 
        if(this==o) return true;
        if(!(o instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) o;
        return Double.compare(width, other.width) == 0 && Double.compare(height, other.height) == 0;
    }
}